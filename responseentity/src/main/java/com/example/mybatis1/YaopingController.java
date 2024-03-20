package com.example.mybatis1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class YaopingController {
    @Autowired
    private YaopingService yaopingService;

    //查找所有药品
    @GetMapping("/drugs")
    public ModelAndView findAllDrugs() {
        List<yaoping> drugs = yaopingService.findAllDrugs();
        ModelAndView mv = new ModelAndView();
        mv.addObject("drugs", drugs);
        mv.setViewName("druglist");
        return mv;
    }

    //查找指定编号的图书
    @GetMapping("/drugs/{drug_id}")
    public ModelAndView findStudentById(@PathVariable("drug_id") int drug_id) {
        yaoping yaoping = yaopingService.findDrugsById(drug_id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("drugs", yaoping);
        mv.setViewName("drugdetail");
        return mv;
    }

    //添加新书
    @PostMapping("/addDrug")
    public ModelAndView addDrug(yaoping yaoping) {
        yaopingService.addDrugs(yaoping);
        ModelAndView mv = new ModelAndView();
//添加成功后跳转到查找所有学生的控制器
        mv.setViewName("redirect:/drugs");
        return mv;
    }

    //添加新书视图界面
    @GetMapping("/addDrug")
    public String addDrug() {
        return "adddrug";
    }

    //根据编号删除图书
    @GetMapping("/deleteDrug/{drug_id}")
    public ModelAndView deleteBook(@PathVariable("drug_id") int drug_id) {
        yaopingService.deleteDrugs(drug_id);
        ;
        ModelAndView mv = new ModelAndView();
//删除成功后跳转到查找所有学生的控制器
        mv.setViewName("redirect:/drugs");
        return mv;
    }

    //修改图书视图界面
    @GetMapping("/toupdatedrug/{drug_id}")
    public ModelAndView toUpdateDrug(@PathVariable("drug_id") int drug_id){
    yaoping yaoping = yaopingService.findDrugsById(drug_id);
    ModelAndView mv = new ModelAndView();
    mv.addObject("drug",yaoping);
    mv.setViewName("updateDrug");
    return mv;
}
    //修改图书动作
    @PostMapping ("/updateDrug")
    public ModelAndView UpdateDrug (yaoping yaoping) {
        yaopingService.updateDrugs(yaoping);
        ModelAndView mv = new ModelAndView();
    //修改成功后跳转到查找所有学生的控制器
        mv.setViewName("redirect:/drugs");
        return mv;
    }
}
