package com.example.demo.controller.liuchengen;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Producttypestair;
import com.example.demo.service.liuchengenimp.ProductTypeServiceImp;
import com.example.demo.util.FileUtil;

@RestController
@CrossOrigin
public class ProductTypeController {
	@Autowired
	private ProductTypeServiceImp productTypeServiceImp;

	@PostMapping("/selectProductTypes")
	public Object selectProductTypes() {
		return productTypeServiceImp.selectProductTypes();
	}

	// 查询类别
	@PostMapping("/selectProductTypesYIJI")
	public Map<String, Object> selectProductTypesYIJI(Integer pid) {
		if (pid == 0) {
			pid = null;
		}
		List<Producttypestair> selectProductTypesYIJI = productTypeServiceImp.selectProductTypesYIJI(pid);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("data", selectProductTypesYIJI);
		return map;
	}

	@Value("${file.uploadFolder}")
	private String uploadFolder;

	@PostMapping("/insertProductType")
	public Map<String,Object> insertProductType(FileUtil fileUtil) {
		String fileUrl = fileUpload(fileUtil, true);
		Producttypestair producttypestair = new Producttypestair();
		producttypestair.setPid(fileUtil.getPid());
		producttypestair.setProducttypestairname(fileUtil.getProducttypestairname());
		producttypestair.setUrl(fileUrl);
		Producttypestair insertProductType = productTypeServiceImp.insertProductType(producttypestair);
		Map<String, Object> file = this.file(insertProductType);
		System.out.println(file);
		return file;
	}
	 /**
     * 文件上传，随机UUID
     * @param fileUtil 上传的实体
     * @param b 判断是用随机的uuid还是文件的名称,默认为UUID
     * @return 上传的URL地址
     */
    public String fileUpload(FileUtil fileUtil,boolean b) {
        if (fileUtil.getFile()==null) {
            return null;
        }
        //随机一个id
        String name = fileUtil.getFile().getOriginalFilename();
        if (b) {   //判断是否用什么命名，true为UUID，false为上传文件的全名称
            //获取文件的后缀
            String[] split = name.split("\\.");     //  匹配小数点（.）必须转义，否则split方法无效
            name = UUID.randomUUID().toString().replaceAll("-", "")+"."+split[split.length-1];
        }
        //上传文件路径
        String fileUrl = this.uploadFolder+"/"+name;
        File file = new File(fileUrl);
        try {
        	fileUtil.getFile().transferTo(file);
        } catch (IOException e) {
            fileUrl = null;
        }
        return fileUrl;
    }
    /**
     * 返回是否上传成功的参数
     * @param url
     * @return
     */
    public Map<String,Object> file(Producttypestair producttypestair){
    	Map<String,Object> map = new HashMap<String,Object>();
        if (producttypestair==null) {
            map.put("msg","上传失败");
            map.put("code",500);
            return map;
        }
        map.put("msg","上传成功");
        map.put("code",200);
        return map;
    }
    
    //删除类别
    @PostMapping("/deleteTypeById")
    public Integer deleteTypeById(Integer id) {
    	return productTypeServiceImp.deleteTypeById(id);
    }
}
