/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Models.UserContext;

/**
 *
 * @author MSI
 */
public class BaseController {
    
    UserContext userContext;
    
    public BaseController(UserContext userContext) {
         
    }
      public BaseController() {
         
    }
     public UserContext getUserContext() 
        {
            return userContext;
        }

        public void setUserContext(UserContext userContext) {
            this.userContext = userContext;
        }
    
}
