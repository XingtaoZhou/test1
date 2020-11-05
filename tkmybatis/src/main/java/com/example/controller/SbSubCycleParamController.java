package com.example.controller;

import com.example.entity.ActivityModel;
import com.example.entity.SbSubCycleParam;
import com.example.service.SbSubCycleParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SbSubCycleParamController {


    @Autowired
    private SbSubCycleParamService sbSubCycleParamService;

    @RequestMapping("/index1")
    public ModelAndView index(HttpServletRequest request, String legalPersonCode) {
        ModelAndView mv = new ModelAndView();
        //根据legalPersonCode查询数据库，返回list
        List<SbSubCycleParam> list = new ArrayList<>();
        list = sbSubCycleParamService.queryOne(legalPersonCode);
        mv.addObject("list", list);
        mv.setViewName("index1");
        return mv;
    }

    /*@RequestMapping("/save")
    @ResponseBody
    public String save(SbSubCycleParam sbSubCycleParam) {

        Short cardType = sbSubCycleParam.getCardType();
        Short subFor = sbSubCycleParam.getSubFor();
        Integer walletNo = sbSubCycleParam.getWalletNo();
        //确定卡的唯一性，根据卡类型cardType,发放依据subFor,发放钱包walletNo确定
        List<SbSubCycleParam> list = sbSubCycleParamService.queryByExample(cardType, subFor, walletNo);
        if (list.size() == 1) {
            //返回一条数据，更新数据
            sbSubCycleParamService.updateOne(sbSubCycleParam);
        } else if (list.size() > 1) {
            //返回多条数据，不符合条件
        } else if (list.size() == 0) {
            //数据库没有此数据，添加数据
            sbSubCycleParamService.insertOne(sbSubCycleParam);
        }
        return "success";
    }*/

    /**
     * 接受前端的list集合时，后端要用一个封装类 @RequestBody ActivityModel model
     * @param model
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @RequestMapping("/save")
    @ResponseBody
    public String  save(@RequestBody ActivityModel model){
        //ModelAndView mv = new ModelAndView();
        List<SbSubCycleParam> sbSubCycleParams = model.getSbSubCycleParams();
        for (SbSubCycleParam sbSubCycleParam : sbSubCycleParams){
            Short cardType = sbSubCycleParam.getCardType();
            Short subFor = sbSubCycleParam.getSubFor();
            Integer walletNo = sbSubCycleParam.getWalletNo();
            //确定卡的唯一性，根据卡类型cardType,发放依据subFor,发放钱包walletNo确定
            List<SbSubCycleParam> list =sbSubCycleParamService.queryByExample(cardType, subFor, walletNo);
            if (list.size() == 1){
                //返回一条数据，更新数据
                sbSubCycleParamService.updateOne(sbSubCycleParam);
            } else if (list.size() > 1){
                //返回多条数据，不符合条件

            } else if (list.size() == 0){
                //数据库没有此数据，添加数据
                sbSubCycleParamService.insertOne(sbSubCycleParam);
            }
        }
        //mv.setViewName();
        return "success";
    }
}













