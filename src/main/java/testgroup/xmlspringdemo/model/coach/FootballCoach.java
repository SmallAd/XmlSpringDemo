/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgroup.xmlspringdemo.model.coach;

import testgroup.xmlspringdemo.service.FortuneService;


public class FootballCoach implements Coach {
    
   private FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes to train shots";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
}
