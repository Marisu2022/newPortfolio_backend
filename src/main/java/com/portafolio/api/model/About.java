
package com.portafolio.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class About {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String about_me;
            
    public About(){
    
}
   public About(Long id,String about_me){
            this.id =id;
            this.about_me = about_me;
}
  
   

   

    

}

    

