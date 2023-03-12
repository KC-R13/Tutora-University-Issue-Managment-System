/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author MSI
 */
public class UserContext {
    
         String name; 
         String id; 
         String depatrment; 
         
         
        public UserContext(String name  ) {
            this.name = name; 
        }
             public UserContext() {
            this.name = name; 
        }
         public String getName() 
        {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }      
        
        public String getID() 
        {
            return id;
        }

        public void setID(String id) {
            this.id = id;
        }
 
}
