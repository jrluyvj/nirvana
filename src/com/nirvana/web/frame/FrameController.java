package com.nirvana.web.frame;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nirvana.web.BaseController;


@Controller("frameController")
@RequestMapping("/frame")
public class FrameController extends BaseController {

	@RequestMapping("/index")
	public ModelAndView index(){
		
		ModelAndView mv = getModelAndView();
		
		
		mv.setViewName("frame/frame_main");
		return mv;
	}
	
}
