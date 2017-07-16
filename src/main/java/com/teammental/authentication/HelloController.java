package com.teammental.authentication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Deneme için Hello controller.
 */
@Controller
public class HelloController {

  /**
   * Örnek index sayfasını getiren metod.
   * @return index.html sayfası
   */
  @RequestMapping({"/","/index"})
  public String getIndex() {
    return "index";
  }

}
