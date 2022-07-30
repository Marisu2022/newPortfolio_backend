/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portafolio.api.Service;

import com.portafolio.api.model.Experience;
import java.util.List;



public interface IExperienceService {
    public List<Experience>verExperience();
    public void crearExperience(Experience exp);
    public void borrarExperience(Long id);
    public Experience findExperience(Long id);
}
