/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portafolio.api.Service;

import com.portafolio.api.model.Education;
import java.util.List;

public interface IEducationService {
    public List<Education>verEducation();
    public void crearEducation(Education edu);
    public void borrarEducation(Long id);
    public Education findEducation(Long id);

}
