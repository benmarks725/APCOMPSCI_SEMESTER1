public class FinalProject
{
    public static void main (String[]args)
    {
        System.out.println("NCAA 2016-2017 BMI(Ben Marks Index)\n");

        double gonzagawins = 37;
        double gonzagagamesplayed = 39;
        double gonzagawinpercentage = 0;
        double gonzagapointsscored = 3222;
        double gonzagappg = 0;
        double gonzagapointsallowed = 2398;
        double gonzagapapg = 0;
        double gonzagafgm = 1149;
        double gonzagafga = 2281;
        double gonzagafgptg = 0;
        double gonzaga2ptfgm = 863;
        double gonzaga2ptfga = 1531;
        double gonzaga2ptfgptg = 0;
        double gonzaga3ptfgm = 286;
        double gonzaga3ptfga = 749;
        double gonzaga3ptfgptg = 0;
        double gonzagaassists = 595;
        double gonzagaassistspergame = 0;
        double gonzagaassistsperfgm = 0;
        double gonzagaassiststoturnoverratio = 0;
        double gonzagaturnovers = 448;
        double gonzagaturnoverspergame = 0;
        double gonzagablocks = 183;
        double gonzagablockspergame = 0;
        double gonzagasteals = 265;
        double gonzagastealspergame = 0;
        double gonzagafta = 890;
        double gonzagaftm = 638;
        double gonzagaturnoverpercentage = 0;
        double gonzagaftpercentage = 0;
        double gonzagarebounds = 1587;
        double gonzagaoffrebounds = 378;
        double gonzagadefrebounds = 1209;
        double gonzagareboundspergame = 0;
        double gonzagaoffreboundspergame = 0;
        double gonzagadefreboundspergame = 0;
        double gonzagapossessions = 0;
        double gonzagaoppfga = 2400;
        double gonzagaoppfta = 646;
        double gonzagaopporb = 421;
        double gonzagatoforced = 475;
        double gonzagadefrating = 0;
        double gonzagaeffectivefgpercentage = 0;
        double gonzagateamgamescore = 0;
        double gonzagafouls = 660;
        double gonzaganetrating = 0;
        double gonzagaoffensiverating = 0;
        double gonzagapace = 0;
        double gonzagaminutesplayed = 7800;
        double gonzagatrueshootingpercentage = 0;
        gonzagawinpercentage = (gonzagawins/gonzagagamesplayed)*100;
        gonzagappg = (gonzagapointsscored/gonzagagamesplayed);
        gonzagapapg = (gonzagapointsallowed/gonzagagamesplayed);
        gonzagafgptg = (gonzagafgm/gonzagafga)*100;
        gonzaga2ptfgptg = (gonzaga2ptfgm/gonzaga2ptfga)*100;
        gonzaga3ptfgptg = (gonzaga3ptfgm/gonzaga3ptfga)*100;
        gonzagaassistspergame = (gonzagaassists/gonzagagamesplayed);
        gonzagaassistsperfgm = (gonzagaassists/gonzagafgm);
        gonzagaassiststoturnoverratio = (gonzagaassists/gonzagaturnovers);
        gonzagablockspergame = (gonzagablocks/gonzagagamesplayed);
        gonzagastealspergame = (gonzagasteals/gonzagagamesplayed);
        gonzagaturnoverspergame = (gonzagaturnovers/gonzagagamesplayed);
        gonzagaturnoverpercentage = (100*gonzagaturnovers)/(gonzagafga+(0.475*gonzagafta)+gonzagaturnovers);
        gonzagaftpercentage = (gonzagaftm/gonzagafta)*100;
        gonzagareboundspergame = (gonzagarebounds/gonzagagamesplayed);
        gonzagaoffreboundspergame = (gonzagaoffrebounds/gonzagagamesplayed);
        gonzagadefreboundspergame = (gonzagadefrebounds/gonzagagamesplayed);
        gonzagapossessions = (0.5 * (gonzagafga + (0.475 * gonzagafta) - gonzagaoffrebounds + gonzagaturnovers) + 0.5 * (gonzagaoppfga + (0.475 * gonzagaoppfta) - gonzagaopporb + gonzagatoforced));
        gonzagadefrating = 100*(gonzagapointsallowed/gonzagapossessions);
        gonzagaeffectivefgpercentage = ((gonzagafgm+(0.5*gonzaga3ptfgm))/gonzagafga)*100;
        gonzagateamgamescore = ((gonzagapointsscored + (0.4 * gonzagafgm) - (0.7 * gonzagafga) - (0.4*(gonzagafta - gonzagaftm)) + (0.7 * gonzagaoffrebounds) + (0.3 * gonzagadefrebounds) + gonzagasteals + (0.7 * gonzagaassists) + (0.7 * gonzagablocks) - (0.4 * gonzagafouls) - gonzagaturnovers)/8)/gonzagagamesplayed;
        gonzaganetrating = 100 * ((gonzagapointsscored - gonzagapointsallowed) / gonzagapossessions);
        gonzagaoffensiverating = 100 * (gonzagapointsscored / gonzagapossessions);
        gonzagapace = 40 * (gonzagapossessions / (0.2 * gonzagaminutesplayed));
        gonzagatrueshootingpercentage = (gonzagapointsscored / (2 * (gonzagafga + 0.475 * gonzagafta)))*100;
        System.out.println("Gonzaga:\n" + gonzagawinpercentage + "% Win Percentage\n" + gonzagappg +
                " Points Per Game\n"+gonzagapapg+ " Points Allowed Per Game\n"+gonzagafgptg+
                "% Field Goal Percentage\n"+gonzaga2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +gonzaga3ptfgptg+"% 3 Point Field Goal Percentage\n"+gonzagaassistspergame+" Assists Per Game\n"+
                gonzagaassistsperfgm+" Assists Per FGM\n"+ gonzagaassiststoturnoverratio+" Assists : TO Ratio\n"+
                gonzagablockspergame+" Blocks Per Game\n"+gonzagastealspergame+" Steals Per Game\n"+
                gonzagaturnoverspergame+" TO Per Game\n"+gonzagaturnoverpercentage+" TO%\n"+ gonzagaftpercentage+" FT%\n"+
                gonzagareboundspergame+" Rebounds Per Game\n"+gonzagaoffreboundspergame+" Offensive Rebounds Per game\n"+
                gonzagadefreboundspergame+" Defensive Rebounds Per Game\n"+gonzagapossessions+" Possessions\n"+
                gonzagadefrating+" Defensive Rating\n"+gonzagaeffectivefgpercentage+" EFG%\n"+gonzagateamgamescore+" Team Game Score\n"
                +gonzaganetrating+" Net Rating\n"+gonzagaoffensiverating+" Offensive Rating\n"+gonzagapace+" Pace\n"+gonzagatrueshootingpercentage+" True Shooting Percentage");

     double northcarolinawins = 33;
     double northcarolinagamesplayed = 40;
     double northcarolinawinpercentage = 0;
     double northcarolinapointsscored = 3377;
     double northcarolinappg = 0;
     double northcarolinapointsallowed = 2824;
     double northcarolinapapg = 0;
     double northcarolinafgm = 1226;
     double northcarolinafga = 2633;
     double northcarolinafgptg = 0;
     double northcarolina2ptfgm = 943;
     double northcarolina2ptfga = 1835;
     double northcarolina2ptfgptg = 0;
     double northcarolina3ptfgm = 283;
     double northcarolina3ptfga = 798;
     double northcarolina3ptfgptg = 0;
     double northcarolinaassists = 722;
     double northcarolinaassistspergame = 0;
     double northcarolinaassistsperfgm = 0;
     double northcarolinaassiststoturnoverratio = 0;
     double northcarolinaturnovers = 473;
     double northcarolinaturnoverspergame = 0;
     double northcarolinablocks = 139;
     double northcarolinablockspergame = 0;
     double northcarolinasteals = 283;
     double northcarolinastealspergame = 0;
     double northcarolinafta = 916;
     double northcarolinaftm = 642;
     double northcarolinaturnoverpercentage = 0;
     double northcarolinaftpercentage = 0;
     double northcarolinarebounds = 1748;
     double northcarolinaoffrebounds = 621;
     double northcarolinadefrebounds = 1127;
     double northcarolinareboundspergame = 0;
     double northcarolinaoffreboundspergame = 0;
     double northcarolinadefreboundspergame = 0;
     double northcarolinapossessions = 0;
     double northcarolinaoppfga = 2377;
     double northcarolinaoppfta = 746;
     double northcarolinaopporb = 362;
     double northcarolinatoforced = 544;
     double northcarolinadefrating = 0;
     double northcarolinaeffectivefgpercentage = 0;
     double northcarolinateamgamescore = 0;
     double northcarolinafouls = 711;
     double northcarolinanetrating = 0;
     double northcarolinaoffensiverating = 0;
     double northcarolinapace = 0;
     double northcarolinaminutesplayed = 8025;
     double northcarolinatrueshootingpercentage = 0;
     northcarolinawinpercentage = (northcarolinawins/northcarolinagamesplayed)*100;
     northcarolinappg = (northcarolinapointsscored/northcarolinagamesplayed);
     northcarolinapapg = (northcarolinapointsallowed/northcarolinagamesplayed);
     northcarolinafgptg = (northcarolinafgm/northcarolinafga)*100;
     northcarolina2ptfgptg = (northcarolina2ptfgm/northcarolina2ptfga)*100;
     northcarolina3ptfgptg = (northcarolina3ptfgm/northcarolina3ptfga)*100;
     northcarolinaassistspergame = (northcarolinaassists/northcarolinagamesplayed);
     northcarolinaassistsperfgm = (northcarolinaassists/northcarolinafgm);
     northcarolinaassiststoturnoverratio = (northcarolinaassists/northcarolinaturnovers);
     northcarolinablockspergame = (northcarolinablocks/northcarolinagamesplayed);
     northcarolinastealspergame = (northcarolinasteals/northcarolinagamesplayed);
     northcarolinaturnoverspergame = (northcarolinaturnovers/northcarolinagamesplayed);
     northcarolinaturnoverpercentage = (100*northcarolinaturnovers)/(northcarolinafga+(0.475*northcarolinafta)+northcarolinaturnovers);
     northcarolinaftpercentage = (northcarolinaftm/northcarolinafta)*100;
     northcarolinareboundspergame = (northcarolinarebounds/northcarolinagamesplayed);
     northcarolinaoffreboundspergame = (northcarolinaoffrebounds/northcarolinagamesplayed);
     northcarolinadefreboundspergame = (northcarolinadefrebounds/northcarolinagamesplayed);
     northcarolinapossessions = (0.5 * (northcarolinafga + (0.475 * northcarolinafta) - northcarolinaoffrebounds + northcarolinaturnovers) + 0.5 * (northcarolinaoppfga + (0.475 * northcarolinaoppfta) - northcarolinaopporb + northcarolinatoforced));
     northcarolinadefrating = 100*(northcarolinapointsallowed/northcarolinapossessions);
     northcarolinaeffectivefgpercentage = ((northcarolinafgm+(0.5*northcarolina3ptfgm))/northcarolinafga)*100;
     northcarolinateamgamescore = ((northcarolinapointsscored + (0.4 * northcarolinafgm) - (0.7 * northcarolinafga) - (0.4*(northcarolinafta - northcarolinaftm)) + (0.7 * northcarolinaoffrebounds) + (0.3 * northcarolinadefrebounds) + northcarolinasteals + (0.7 * northcarolinaassists) + (0.7 * northcarolinablocks) - (0.4 * northcarolinafouls) - northcarolinaturnovers)/8)/northcarolinagamesplayed;
     northcarolinanetrating = 100 * ((northcarolinapointsscored - northcarolinapointsallowed) / northcarolinapossessions);
     northcarolinaoffensiverating = 100 * (northcarolinapointsscored / northcarolinapossessions);
     northcarolinapace = 40 * (northcarolinapossessions / (0.2 * northcarolinaminutesplayed));
     northcarolinatrueshootingpercentage = (northcarolinapointsscored / (2 * (northcarolinafga + 0.475 * northcarolinafta)))*100;
     System.out.println("\nNorth Carolina:\n" + northcarolinawinpercentage + "% Win Percentage\n" + northcarolinappg +
             " Points Per Game\n"+northcarolinapapg+ " Points Allowed Per Game\n"+northcarolinafgptg+
             "% Field Goal Percentage\n"+northcarolina2ptfgptg+"% 2 Point Field Goal Percentage\n"
             +northcarolina3ptfgptg+"% 3 Point Field Goal Percentage\n"+northcarolinaassistspergame+" Assists Per Game\n"+
             northcarolinaassistsperfgm+" Assists Per FGM\n"+ northcarolinaassiststoturnoverratio+" Assists : TO Ratio\n"+
             northcarolinablockspergame+" Blocks Per Game\n"+northcarolinastealspergame+" Steals Per Game\n"+
             northcarolinaturnoverspergame+" TO Per Game\n"+northcarolinaturnoverpercentage+" TO%\n"+ northcarolinaftpercentage+" FT%\n"+
             northcarolinareboundspergame+" Rebounds Per Game\n"+northcarolinaoffreboundspergame+" Offensive Rebounds Per game\n"+
             northcarolinadefreboundspergame+" Defensive Rebounds Per Game\n"+northcarolinapossessions+" Possessions\n"+
             northcarolinadefrating+" Defensive Rating\n"+northcarolinaeffectivefgpercentage+" EFG%\n"+northcarolinateamgamescore+" Team Game Score\n"
             +northcarolinanetrating+" Net Rating\n"+northcarolinaoffensiverating+" Offensive Rating\n"+northcarolinapace+" Pace\n"+ northcarolinatrueshootingpercentage+" True Shooting Percentage");

     double westvirginiawins = 28;
     double westvirginiagamesplayed = 37;
     double westvirginiawinpercentage = 0;
     double westvirginiapointsscored = 3014;
     double westvirginiappg = 0;
     double westvirginiapointsallowed = 2467;
     double westvirginiapapg = 0;
     double westvirginiafgm = 1059;
     double westvirginiafga = 2333;
     double westvirginiafgptg = 0;
     double westvirginia2ptfgm = 784;
     double westvirginia2ptfga = 1574;
     double westvirginia2ptfgptg = 0;
     double westvirginia3ptfgm = 275;
     double westvirginia3ptfga = 759;
     double westvirginia3ptfgptg = 0;
     double westvirginiaassists = 607;
     double westvirginiaassistspergame = 0;
     double westvirginiaassistsperfgm = 0;
     double westvirginiaassiststoturnoverratio = 0;
     double westvirginiaturnovers = 455;
     double westvirginiaturnoverspergame = 0;
     double westvirginiablocks = 176;
     double westvirginiablockspergame = 0;
     double westvirginiasteals = 371;
     double westvirginiastealspergame = 0;
     double westvirginiafta = 907;
     double westvirginiaftm = 621;
     double westvirginiaturnoverpercentage = 0;
     double westvirginiaftpercentage = 0;
     double westvirginiarebounds = 1387;
     double westvirginiaoffrebounds = 528;
     double westvirginiadefrebounds = 859;
     double westvirginiareboundspergame = 0;
     double westvirginiaoffreboundspergame = 0;
     double westvirginiadefreboundspergame = 0;
     double westvirginiapossessions = 0;
     double westvirginiaoppfga = 1948;
     double westvirginiaoppfta = 827;
     double westvirginiaopporb = 393;
     double westvirginiatoforced = 740;
     double westvirginiadefrating = 0;
     double westvirginiaeffectivefgpercentage = 0;
     double westvirginiateamgamescore = 0;
     double westvirginiafouls = 756;
     double westvirginianetrating = 0;
     double westvirginiaoffensiverating = 0;
     double westvirginiapace = 0;
     double westvirginiaminutesplayed = 7525;
     double westvirginiatrueshootingpercentage = 0;
     westvirginiawinpercentage = (westvirginiawins/westvirginiagamesplayed)*100;
     westvirginiappg = (westvirginiapointsscored/westvirginiagamesplayed);
     westvirginiapapg = (westvirginiapointsallowed/westvirginiagamesplayed);
     westvirginiafgptg = (westvirginiafgm/westvirginiafga)*100;
     westvirginia2ptfgptg = (westvirginia2ptfgm/westvirginia2ptfga)*100;
     westvirginia3ptfgptg = (westvirginia3ptfgm/westvirginia3ptfga)*100;
     westvirginiaassistspergame = (westvirginiaassists/westvirginiagamesplayed);
     westvirginiaassistsperfgm = (westvirginiaassists/westvirginiafgm);
     westvirginiaassiststoturnoverratio = (westvirginiaassists/westvirginiaturnovers);
     westvirginiablockspergame = (westvirginiablocks/westvirginiagamesplayed);
     westvirginiastealspergame = (westvirginiasteals/westvirginiagamesplayed);
     westvirginiaturnoverspergame = (westvirginiaturnovers/westvirginiagamesplayed);
     westvirginiaturnoverpercentage = (100*westvirginiaturnovers)/(westvirginiafga+(0.475*westvirginiafta)+westvirginiaturnovers);
     westvirginiaftpercentage = (westvirginiaftm/westvirginiafta)*100;
     westvirginiareboundspergame = (westvirginiarebounds/westvirginiagamesplayed);
     westvirginiaoffreboundspergame = (westvirginiaoffrebounds/westvirginiagamesplayed);
     westvirginiadefreboundspergame = (westvirginiadefrebounds/westvirginiagamesplayed);
     westvirginiapossessions = (0.5 * (westvirginiafga + (0.475 * westvirginiafta) - westvirginiaoffrebounds + westvirginiaturnovers) + 0.5 * (westvirginiaoppfga + (0.475 * westvirginiaoppfta) - westvirginiaopporb + westvirginiatoforced));
     westvirginiadefrating = 100*(westvirginiapointsallowed/westvirginiapossessions);
     westvirginiaeffectivefgpercentage = ((westvirginiafgm+(0.5*westvirginia3ptfgm))/westvirginiafga)*100;
     westvirginiateamgamescore = ((westvirginiapointsscored + (0.4 * westvirginiafgm) - (0.7 * westvirginiafga) - (0.4*(westvirginiafta - westvirginiaftm)) + (0.7 * westvirginiaoffrebounds) + (0.3 * westvirginiadefrebounds) + westvirginiasteals + (0.7 * westvirginiaassists) + (0.7 * westvirginiablocks) - (0.4 * westvirginiafouls) - westvirginiaturnovers)/8)/westvirginiagamesplayed;
     westvirginianetrating = 100 * ((westvirginiapointsscored - westvirginiapointsallowed) / westvirginiapossessions);
     westvirginiaoffensiverating = 100 * (westvirginiapointsscored / westvirginiapossessions);
     westvirginiapace = 40 * (westvirginiapossessions / (0.2 * westvirginiaminutesplayed));
     westvirginiatrueshootingpercentage = (westvirginiapointsscored / (2 * (westvirginiafga + 0.475 * westvirginiafta)))*100;
     System.out.println("\nWest Virginia:\n" + westvirginiawinpercentage + "% Win Percentage\n" + westvirginiappg +
             " Points Per Game\n"+westvirginiapapg+ " Points Allowed Per Game\n"+westvirginiafgptg+
             "% Field Goal Percentage\n"+westvirginia2ptfgptg+"% 2 Point Field Goal Percentage\n"
             +westvirginia3ptfgptg+"% 3 Point Field Goal Percentage\n"+westvirginiaassistspergame+" Assists Per Game\n"+
             westvirginiaassistsperfgm+" Assists Per FGM\n"+ westvirginiaassiststoturnoverratio+" Assists : TO Ratio\n"+
             westvirginiablockspergame+" Blocks Per Game\n"+westvirginiastealspergame+" Steals Per Game\n"+
             westvirginiaturnoverspergame+" TO Per Game\n"+westvirginiaturnoverpercentage+" TO%\n"+ westvirginiaftpercentage+" FT%\n"+
             westvirginiareboundspergame+" Rebounds Per Game\n"+westvirginiaoffreboundspergame+" Offensive Rebounds Per game\n"+
             westvirginiadefreboundspergame+" Defensive Rebounds Per Game\n"+westvirginiapossessions+" Possessions\n"+
             westvirginiadefrating+" Defensive Rating\n"+westvirginiaeffectivefgpercentage+" EFG%\n"+westvirginiateamgamescore+" Team Game Score\n"
             +westvirginianetrating+" Net Rating\n"+westvirginiaoffensiverating+" Offensive Rating\n"+westvirginiapace+" Pace\n"+westvirginiatrueshootingpercentage+" True Shooting Percentage");


        double kentuckywins = 32;
        double kentuckygamesplayed = 38;
        double kentuckywinpercentage = 0;
        double kentuckypointsscored = 3225;
        double kentuckyppg = 0;
        double kentuckypointsallowed = 2716;
        double kentuckypapg = 0;
        double kentuckyfgm = 1134;
        double kentuckyfga = 2396;
        double kentuckyfgptg = 0;
        double kentucky2ptfgm = 867;
        double kentucky2ptfga = 1639;
        double kentucky2ptfgptg = 0;
        double kentucky3ptfgm = 267;
        double kentucky3ptfga = 757;
        double kentucky3ptfgptg = 0;
        double kentuckyassists = 585;
        double kentuckyassistspergame = 0;
        double kentuckyassistsperfgm = 0;
        double kentuckyassiststoturnoverratio = 0;
        double kentuckyturnovers = 443;
        double kentuckyturnoverspergame = 0;
        double kentuckyblocks = 200;
        double kentuckyblockspergame = 0;
        double kentuckysteals = 229;
        double kentuckystealspergame = 0;
        double kentuckyfta = 980;
        double kentuckyftm = 690;
        double kentuckyturnoverpercentage = 0;
        double kentuckyftpercentage = 0;
        double kentuckyrebounds = 1512;
        double kentuckyoffrebounds = 461;
        double kentuckydefrebounds = 1051;
        double kentuckyreboundspergame = 0;
        double kentuckyoffreboundspergame = 0;
        double kentuckydefreboundspergame = 0;
        double kentuckypossessions = 0;
        double kentuckyoppfga = 2309;
        double kentuckyoppfta = 774;
        double kentuckyopporb = 388;
        double kentuckytoforced = 544;
        double kentuckydefrating = 0;
        double kentuckyeffectivefgpercentage = 0;
        double kentuckyteamgamescore = 0;
        double kentuckyfouls = 716;
        double kentuckynetrating = 0;
        double kentuckyoffensiverating = 0;
        double kentuckypace = 0;
        double kentuckyminutesplayed = 7625;
        double kentuckytrueshootingpercentage = 0;
        kentuckywinpercentage = (kentuckywins/kentuckygamesplayed)*100;
        kentuckyppg = (kentuckypointsscored/kentuckygamesplayed);
        kentuckypapg = (kentuckypointsallowed/kentuckygamesplayed);
        kentuckyfgptg = (kentuckyfgm/kentuckyfga)*100;
        kentucky2ptfgptg = (kentucky2ptfgm/kentucky2ptfga)*100;
        kentucky3ptfgptg = (kentucky3ptfgm/kentucky3ptfga)*100;
        kentuckyassistspergame = (kentuckyassists/kentuckygamesplayed);
        kentuckyassistsperfgm = (kentuckyassists/kentuckyfgm);
        kentuckyassiststoturnoverratio = (kentuckyassists/kentuckyturnovers);
        kentuckyblockspergame = (kentuckyblocks/kentuckygamesplayed);
        kentuckystealspergame = (kentuckysteals/kentuckygamesplayed);
        kentuckyturnoverspergame = (kentuckyturnovers/kentuckygamesplayed);
        kentuckyturnoverpercentage = (100*kentuckyturnovers)/(kentuckyfga+(0.475*kentuckyfta)+kentuckyturnovers);
        kentuckyftpercentage = (kentuckyftm/kentuckyfta)*100;
        kentuckyreboundspergame = (kentuckyrebounds/kentuckygamesplayed);
        kentuckyoffreboundspergame = (kentuckyoffrebounds/kentuckygamesplayed);
        kentuckydefreboundspergame = (kentuckydefrebounds/kentuckygamesplayed);
        kentuckypossessions = (0.5 * (kentuckyfga + (0.475 * kentuckyfta) - kentuckyoffrebounds + kentuckyturnovers) + 0.5 * (kentuckyoppfga + (0.475 * kentuckyoppfta) - kentuckyopporb + kentuckytoforced));
        kentuckydefrating = 100*(kentuckypointsallowed/kentuckypossessions);
        kentuckyeffectivefgpercentage = ((kentuckyfgm+(0.5*kentucky3ptfgm))/kentuckyfga)*100;
        kentuckyteamgamescore = ((kentuckypointsscored + (0.4 * kentuckyfgm) - (0.7 * kentuckyfga) - (0.4*(kentuckyfta - kentuckyftm)) + (0.7 * kentuckyoffrebounds) + (0.3 * kentuckydefrebounds) + kentuckysteals + (0.7 * kentuckyassists) + (0.7 * kentuckyblocks) - (0.4 * kentuckyfouls) - kentuckyturnovers)/8)/kentuckygamesplayed;
        kentuckynetrating = 100 * ((kentuckypointsscored - kentuckypointsallowed) / kentuckypossessions);
        kentuckyoffensiverating = 100 * (kentuckypointsscored / kentuckypossessions);
        kentuckypace = 40 * (kentuckypossessions / (0.2 * kentuckyminutesplayed));
        kentuckytrueshootingpercentage = (kentuckypointsscored / (2 * (kentuckyfga + 0.475 * kentuckyfta)))*100;
        System.out.println("\nKentucky:\n" + kentuckywinpercentage + "% Win Percentage\n" + kentuckyppg +
                " Points Per Game\n"+kentuckypapg+ " Points Allowed Per Game\n"+kentuckyfgptg+
                "% Field Goal Percentage\n"+kentucky2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +kentucky3ptfgptg+"% 3 Point Field Goal Percentage\n"+kentuckyassistspergame+" Assists Per Game\n"+
                kentuckyassistsperfgm+" Assists Per FGM\n"+ kentuckyassiststoturnoverratio+" Assists : TO Ratio\n"+
                kentuckyblockspergame+" Blocks Per Game\n"+kentuckystealspergame+" Steals Per Game\n"+
                kentuckyturnoverspergame+" TO Per Game\n"+kentuckyturnoverpercentage+" TO%\n"+ kentuckyftpercentage+" FT%\n"+
                kentuckyreboundspergame+" Rebounds Per Game\n"+kentuckyoffreboundspergame+" Offensive Rebounds Per game\n"+
                kentuckydefreboundspergame+" Defensive Rebounds Per Game\n"+kentuckypossessions+" Possessions\n"+
                kentuckydefrating+" Defensive Rating\n"+kentuckyeffectivefgpercentage+" EFG%\n"+kentuckyteamgamescore+" Team Game Score\n"
                +kentuckynetrating+" Net Rating\n"+kentuckyoffensiverating+" Offensive Rating\n"+kentuckypace+" Pace\n"+kentuckytrueshootingpercentage+" True Shooting Percentage");

        double villanovawins = 32;
        double villanovagamesplayed = 36;
        double villanovawinpercentage = 0;
        double villanovapointsscored = 2779;
        double villanovappg = 0;
        double villanovapointsallowed = 2256;
        double villanovapapg = 0;
        double villanovafgm = 965;
        double villanovafga = 1948;
        double villanovafgptg = 0;
        double villanova2ptfgm = 654;
        double villanova2ptfga = 1105;
        double villanova2ptfgptg = 0;
        double villanova3ptfgm = 311;
        double villanova3ptfga = 843;
        double villanova3ptfgptg = 0;
        double villanovaassists = 505;
        double villanovaassistspergame = 0;
        double villanovaassistsperfgm = 0;
        double villanovaassiststoturnoverratio = 0;
        double villanovaturnovers = 402;
        double villanovaturnoverspergame = 0;
        double villanovablocks = 109;
        double villanovablockspergame = 0;
        double villanovasteals = 259;
        double villanovastealspergame = 0;
        double villanovafta = 681;
        double villanovaftm = 538;
        double villanovaturnoverpercentage = 0;
        double villanovaftpercentage = 0;
        double villanovarebounds = 1208;
        double villanovaoffrebounds = 312;
        double villanovadefrebounds = 896;
        double villanovareboundspergame = 0;
        double villanovaoffreboundspergame = 0;
        double villanovadefreboundspergame = 0;
        double villanovapossessions = 0;
        double villanovaoppfga = 2018;
        double villanovaoppfta = 445;
        double villanovaopporb = 336;
        double villanovatoforced = 475;
        double villanovadefrating = 0;
        double villanovaeffectivefgpercentage = 0;
        double villanovateamgamescore = 0;
        double villanovafouls = 515;
        double villanovanetrating = 0;
        double villanovaoffensiverating = 0;
        double villanovapace = 0;
        double villanovaminutesplayed = 7200;
        double villanovatrueshootingpercentage = 0;
        villanovawinpercentage = (villanovawins/villanovagamesplayed)*100;
        villanovappg = (villanovapointsscored/villanovagamesplayed);
        villanovapapg = (villanovapointsallowed/villanovagamesplayed);
        villanovafgptg = (villanovafgm/villanovafga)*100;
        villanova2ptfgptg = (villanova2ptfgm/villanova2ptfga)*100;
        villanova3ptfgptg = (villanova3ptfgm/villanova3ptfga)*100;
        villanovaassistspergame = (villanovaassists/villanovagamesplayed);
        villanovaassistsperfgm = (villanovaassists/villanovafgm);
        villanovaassiststoturnoverratio = (villanovaassists/villanovaturnovers);
        villanovablockspergame = (villanovablocks/villanovagamesplayed);
        villanovastealspergame = (villanovasteals/villanovagamesplayed);
        villanovaturnoverspergame = (villanovaturnovers/villanovagamesplayed);
        villanovaturnoverpercentage = (100*villanovaturnovers)/(villanovafga+(0.475*villanovafta)+villanovaturnovers);
        villanovaftpercentage = (villanovaftm/villanovafta)*100;
        villanovareboundspergame = (villanovarebounds/villanovagamesplayed);
        villanovaoffreboundspergame = (villanovaoffrebounds/villanovagamesplayed);
        villanovadefreboundspergame = (villanovadefrebounds/villanovagamesplayed);
        villanovapossessions = (0.5 * (villanovafga + (0.475 * villanovafta) - villanovaoffrebounds + villanovaturnovers) + 0.5 * (villanovaoppfga + (0.475 * villanovaoppfta) - villanovaopporb + villanovatoforced));
        villanovadefrating = 100*(villanovapointsallowed/villanovapossessions);
        villanovaeffectivefgpercentage = ((villanovafgm+(0.5*villanova3ptfgm))/villanovafga)*100;
        villanovateamgamescore = ((villanovapointsscored + (0.4 * villanovafgm) - (0.7 * villanovafga) - (0.4*(villanovafta - villanovaftm)) + (0.7 * villanovaoffrebounds) + (0.3 * villanovadefrebounds) + villanovasteals + (0.7 * villanovaassists) + (0.7 * villanovablocks) - (0.4 * villanovafouls) - villanovaturnovers)/8)/villanovagamesplayed;
        villanovanetrating = 100 * ((villanovapointsscored - villanovapointsallowed) / villanovapossessions);
        villanovaoffensiverating = 100 * (villanovapointsscored / villanovapossessions);
        villanovapace = 40 * (villanovapossessions / (0.2 * villanovaminutesplayed));
        villanovatrueshootingpercentage = (villanovapointsscored / (2 * (villanovafga + 0.475 * villanovafta)))*100;
        System.out.println("\nVillanova:\n" + villanovawinpercentage + "% Win Percentage\n" + villanovappg +
                " Points Per Game\n"+villanovapapg+ " Points Allowed Per Game\n"+villanovafgptg+
                "% Field Goal Percentage\n"+villanova2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +villanova3ptfgptg+"% 3 Point Field Goal Percentage\n"+villanovaassistspergame+" Assists Per Game\n"+
                villanovaassistsperfgm+" Assists Per FGM\n"+ villanovaassiststoturnoverratio+" Assists : TO Ratio\n"+
                villanovablockspergame+" Blocks Per Game\n"+villanovastealspergame+" Steals Per Game\n"+
                villanovaturnoverspergame+" TO Per Game\n"+villanovaturnoverpercentage+" TO%\n"+ villanovaftpercentage+" FT%\n"+
                villanovareboundspergame+" Rebounds Per Game\n"+villanovaoffreboundspergame+" Offensive Rebounds Per game\n"+
                villanovadefreboundspergame+" Defensive Rebounds Per Game\n"+villanovapossessions+" Possessions\n"+
                villanovadefrating+" Defensive Rating\n"+villanovaeffectivefgpercentage+" EFG%\n"+villanovateamgamescore+" Team Game Score\n"
                +villanovanetrating+" Net Rating\n"+villanovaoffensiverating+" Offensive Rating\n"+villanovapace+" Pace\n"+villanovatrueshootingpercentage+" True Shooting Percentage");

        double kansaswins = 31;
        double kansasgamesplayed = 36;
        double kansaswinpercentage = 0;
        double kansaspointsscored = 2995;
        double kansasppg = 0;
        double kansaspointsallowed = 2588;
        double kansaspapg = 0;
        double kansasfgm = 1071;
        double kansasfga = 2193;
        double kansasfgptg = 0;
        double kansas2ptfgm = 753;
        double kansas2ptfga = 1406;
        double kansas2ptfgptg = 0;
        double kansas3ptfgm = 318;
        double kansas3ptfga = 787;
        double kansas3ptfgptg = 0;
        double kansasassists = 584;
        double kansasassistspergame = 0;
        double kansasassistsperfgm = 0;
        double kansasassiststoturnoverratio = 0;
        double kansasturnovers = 456;
        double kansasturnoverspergame = 0;
        double kansasblocks = 162;
        double kansasblockspergame = 0;
        double kansassteals = 250;
        double kansasstealspergame = 0;
        double kansasfta = 789;
        double kansasftm = 535;
        double kansasturnoverpercentage = 0;
        double kansasftpercentage = 0;
        double kansasrebounds = 1393;
        double kansasoffrebounds = 420;
        double kansasdefrebounds = 973;
        double kansasreboundspergame = 0;
        double kansasoffreboundspergame = 0;
        double kansasdefreboundspergame = 0;
        double kansaspossessions = 0;
        double kansasoppfga = 2200;
        double kansasoppfta = 660;
        double kansasopporb = 401;
        double kansastoforced = 483;
        double kansasdefrating = 0;
        double kansaseffectivefgpercentage = 0;
        double kansasteamgamescore = 0;
        double kansasfouls = 639;
        double kansasnetrating = 0;
        double kansasoffensiverating = 0;
        double kansaspace = 0;
        double kansasminutesplayed = 7275;
        double kansastrueshootingpercentage = 0;
        kansaswinpercentage = (kansaswins/kansasgamesplayed)*100;
        kansasppg = (kansaspointsscored/kansasgamesplayed);
        kansaspapg = (kansaspointsallowed/kansasgamesplayed);
        kansasfgptg = (kansasfgm/kansasfga)*100;
        kansas2ptfgptg = (kansas2ptfgm/kansas2ptfga)*100;
        kansas3ptfgptg = (kansas3ptfgm/kansas3ptfga)*100;
        kansasassistspergame = (kansasassists/kansasgamesplayed);
        kansasassistsperfgm = (kansasassists/kansasfgm);
        kansasassiststoturnoverratio = (kansasassists/kansasturnovers);
        kansasblockspergame = (kansasblocks/kansasgamesplayed);
        kansasstealspergame = (kansassteals/kansasgamesplayed);
        kansasturnoverspergame = (kansasturnovers/kansasgamesplayed);
        kansasturnoverpercentage = (100*kansasturnovers)/(kansasfga+(0.475*kansasfta)+kansasturnovers);
        kansasftpercentage = (kansasftm/kansasfta)*100;
        kansasreboundspergame = (kansasrebounds/kansasgamesplayed);
        kansasoffreboundspergame = (kansasoffrebounds/kansasgamesplayed);
        kansasdefreboundspergame = (kansasdefrebounds/kansasgamesplayed);
        kansaspossessions = (0.5 * (kansasfga + (0.475 * kansasfta) - kansasoffrebounds + kansasturnovers) + 0.5 * (kansasoppfga + (0.475 * kansasoppfta) - kansasopporb + kansastoforced));
        kansasdefrating = 100*(kansaspointsallowed/kansaspossessions);
        kansaseffectivefgpercentage = ((kansasfgm+(0.5*kansas3ptfgm))/kansasfga)*100;
        kansasteamgamescore = ((kansaspointsscored + (0.4 * kansasfgm) - (0.7 * kansasfga) - (0.4*(kansasfta - kansasftm)) + (0.7 * kansasoffrebounds) + (0.3 * kansasdefrebounds) + kansassteals + (0.7 * kansasassists) + (0.7 * kansasblocks) - (0.4 * kansasfouls) - kansasturnovers)/8)/kansasgamesplayed;
        kansasnetrating = 100 * ((kansaspointsscored - kansaspointsallowed) / kansaspossessions);
        kansasoffensiverating = 100 * (kansaspointsscored / kansaspossessions);
        kansaspace = 40 * (kansaspossessions / (0.2 * kansasminutesplayed));
        kansastrueshootingpercentage = (kansaspointsscored / (2 * (kansasfga + 0.475 * kansasfta)))*100;
        System.out.println("\nKansas:\n" + kansaswinpercentage + "% Win Percentage\n" + kansasppg +
                " Points Per Game\n"+kansaspapg+ " Points Allowed Per Game\n"+kansasfgptg+
                "% Field Goal Percentage\n"+kansas2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +kansas3ptfgptg+"% 3 Point Field Goal Percentage\n"+kansasassistspergame+" Assists Per Game\n"+
                kansasassistsperfgm+" Assists Per FGM\n"+ kansasassiststoturnoverratio+" Assists : TO Ratio\n"+
                kansasblockspergame+" Blocks Per Game\n"+kansasstealspergame+" Steals Per Game\n"+
                kansasturnoverspergame+" TO Per Game\n"+kansasturnoverpercentage+" TO%\n"+ kansasftpercentage+" FT%\n"+
                kansasreboundspergame+" Rebounds Per Game\n"+kansasoffreboundspergame+" Offensive Rebounds Per game\n"+
                kansasdefreboundspergame+" Defensive Rebounds Per Game\n"+kansaspossessions+" Possessions\n"+
                kansasdefrating+" Defensive Rating\n"+kansaseffectivefgpercentage+" EFG%\n"+kansasteamgamescore+" Team Game Score\n"
                +kansasnetrating+" Net Rating\n"+kansasoffensiverating+" Offensive Rating\n"+kansaspace+" Pace\n"+kansastrueshootingpercentage+" True Shooting Percentage");

        double louisvillewins = 25;
        double louisvillegamesplayed = 34;
        double louisvillewinpercentage = 0;
        double louisvillepointsscored = 2628;
        double louisvilleppg = 0;
        double louisvillepointsallowed = 2243;
        double louisvillepapg = 0;
        double louisvillefgm = 952;
        double louisvillefga = 2085;
        double louisvillefgptg = 0;
        double louisville2ptfgm = 714;
        double louisville2ptfga = 1415;
        double louisville2ptfgptg = 0;
        double louisville3ptfgm = 238;
        double louisville3ptfga = 670;
        double louisville3ptfgptg = 0;
        double louisvilleassists = 461;
        double louisvilleassistspergame = 0;
        double louisvilleassistsperfgm = 0;
        double louisvilleassiststoturnoverratio = 0;
        double louisvilleturnovers = 374;
        double louisvilleturnoverspergame = 0;
        double louisvilleblocks = 186;
        double louisvilleblockspergame = 0;
        double louisvillesteals = 227;
        double louisvillestealspergame = 0;
        double louisvillefta = 708;
        double louisvilleftm = 486;
        double louisvilleturnoverpercentage = 0;
        double louisvilleftpercentage = 0;
        double louisvillerebounds = 1343;
        double louisvilleoffrebounds = 449;
        double louisvilledefrebounds = 894;
        double louisvillereboundspergame = 0;
        double louisvilleoffreboundspergame = 0;
        double louisvilledefreboundspergame = 0;
        double louisvillepossessions = 0;
        double louisvilleoppfga = 1894;
        double louisvilleoppfta = 734;
        double louisvilleopporb = 348;
        double louisvilletoforced = 460;
        double louisvilledefrating = 0;
        double louisvilleeffectivefgpercentage = 0;
        double louisvilleteamgamescore = 0;
        double louisvillefouls = 622;
        double louisvillenetrating = 0;
        double louisvilleoffensiverating = 0;
        double louisvillepace = 0;
        double louisvilleminutesplayed = 6850;
        double louisvilletrueshootingpercentage = 0;
        louisvillewinpercentage = (louisvillewins/louisvillegamesplayed)*100;
        louisvilleppg = (louisvillepointsscored/louisvillegamesplayed);
        louisvillepapg = (louisvillepointsallowed/louisvillegamesplayed);
        louisvillefgptg = (louisvillefgm/louisvillefga)*100;
        louisville2ptfgptg = (louisville2ptfgm/louisville2ptfga)*100;
        louisville3ptfgptg = (louisville3ptfgm/louisville3ptfga)*100;
        louisvilleassistspergame = (louisvilleassists/louisvillegamesplayed);
        louisvilleassistsperfgm = (louisvilleassists/louisvillefgm);
        louisvilleassiststoturnoverratio = (louisvilleassists/louisvilleturnovers);
        louisvilleblockspergame = (louisvilleblocks/louisvillegamesplayed);
        louisvillestealspergame = (louisvillesteals/louisvillegamesplayed);
        louisvilleturnoverspergame = (louisvilleturnovers/louisvillegamesplayed);
        louisvilleturnoverpercentage = (100*louisvilleturnovers)/(louisvillefga+(0.475*louisvillefta)+louisvilleturnovers);
        louisvilleftpercentage = (louisvilleftm/louisvillefta)*100;
        louisvillereboundspergame = (louisvillerebounds/louisvillegamesplayed);
        louisvilleoffreboundspergame = (louisvilleoffrebounds/louisvillegamesplayed);
        louisvilledefreboundspergame = (louisvilledefrebounds/louisvillegamesplayed);
        louisvillepossessions = (0.5 * (louisvillefga + (0.475 * louisvillefta) - louisvilleoffrebounds + louisvilleturnovers) + 0.5 * (louisvilleoppfga + (0.475 * louisvilleoppfta) - louisvilleopporb + louisvilletoforced));
        louisvilledefrating = 100*(louisvillepointsallowed/louisvillepossessions);
        louisvilleeffectivefgpercentage = ((louisvillefgm+(0.5*louisville3ptfgm))/louisvillefga)*100;
        louisvilleteamgamescore = ((louisvillepointsscored + (0.4 * louisvillefgm) - (0.7 * louisvillefga) - (0.4*(louisvillefta - louisvilleftm)) + (0.7 * louisvilleoffrebounds) + (0.3 * louisvilledefrebounds) + louisvillesteals + (0.7 * louisvilleassists) + (0.7 * louisvilleblocks) - (0.4 * louisvillefouls) - louisvilleturnovers)/8)/louisvillegamesplayed;
        louisvillenetrating = 100 * ((louisvillepointsscored - louisvillepointsallowed) / louisvillepossessions);
        louisvilleoffensiverating = 100 * (louisvillepointsscored / louisvillepossessions);
        louisvillepace = 40 * (louisvillepossessions / (0.2 * louisvilleminutesplayed));
        louisvilletrueshootingpercentage = (louisvillepointsscored / (2 * (louisvillefga + 0.475 * louisvillefta)))*100;
        System.out.println("\nLouisville:\n" + louisvillewinpercentage + "% Win Percentage\n" + louisvilleppg +
                " Points Per Game\n"+louisvillepapg+ " Points Allowed Per Game\n"+louisvillefgptg+
                "% Field Goal Percentage\n"+louisville2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +louisville3ptfgptg+"% 3 Point Field Goal Percentage\n"+louisvilleassistspergame+" Assists Per Game\n"+
                louisvilleassistsperfgm+" Assists Per FGM\n"+ louisvilleassiststoturnoverratio+" Assists : TO Ratio\n"+
                louisvilleblockspergame+" Blocks Per Game\n"+louisvillestealspergame+" Steals Per Game\n"+
                louisvilleturnoverspergame+" TO Per Game\n"+louisvilleturnoverpercentage+" TO%\n"+ louisvilleftpercentage+" FT%\n"+
                louisvillereboundspergame+" Rebounds Per Game\n"+louisvilleoffreboundspergame+" Offensive Rebounds Per game\n"+
                louisvilledefreboundspergame+" Defensive Rebounds Per Game\n"+louisvillepossessions+" Possessions\n"+
                louisvilledefrating+" Defensive Rating\n"+louisvilleeffectivefgpercentage+" EFG%\n"+louisvilleteamgamescore+" Team Game Score\n"
                +louisvillenetrating+" Net Rating\n"+louisvilleoffensiverating+" Offensive Rating\n"+louisvillepace+" Pace\n"+louisvilletrueshootingpercentage+" True Shooting Percentage");

        double floridawins = 27;
        double floridagamesplayed = 36;
        double floridawinpercentage = 0;
        double floridapointsscored = 2804;
        double floridappg = 0;
        double floridapointsallowed = 2394;
        double floridapapg = 0;
        double floridafgm = 953;
        double floridafga = 2118;
        double floridafgptg = 0;
        double florida2ptfgm = 675;
        double florida2ptfga = 1342;
        double florida2ptfgptg = 0;
        double florida3ptfgm = 278;
        double florida3ptfga = 776;
        double florida3ptfgptg = 0;
        double floridaassists = 450;
        double floridaassistspergame = 0;
        double floridaassistsperfgm = 0;
        double floridaassiststoturnoverratio = 0;
        double floridaturnovers = 432;
        double floridaturnoverspergame = 0;
        double floridablocks = 167;
        double floridablockspergame = 0;
        double floridasteals = 272;
        double floridastealspergame = 0;
        double floridafta = 851;
        double floridaftm = 620;
        double floridaturnoverpercentage = 0;
        double floridaftpercentage = 0;
        double floridarebounds = 1331;
        double floridaoffrebounds = 403;
        double floridadefrebounds = 928;
        double floridareboundspergame = 0;
        double floridaoffreboundspergame = 0;
        double floridadefreboundspergame = 0;
        double floridapossessions = 0;
        double floridaoppfga = 2070;
        double floridaoppfta = 705;
        double floridaopporb = 375;
        double floridatoforced = 533;
        double floridadefrating = 0;
        double floridaeffectivefgpercentage = 0;
        double floridateamgamescore = 0;
        double floridafouls = 661;
        double floridanetrating = 0;
        double floridaoffensiverating = 0;
        double floridapace = 0;
        double floridaminutesplayed = 7275;
        double floridatrueshootingpercentage = 0;
        floridawinpercentage = (floridawins/floridagamesplayed)*100;
        floridappg = (floridapointsscored/floridagamesplayed);
        floridapapg = (floridapointsallowed/floridagamesplayed);
        floridafgptg = (floridafgm/floridafga)*100;
        florida2ptfgptg = (florida2ptfgm/florida2ptfga)*100;
        florida3ptfgptg = (florida3ptfgm/florida3ptfga)*100;
        floridaassistspergame = (floridaassists/floridagamesplayed);
        floridaassistsperfgm = (floridaassists/floridafgm);
        floridaassiststoturnoverratio = (floridaassists/floridaturnovers);
        floridablockspergame = (floridablocks/floridagamesplayed);
        floridastealspergame = (floridasteals/floridagamesplayed);
        floridaturnoverspergame = (floridaturnovers/floridagamesplayed);
        floridaturnoverpercentage = (100*floridaturnovers)/(floridafga+(0.475*floridafta)+floridaturnovers);
        floridaftpercentage = (floridaftm/floridafta)*100;
        floridareboundspergame = (floridarebounds/floridagamesplayed);
        floridaoffreboundspergame = (floridaoffrebounds/floridagamesplayed);
        floridadefreboundspergame = (floridadefrebounds/floridagamesplayed);
        floridapossessions = (0.5 * (floridafga + (0.475 * floridafta) - floridaoffrebounds + floridaturnovers) + 0.5 * (floridaoppfga + (0.475 * floridaoppfta) - floridaopporb + floridatoforced));
        floridadefrating = 100*(floridapointsallowed/floridapossessions);
        floridaeffectivefgpercentage = ((floridafgm+(0.5*florida3ptfgm))/floridafga)*100;
        floridateamgamescore = ((floridapointsscored + (0.4 * floridafgm) - (0.7 * floridafga) - (0.4*(floridafta - floridaftm)) + (0.7 * floridaoffrebounds) + (0.3 * floridadefrebounds) + floridasteals + (0.7 * floridaassists) + (0.7 * floridablocks) - (0.4 * floridafouls) - floridaturnovers)/8)/floridagamesplayed;
        floridanetrating = 100 * ((floridapointsscored - floridapointsallowed) / floridapossessions);
        floridaoffensiverating = 100 * (floridapointsscored / floridapossessions);
        floridapace = 40 * (floridapossessions / (0.2 * floridaminutesplayed));
        floridatrueshootingpercentage = (floridapointsscored / (2 * (floridafga + 0.475 * floridafta)))*100;
        System.out.println("\nFlorida:\n" + floridawinpercentage + "% Win Percentage\n" + floridappg +
                " Points Per Game\n"+floridapapg+ " Points Allowed Per Game\n"+floridafgptg+
                "% Field Goal Percentage\n"+florida2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +florida3ptfgptg+"% 3 Point Field Goal Percentage\n"+floridaassistspergame+" Assists Per Game\n"+
                floridaassistsperfgm+" Assists Per FGM\n"+ floridaassiststoturnoverratio+" Assists : TO Ratio\n"+
                floridablockspergame+" Blocks Per Game\n"+floridastealspergame+" Steals Per Game\n"+
                floridaturnoverspergame+" TO Per Game\n"+floridaturnoverpercentage+" TO%\n"+ floridaftpercentage+" FT%\n"+
                floridareboundspergame+" Rebounds Per Game\n"+floridaoffreboundspergame+" Offensive Rebounds Per game\n"+
                floridadefreboundspergame+" Defensive Rebounds Per Game\n"+floridapossessions+" Possessions\n"+
                floridadefrating+" Defensive Rating\n"+floridaeffectivefgpercentage+" EFG%\n"+floridateamgamescore+" Team Game Score\n"
                +floridanetrating+" Net Rating\n"+floridaoffensiverating+" Offensive Rating\n"+floridapace+" Pace\n"+floridatrueshootingpercentage+" True Shooting Percentage");

        double dukewins = 28;
        double dukegamesplayed = 37;
        double dukewinpercentage = 0;
        double dukepointsscored = 2991;
        double dukeppg = 0;
        double dukepointsallowed = 2597;
        double dukepapg = 0;
        double dukefgm = 1019;
        double dukefga = 2144;
        double dukefgptg = 0;
        double duke2ptfgm = 708;
        double duke2ptfga = 1322;
        double duke2ptfgptg = 0;
        double duke3ptfgm = 311;
        double duke3ptfga = 822;
        double duke3ptfgptg = 0;
        double dukeassists = 484;
        double dukeassistspergame = 0;
        double dukeassistsperfgm = 0;
        double dukeassiststoturnoverratio = 0;
        double duketurnovers = 421;
        double duketurnoverspergame = 0;
        double dukeblocks = 172;
        double dukeblockspergame = 0;
        double dukesteals = 226;
        double dukestealspergame = 0;
        double dukefta = 842;
        double dukeftm = 642;
        double duketurnoverpercentage = 0;
        double dukeftpercentage = 0;
        double dukerebounds = 1341;
        double dukeoffrebounds = 387;
        double dukedefrebounds = 954;
        double dukereboundspergame = 0;
        double dukeoffreboundspergame = 0;
        double dukedefreboundspergame = 0;
        double dukepossessions = 0;
        double dukeoppfga = 2218;
        double dukeoppfta = 693;
        double dukeopporb = 399;
        double duketoforced = 447;
        double dukedefrating = 0;
        double dukeeffectivefgpercentage = 0;
        double duketeamgamescore = 0;
        double dukefouls = 675;
        double dukenetrating = 0;
        double dukeoffensiverating = 0;
        double dukepace = 0;
        double dukeminutesplayed = 7400;
        double duketrueshootingpercentage = 0;
        dukewinpercentage = (dukewins/dukegamesplayed)*100;
        dukeppg = (dukepointsscored/dukegamesplayed);
        dukepapg = (dukepointsallowed/dukegamesplayed);
        dukefgptg = (dukefgm/dukefga)*100;
        duke2ptfgptg = (duke2ptfgm/duke2ptfga)*100;
        duke3ptfgptg = (duke3ptfgm/duke3ptfga)*100;
        dukeassistspergame = (dukeassists/dukegamesplayed);
        dukeassistsperfgm = (dukeassists/dukefgm);
        dukeassiststoturnoverratio = (dukeassists/duketurnovers);
        dukeblockspergame = (dukeblocks/dukegamesplayed);
        dukestealspergame = (dukesteals/dukegamesplayed);
        duketurnoverspergame = (duketurnovers/dukegamesplayed);
        duketurnoverpercentage = (100*duketurnovers)/(dukefga+(0.475*dukefta)+duketurnovers);
        dukeftpercentage = (dukeftm/dukefta)*100;
        dukereboundspergame = (dukerebounds/dukegamesplayed);
        dukeoffreboundspergame = (dukeoffrebounds/dukegamesplayed);
        dukedefreboundspergame = (dukedefrebounds/dukegamesplayed);
        dukepossessions = (0.5 * (dukefga + (0.475 * dukefta) - dukeoffrebounds + duketurnovers) + 0.5 * (dukeoppfga + (0.475 * dukeoppfta) - dukeopporb + duketoforced));
        dukedefrating = 100*(dukepointsallowed/dukepossessions);
        dukeeffectivefgpercentage = ((dukefgm+(0.5*duke3ptfgm))/dukefga)*100;
        duketeamgamescore = ((dukepointsscored + (0.4 * dukefgm) - (0.7 * dukefga) - (0.4*(dukefta - dukeftm)) + (0.7 * dukeoffrebounds) + (0.3 * dukedefrebounds) + dukesteals + (0.7 * dukeassists) + (0.7 * dukeblocks) - (0.4 * dukefouls) - duketurnovers)/8)/dukegamesplayed;
        dukenetrating = 100 * ((dukepointsscored - dukepointsallowed) / dukepossessions);
        dukeoffensiverating = 100 * (dukepointsscored / dukepossessions);
        dukepace = 40 * (dukepossessions / (0.2 * dukeminutesplayed));
        duketrueshootingpercentage = (dukepointsscored / (2 * (dukefga + 0.475 * dukefta)))*100;
        System.out.println("\nDuke:\n" + dukewinpercentage + "% Win Percentage\n" + dukeppg +
                " Points Per Game\n"+dukepapg+ " Points Allowed Per Game\n"+dukefgptg+
                "% Field Goal Percentage\n"+duke2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +duke3ptfgptg+"% 3 Point Field Goal Percentage\n"+dukeassistspergame+" Assists Per Game\n"+
                dukeassistsperfgm+" Assists Per FGM\n"+ dukeassiststoturnoverratio+" Assists : TO Ratio\n"+
                dukeblockspergame+" Blocks Per Game\n"+dukestealspergame+" Steals Per Game\n"+
                duketurnoverspergame+" TO Per Game\n"+duketurnoverpercentage+" TO%\n"+ dukeftpercentage+" FT%\n"+
                dukereboundspergame+" Rebounds Per Game\n"+dukeoffreboundspergame+" Offensive Rebounds Per game\n"+
                dukedefreboundspergame+" Defensive Rebounds Per Game\n"+dukepossessions+" Possessions\n"+
                dukedefrating+" Defensive Rating\n"+dukeeffectivefgpercentage+" EFG%\n"+duketeamgamescore+" Team Game Score\n"
                +dukenetrating+" Net Rating\n"+dukeoffensiverating+" Offensive Rating\n"+dukepace+" Pace\n"+duketrueshootingpercentage+" True Shooting Percentage");

        double wichitastwins = 31;
        double wichitastgamesplayed = 36;
        double wichitastwinpercentage = 0;
        double wichitastpointsscored = 2916;
        double wichitastppg = 0;
        double wichitastpointsallowed = 2246;
        double wichitastpapg = 0;
        double wichitastfgm = 992;
        double wichitastfga = 2114;
        double wichitastfgptg = 0;
        double wichitast2ptfgm = 682;
        double wichitast2ptfga = 1345;
        double wichitast2ptfgptg = 0;
        double wichitast3ptfgm = 310;
        double wichitast3ptfga = 769;
        double wichitast3ptfgptg = 0;
        double wichitastassists = 586;
        double wichitastassistspergame = 0;
        double wichitastassistsperfgm = 0;
        double wichitastassiststoturnoverratio = 0;
        double wichitastturnovers = 406;
        double wichitastturnoverspergame = 0;
        double wichitastblocks = 140;
        double wichitastblockspergame = 0;
        double wichitaststeals = 235;
        double wichitaststealspergame = 0;
        double wichitastfta = 848;
        double wichitastftm = 622;
        double wichitastturnoverpercentage = 0;
        double wichitastftpercentage = 0;
        double wichitastrebounds = 1472;
        double wichitastoffrebounds = 427;
        double wichitastdefrebounds = 1045;
        double wichitastreboundspergame = 0;
        double wichitastoffreboundspergame = 0;
        double wichitastdefreboundspergame = 0;
        double wichitastpossessions = 0;
        double wichitastoppfga = 2000;
        double wichitastoppfta = 718;
        double wichitastopporb = 321;
        double wichitasttoforced = 488;
        double wichitastdefrating = 0;
        double wichitasteffectivefgpercentage = 0;
        double wichitastteamgamescore = 0;
        double wichitastfouls = 676;
        double wichitastnetrating = 0;
        double wichitastoffensiverating = 0;
        double wichitastpace = 0;
        double wichitastminutesplayed = 7200;
        double wichitasttrueshootingpercentage = 0;
        wichitastwinpercentage = (wichitastwins/wichitastgamesplayed)*100;
        wichitastppg = (wichitastpointsscored/wichitastgamesplayed);
        wichitastpapg = (wichitastpointsallowed/wichitastgamesplayed);
        wichitastfgptg = (wichitastfgm/wichitastfga)*100;
        wichitast2ptfgptg = (wichitast2ptfgm/wichitast2ptfga)*100;
        wichitast3ptfgptg = (wichitast3ptfgm/wichitast3ptfga)*100;
        wichitastassistspergame = (wichitastassists/wichitastgamesplayed);
        wichitastassistsperfgm = (wichitastassists/wichitastfgm);
        wichitastassiststoturnoverratio = (wichitastassists/wichitastturnovers);
        wichitastblockspergame = (wichitastblocks/wichitastgamesplayed);
        wichitaststealspergame = (wichitaststeals/wichitastgamesplayed);
        wichitastturnoverspergame = (wichitastturnovers/wichitastgamesplayed);
        wichitastturnoverpercentage = (100*wichitastturnovers)/(wichitastfga+(0.475*wichitastfta)+wichitastturnovers);
        wichitastftpercentage = (wichitastftm/wichitastfta)*100;
        wichitastreboundspergame = (wichitastrebounds/wichitastgamesplayed);
        wichitastoffreboundspergame = (wichitastoffrebounds/wichitastgamesplayed);
        wichitastdefreboundspergame = (wichitastdefrebounds/wichitastgamesplayed);
        wichitastpossessions = (0.5 * (wichitastfga + (0.475 * wichitastfta) - wichitastoffrebounds + wichitastturnovers) + 0.5 * (wichitastoppfga + (0.475 * wichitastoppfta) - wichitastopporb + wichitasttoforced));
        wichitastdefrating = 100*(wichitastpointsallowed/wichitastpossessions);
        wichitasteffectivefgpercentage = ((wichitastfgm+(0.5*wichitast3ptfgm))/wichitastfga)*100;
        wichitastteamgamescore = ((wichitastpointsscored + (0.4 * wichitastfgm) - (0.7 * wichitastfga) - (0.4*(wichitastfta - wichitastftm)) + (0.7 * wichitastoffrebounds) + (0.3 * wichitastdefrebounds) + wichitaststeals + (0.7 * wichitastassists) + (0.7 * wichitastblocks) - (0.4 * wichitastfouls) - wichitastturnovers)/8)/wichitastgamesplayed;
        wichitastnetrating = 100 * ((wichitastpointsscored - wichitastpointsallowed) / wichitastpossessions);
        wichitastoffensiverating = 100 * (wichitastpointsscored / wichitastpossessions);
        wichitastpace = 40 * (wichitastpossessions / (0.2 * wichitastminutesplayed));
        wichitasttrueshootingpercentage = (wichitastpointsscored / (2 * (wichitastfga + 0.475 * wichitastfta)))*100;
        System.out.println("\nWichita State:\n" + wichitastwinpercentage + "% Win Percentage\n" + wichitastppg +
                " Points Per Game\n"+wichitastpapg+ " Points Allowed Per Game\n"+wichitastfgptg+
                "% Field Goal Percentage\n"+wichitast2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +wichitast3ptfgptg+"% 3 Point Field Goal Percentage\n"+wichitastassistspergame+" Assists Per Game\n"+
                wichitastassistsperfgm+" Assists Per FGM\n"+ wichitastassiststoturnoverratio+" Assists : TO Ratio\n"+
                wichitastblockspergame+" Blocks Per Game\n"+wichitaststealspergame+" Steals Per Game\n"+
                wichitastturnoverspergame+" TO Per Game\n"+wichitastturnoverpercentage+" TO%\n"+ wichitastftpercentage+" FT%\n"+
                wichitastreboundspergame+" Rebounds Per Game\n"+wichitastoffreboundspergame+" Offensive Rebounds Per game\n"+
                wichitastdefreboundspergame+" Defensive Rebounds Per Game\n"+wichitastpossessions+" Possessions\n"+
                wichitastdefrating+" Defensive Rating\n"+wichitasteffectivefgpercentage+" EFG%\n"+wichitastteamgamescore+" Team Game Score\n"
                +wichitastnetrating+" Net Rating\n"+wichitastoffensiverating+" Offensive Rating\n"+wichitastpace+" Pace\n"+wichitasttrueshootingpercentage+" True Shooting Percentage");

        double oregonwins = 33;
        double oregongamesplayed = 39;
        double oregonwinpercentage = 0;
        double oregonpointsscored = 3076;
        double oregonppg = 0;
        double oregonpointsallowed = 2565;
        double oregonpapg = 0;
        double oregonfgm = 1091;
        double oregonfga = 2270;
        double oregonfgptg = 0;
        double oregon2ptfgm = 757;
        double oregon2ptfga = 1390;
        double oregon2ptfgptg = 0;
        double oregon3ptfgm = 334;
        double oregon3ptfga = 880;
        double oregon3ptfgptg = 0;
        double oregonassists = 614;
        double oregonassistspergame = 0;
        double oregonassistsperfgm = 0;
        double oregonassiststoturnoverratio = 0;
        double oregonturnovers = 454;
        double oregonturnoverspergame = 0;
        double oregonblocks = 248;
        double oregonblockspergame = 0;
        double oregonsteals = 253;
        double oregonstealspergame = 0;
        double oregonfta = 787;
        double oregonftm = 560;
        double oregonturnoverpercentage = 0;
        double oregonftpercentage = 0;
        double oregonrebounds = 1431;
        double oregonoffrebounds = 405;
        double oregondefrebounds = 1026;
        double oregonreboundspergame = 0;
        double oregonoffreboundspergame = 0;
        double oregondefreboundspergame = 0;
        double oregonpossessions = 0;
        double oregonoppfga = 2311;
        double oregonoppfta = 595;
        double oregonopporb = 408;
        double oregontoforced = 516;
        double oregondefrating = 0;
        double oregoneffectivefgpercentage = 0;
        double oregonteamgamescore = 0;
        double oregonfouls = 614;
        double oregonnetrating = 0;
        double oregonoffensiverating = 0;
        double oregonpace = 0;
        double oregonminutesplayed = 7825;
        double oregontrueshootingpercentage = 0;
        oregonwinpercentage = (oregonwins/oregongamesplayed)*100;
        oregonppg = (oregonpointsscored/oregongamesplayed);
        oregonpapg = (oregonpointsallowed/oregongamesplayed);
        oregonfgptg = (oregonfgm/oregonfga)*100;
        oregon2ptfgptg = (oregon2ptfgm/oregon2ptfga)*100;
        oregon3ptfgptg = (oregon3ptfgm/oregon3ptfga)*100;
        oregonassistspergame = (oregonassists/oregongamesplayed);
        oregonassistsperfgm = (oregonassists/oregonfgm);
        oregonassiststoturnoverratio = (oregonassists/oregonturnovers);
        oregonblockspergame = (oregonblocks/oregongamesplayed);
        oregonstealspergame = (oregonsteals/oregongamesplayed);
        oregonturnoverspergame = (oregonturnovers/oregongamesplayed);
        oregonturnoverpercentage = (100*oregonturnovers)/(oregonfga+(0.475*oregonfta)+oregonturnovers);
        oregonftpercentage = (oregonftm/oregonfta)*100;
        oregonreboundspergame = (oregonrebounds/oregongamesplayed);
        oregonoffreboundspergame = (oregonoffrebounds/oregongamesplayed);
        oregondefreboundspergame = (oregondefrebounds/oregongamesplayed);
        oregonpossessions = (0.5 * (oregonfga + (0.475 * oregonfta) - oregonoffrebounds + oregonturnovers) + 0.5 * (oregonoppfga + (0.475 * oregonoppfta) - oregonopporb + oregontoforced));
        oregondefrating = 100*(oregonpointsallowed/oregonpossessions);
        oregoneffectivefgpercentage = ((oregonfgm+(0.5*oregon3ptfgm))/oregonfga)*100;
        oregonteamgamescore = ((oregonpointsscored + (0.4 * oregonfgm) - (0.7 * oregonfga) - (0.4*(oregonfta - oregonftm)) + (0.7 * oregonoffrebounds) + (0.3 * oregondefrebounds) + oregonsteals + (0.7 * oregonassists) + (0.7 * oregonblocks) - (0.4 * oregonfouls) - oregonturnovers)/8)/oregongamesplayed;
        oregonnetrating = 100 * ((oregonpointsscored - oregonpointsallowed) / oregonpossessions);
        oregonoffensiverating = 100 * (oregonpointsscored / oregonpossessions);
        oregonpace = 40 * (oregonpossessions / (0.2 * oregonminutesplayed));
        oregontrueshootingpercentage = (oregonpointsscored / (2 * (oregonfga + 0.475 * oregonfta)))*100;
        System.out.println("\nOregon:\n" + oregonwinpercentage + "% Win Percentage\n" + oregonppg +
                " Points Per Game\n"+oregonpapg+ " Points Allowed Per Game\n"+oregonfgptg+
                "% Field Goal Percentage\n"+oregon2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +oregon3ptfgptg+"% 3 Point Field Goal Percentage\n"+oregonassistspergame+" Assists Per Game\n"+
                oregonassistsperfgm+" Assists Per FGM\n"+ oregonassiststoturnoverratio+" Assists : TO Ratio\n"+
                oregonblockspergame+" Blocks Per Game\n"+oregonstealspergame+" Steals Per Game\n"+
                oregonturnoverspergame+" TO Per Game\n"+oregonturnoverpercentage+" TO%\n"+ oregonftpercentage+" FT%\n"+
                oregonreboundspergame+" Rebounds Per Game\n"+oregonoffreboundspergame+" Offensive Rebounds Per game\n"+
                oregondefreboundspergame+" Defensive Rebounds Per Game\n"+oregonpossessions+" Possessions\n"+
                oregondefrating+" Defensive Rating\n"+oregoneffectivefgpercentage+" EFG%\n"+oregonteamgamescore+" Team Game Score\n"
                +oregonnetrating+" Net Rating\n"+oregonoffensiverating+" Offensive Rating\n"+oregonpace+" Pace\n"+oregontrueshootingpercentage+" True Shooting Percentage\n");
				
		double uclawins = 31;
        double uclagamesplayed = 36;
        double uclawinpercentage = 0;
        double uclapointsscored = 3233;
        double uclappg = 0;
        double uclapointsallowed = 2719;
        double uclapapg = 0;
        double uclafgm = 1210;
        double uclafga = 2320;
        double uclafgptg = 0;
        double ucla2ptfgm = 856;
        double ucla2ptfga = 1448;
        double ucla2ptfgptg = 0;
        double ucla3ptfgm = 354;
        double ucla3ptfga = 872;
        double ucla3ptfgptg = 0;
        double uclaassists = 771;
        double uclaassistspergame = 0;
        double uclaassistsperfgm = 0;
        double uclaassiststoturnoverratio = 0;
        double uclaturnovers = 403;
        double uclaturnoverspergame = 0;
        double uclablocks = 191;
        double uclablockspergame = 0;
        double uclasteals = 212;
        double uclastealspergame = 0;
        double uclafta = 622;
        double uclaftm = 459;
        double uclaturnoverpercentage = 0;
        double uclaftpercentage = 0;
        double uclarebounds = 1386;
        double uclaoffrebounds = 341;
        double ucladefrebounds = 1045;
        double uclareboundspergame = 0;
        double uclaoffreboundspergame = 0;
        double ucladefreboundspergame = 0;
        double uclapossessions = 0;
        double uclaoppfga = 2371;
        double uclaoppfta = 602;
        double uclaopporb = 413;
        double uclatoforced = 423;
        double ucladefrating = 0;
        double uclaeffectivefgpercentage = 0;
        double uclateamgamescore = 0;
        double uclafouls = 583;
        double uclanetrating = 0;
        double uclaoffensiverating = 0;
        double uclapace = 0;
        double uclaminutesplayed = 7200;
        double uclatrueshootingpercentage = 0;
        uclawinpercentage = (uclawins/uclagamesplayed)*100;
        uclappg = (uclapointsscored/uclagamesplayed);
        uclapapg = (uclapointsallowed/uclagamesplayed);
        uclafgptg = (uclafgm/uclafga)*100;
        ucla2ptfgptg = (ucla2ptfgm/ucla2ptfga)*100;
        ucla3ptfgptg = (ucla3ptfgm/ucla3ptfga)*100;
        uclaassistspergame = (uclaassists/uclagamesplayed);
        uclaassistsperfgm = (uclaassists/uclafgm);
        uclaassiststoturnoverratio = (uclaassists/uclaturnovers);
        uclablockspergame = (uclablocks/uclagamesplayed);
        uclastealspergame = (uclasteals/uclagamesplayed);
        uclaturnoverspergame = (uclaturnovers/uclagamesplayed);
        uclaturnoverpercentage = (100*uclaturnovers)/(uclafga+(0.475*uclafta)+uclaturnovers);
        uclaftpercentage = (uclaftm/uclafta)*100;
        uclareboundspergame = (uclarebounds/uclagamesplayed);
        uclaoffreboundspergame = (uclaoffrebounds/uclagamesplayed);
        ucladefreboundspergame = (ucladefrebounds/uclagamesplayed);
        uclapossessions = (0.5 * (uclafga + (0.475 * uclafta) - uclaoffrebounds + uclaturnovers) + 0.5 * (uclaoppfga + (0.475 * uclaoppfta) - uclaopporb + uclatoforced));
        ucladefrating = 100*(uclapointsallowed/uclapossessions);
        uclaeffectivefgpercentage = ((uclafgm+(0.5*ucla3ptfgm))/uclafga)*100;
        uclateamgamescore = ((uclapointsscored + (0.4 * uclafgm) - (0.7 * uclafga) - (0.4*(uclafta - uclaftm)) + (0.7 * uclaoffrebounds) + (0.3 * ucladefrebounds) + uclasteals + (0.7 * uclaassists) + (0.7 * uclablocks) - (0.4 * uclafouls) - uclaturnovers)/8)/uclagamesplayed;
        uclanetrating = 100 * ((uclapointsscored - uclapointsallowed) / uclapossessions);
        uclaoffensiverating = 100 * (uclapointsscored / uclapossessions);
        uclapace = 40 * (uclapossessions / (0.2 * uclaminutesplayed));
        uclatrueshootingpercentage = (uclapointsscored / (2 * (uclafga + 0.475 * uclafta)))*100;
        System.out.println("\nUCLA:\n" + uclawinpercentage + "% Win Percentage\n" + uclappg +
                " Points Per Game\n"+uclapapg+ " Points Allowed Per Game\n"+uclafgptg+
                "% Field Goal Percentage\n"+ucla2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +ucla3ptfgptg+"% 3 Point Field Goal Percentage\n"+uclaassistspergame+" Assists Per Game\n"+
                uclaassistsperfgm+" Assists Per FGM\n"+ uclaassiststoturnoverratio+" Assists : TO Ratio\n"+
                uclablockspergame+" Blocks Per Game\n"+uclastealspergame+" Steals Per Game\n"+
                uclaturnoverspergame+" TO Per Game\n"+uclaturnoverpercentage+" TO%\n"+ uclaftpercentage+" FT%\n"+
                uclareboundspergame+" Rebounds Per Game\n"+uclaoffreboundspergame+" Offensive Rebounds Per game\n"+
                ucladefreboundspergame+" Defensive Rebounds Per Game\n"+uclapossessions+" Possessions\n"+
                ucladefrating+" Defensive Rating\n"+uclaeffectivefgpercentage+" EFG%\n"+uclateamgamescore+" Team Game Score\n"
                +uclanetrating+" Net Rating\n"+uclaoffensiverating+" Offensive Rating\n"+uclapace+" Pace\n"+uclatrueshootingpercentage+" True Shooting Percentage\n");
				
				
		double virginiawins = 23;
        double virginiagamesplayed = 34;
        double virginiawinpercentage = 0;
        double virginiapointsscored = 2246;
        double virginiappg = 0;
        double virginiapointsallowed = 1916;
        double virginiapapg = 0;
        double virginiafgm = 839;
        double virginiafga = 1823;
        double virginiafgptg = 0;
        double virginia2ptfgm = 607;
        double virginia2ptfga = 1221;
        double virginia2ptfgptg = 0;
        double virginia3ptfgm = 232;
        double virginia3ptfga = 602;
        double virginia3ptfgptg = 0;
        double virginiaassists = 473;
        double virginiaassistspergame = 0;
        double virginiaassistsperfgm = 0;
        double virginiaassiststoturnoverratio = 0;
        double virginiaturnovers = 324;
        double virginiaturnoverspergame = 0;
        double virginiablocks = 138;
        double virginiablockspergame = 0;
        double virginiasteals = 190;
        double virginiastealspergame = 0;
        double virginiafta = 474;
        double virginiaftm = 336;
        double virginiaturnoverpercentage = 0;
        double virginiaftpercentage = 0;
        double virginiarebounds = 1119;
        double virginiaoffrebounds = 294;
        double virginiadefrebounds = 825;
        double virginiareboundspergame = 0;
        double virginiaoffreboundspergame = 0;
        double virginiadefreboundspergame = 0;
        double virginiapossessions = 0;
        double virginiaoppfga = 1653;
        double virginiaoppfta = 559;
        double virginiaopporb = 264;
        double virginiatoforced = 432;
        double virginiadefrating = 0;
        double virginiaeffectivefgpercentage = 0;
        double virginiateamgamescore = 0;
        double virginiafouls = 556;
        double virginianetrating = 0;
        double virginiaoffensiverating = 0;
        double virginiapace = 0;
        double virginiaminutesplayed = 6900;
        double virginiatrueshootingpercentage = 0;
        virginiawinpercentage = (virginiawins/virginiagamesplayed)*100;
        virginiappg = (virginiapointsscored/virginiagamesplayed);
        virginiapapg = (virginiapointsallowed/virginiagamesplayed);
        virginiafgptg = (virginiafgm/virginiafga)*100;
        virginia2ptfgptg = (virginia2ptfgm/virginia2ptfga)*100;
        virginia3ptfgptg = (virginia3ptfgm/virginia3ptfga)*100;
        virginiaassistspergame = (virginiaassists/virginiagamesplayed);
        virginiaassistsperfgm = (virginiaassists/virginiafgm);
        virginiaassiststoturnoverratio = (virginiaassists/virginiaturnovers);
        virginiablockspergame = (virginiablocks/virginiagamesplayed);
        virginiastealspergame = (virginiasteals/virginiagamesplayed);
        virginiaturnoverspergame = (virginiaturnovers/virginiagamesplayed);
        virginiaturnoverpercentage = (100*virginiaturnovers)/(virginiafga+(0.475*virginiafta)+virginiaturnovers);
        virginiaftpercentage = (virginiaftm/virginiafta)*100;
        virginiareboundspergame = (virginiarebounds/virginiagamesplayed);
        virginiaoffreboundspergame = (virginiaoffrebounds/virginiagamesplayed);
        virginiadefreboundspergame = (virginiadefrebounds/virginiagamesplayed);
        virginiapossessions = (0.5 * (virginiafga + (0.475 * virginiafta) - virginiaoffrebounds + virginiaturnovers) + 0.5 * (virginiaoppfga + (0.475 * virginiaoppfta) - virginiaopporb + virginiatoforced));
        virginiadefrating = 100*(virginiapointsallowed/virginiapossessions);
        virginiaeffectivefgpercentage = ((virginiafgm+(0.5*virginia3ptfgm))/virginiafga)*100;
        virginiateamgamescore = ((virginiapointsscored + (0.4 * virginiafgm) - (0.7 * virginiafga) - (0.4*(virginiafta - virginiaftm)) + (0.7 * virginiaoffrebounds) + (0.3 * virginiadefrebounds) + virginiasteals + (0.7 * virginiaassists) + (0.7 * virginiablocks) - (0.4 * virginiafouls) - virginiaturnovers)/8)/virginiagamesplayed;
        virginianetrating = 100 * ((virginiapointsscored - virginiapointsallowed) / virginiapossessions);
        virginiaoffensiverating = 100 * (virginiapointsscored / virginiapossessions);
        virginiapace = 40 * (virginiapossessions / (0.2 * virginiaminutesplayed));
        virginiatrueshootingpercentage = (virginiapointsscored / (2 * (virginiafga + 0.475 * virginiafta)))*100;
        System.out.println("\nVirginia:\n" + virginiawinpercentage + "% Win Percentage\n" + virginiappg +
                " Points Per Game\n"+virginiapapg+ " Points Allowed Per Game\n"+virginiafgptg+
                "% Field Goal Percentage\n"+virginia2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +virginia3ptfgptg+"% 3 Point Field Goal Percentage\n"+virginiaassistspergame+" Assists Per Game\n"+
                virginiaassistsperfgm+" Assists Per FGM\n"+ virginiaassiststoturnoverratio+" Assists : TO Ratio\n"+
                virginiablockspergame+" Blocks Per Game\n"+virginiastealspergame+" Steals Per Game\n"+
                virginiaturnoverspergame+" TO Per Game\n"+virginiaturnoverpercentage+" TO%\n"+ virginiaftpercentage+" FT%\n"+
                virginiareboundspergame+" Rebounds Per Game\n"+virginiaoffreboundspergame+" Offensive Rebounds Per game\n"+
                virginiadefreboundspergame+" Defensive Rebounds Per Game\n"+virginiapossessions+" Possessions\n"+
                virginiadefrating+" Defensive Rating\n"+virginiaeffectivefgpercentage+" EFG%\n"+virginiateamgamescore+" Team Game Score\n"
                +virginianetrating+" Net Rating\n"+virginiaoffensiverating+" Offensive Rating\n"+virginiapace+" Pace\n"+virginiatrueshootingpercentage+" True Shooting Percentage\n");
				
				
		double iowastwins = 24;
        double iowastgamesplayed = 35;
        double iowastwinpercentage = 0;
        double iowastpointsscored = 2829;
        double iowastppg = 0;
        double iowastpointsallowed = 2529;
        double iowastpapg = 0;
        double iowastfgm = 1031;
        double iowastfga = 2186;
        double iowastfgptg = 0;
        double iowast2ptfgm = 687;
        double iowast2ptfga = 1326;
        double iowast2ptfgptg = 0;
        double iowast3ptfgm = 344;
        double iowast3ptfga = 860;
        double iowast3ptfgptg = 0;
        double iowastassists = 553;
        double iowastassistspergame = 0;
        double iowastassistsperfgm = 0;
        double iowastassiststoturnoverratio = 0;
        double iowastturnovers = 355;
        double iowastturnoverspergame = 0;
        double iowastblocks = 124;
        double iowastblockspergame = 0;
        double iowaststeals = 272;
        double iowaststealspergame = 0;
        double iowastfta = 604;
        double iowastftm = 423;
        double iowastturnoverpercentage = 0;
        double iowastftpercentage = 0;
        double iowastrebounds = 1219;
        double iowastoffrebounds = 317;
        double iowastdefrebounds = 902;
        double iowastreboundspergame = 0;
        double iowastoffreboundspergame = 0;
        double iowastdefreboundspergame = 0;
        double iowastpossessions = 0;
        double iowastoppfga = 2178;
        double iowastoppfta = 558;
        double iowastopporb = 416;
        double iowasttoforced = 491;
        double iowastdefrating = 0;
        double iowasteffectivefgpercentage = 0;
        double iowastteamgamescore = 0;
        double iowastfouls = 557;
        double iowastnetrating = 0;
        double iowastoffensiverating = 0;
        double iowastpace = 0;
        double iowastminutesplayed = 7125;
        double iowasttrueshootingpercentage = 0;
        iowastwinpercentage = (iowastwins/iowastgamesplayed)*100;
        iowastppg = (iowastpointsscored/iowastgamesplayed);
        iowastpapg = (iowastpointsallowed/iowastgamesplayed);
        iowastfgptg = (iowastfgm/iowastfga)*100;
        iowast2ptfgptg = (iowast2ptfgm/iowast2ptfga)*100;
        iowast3ptfgptg = (iowast3ptfgm/iowast3ptfga)*100;
        iowastassistspergame = (iowastassists/iowastgamesplayed);
        iowastassistsperfgm = (iowastassists/iowastfgm);
        iowastassiststoturnoverratio = (iowastassists/iowastturnovers);
        iowastblockspergame = (iowastblocks/iowastgamesplayed);
        iowaststealspergame = (iowaststeals/iowastgamesplayed);
        iowastturnoverspergame = (iowastturnovers/iowastgamesplayed);
        iowastturnoverpercentage = (100*iowastturnovers)/(iowastfga+(0.475*iowastfta)+iowastturnovers);
        iowastftpercentage = (iowastftm/iowastfta)*100;
        iowastreboundspergame = (iowastrebounds/iowastgamesplayed);
        iowastoffreboundspergame = (iowastoffrebounds/iowastgamesplayed);
        iowastdefreboundspergame = (iowastdefrebounds/iowastgamesplayed);
        iowastpossessions = (0.5 * (iowastfga + (0.475 * iowastfta) - iowastoffrebounds + iowastturnovers) + 0.5 * (iowastoppfga + (0.475 * iowastoppfta) - iowastopporb + iowasttoforced));
        iowastdefrating = 100*(iowastpointsallowed/iowastpossessions);
        iowasteffectivefgpercentage = ((iowastfgm+(0.5*iowast3ptfgm))/iowastfga)*100;
        iowastteamgamescore = ((iowastpointsscored + (0.4 * iowastfgm) - (0.7 * iowastfga) - (0.4*(iowastfta - iowastftm)) + (0.7 * iowastoffrebounds) + (0.3 * iowastdefrebounds) + iowaststeals + (0.7 * iowastassists) + (0.7 * iowastblocks) - (0.4 * iowastfouls) - iowastturnovers)/8)/iowastgamesplayed;
        iowastnetrating = 100 * ((iowastpointsscored - iowastpointsallowed) / iowastpossessions);
        iowastoffensiverating = 100 * (iowastpointsscored / iowastpossessions);
        iowastpace = 40 * (iowastpossessions / (0.2 * iowastminutesplayed));
        iowasttrueshootingpercentage = (iowastpointsscored / (2 * (iowastfga + 0.475 * iowastfta)))*100;
        System.out.println("\nIowa St:\n" + iowastwinpercentage + "% Win Percentage\n" + iowastppg +
                " Points Per Game\n"+iowastpapg+ " Points Allowed Per Game\n"+iowastfgptg+
                "% Field Goal Percentage\n"+iowast2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +iowast3ptfgptg+"% 3 Point Field Goal Percentage\n"+iowastassistspergame+" Assists Per Game\n"+
                iowastassistsperfgm+" Assists Per FGM\n"+ iowastassiststoturnoverratio+" Assists : TO Ratio\n"+
                iowastblockspergame+" Blocks Per Game\n"+iowaststealspergame+" Steals Per Game\n"+
                iowastturnoverspergame+" TO Per Game\n"+iowastturnoverpercentage+" TO%\n"+ iowastftpercentage+" FT%\n"+
                iowastreboundspergame+" Rebounds Per Game\n"+iowastoffreboundspergame+" Offensive Rebounds Per game\n"+
                iowastdefreboundspergame+" Defensive Rebounds Per Game\n"+iowastpossessions+" Possessions\n"+
                iowastdefrating+" Defensive Rating\n"+iowasteffectivefgpercentage+" EFG%\n"+iowastteamgamescore+" Team Game Score\n"
                +iowastnetrating+" Net Rating\n"+iowastoffensiverating+" Offensive Rating\n"+iowastpace+" Pace\n"+iowasttrueshootingpercentage+" True Shooting Percentage\n");
				
		double purduewins = 27;
        double purduegamesplayed = 35;
        double purduewinpercentage = 0;
        double purduepointsscored = 2790;
        double purdueppg = 0;
        double purduepointsallowed = 2393;
        double purduepapg = 0;
        double purduefgm = 980;
        double purduefga = 2044;
        double purduefgptg = 0;
        double purdue2ptfgm = 665;
        double purdue2ptfga = 1262;
        double purdue2ptfgptg = 0;
        double purdue3ptfgm = 315;
        double purdue3ptfga = 782;
        double purdue3ptfgptg = 0;
        double purdueassists = 640;
        double purdueassistspergame = 0;
        double purdueassistsperfgm = 0;
        double purdueassiststoturnoverratio = 0;
        double purdueturnovers = 454;
        double purdueturnoverspergame = 0;
        double purdueblocks = 87;
        double purdueblockspergame = 0;
        double purduesteals = 181;
        double purduestealspergame = 0;
        double purduefta = 680;
        double purdueftm = 515;
        double purdueturnoverpercentage = 0;
        double purdueftpercentage = 0;
        double purduerebounds = 1322;
        double purdueoffrebounds = 340;
        double purduedefrebounds = 982;
        double purduereboundspergame = 0;
        double purdueoffreboundspergame = 0;
        double purduedefreboundspergame = 0;
        double purduepossessions = 0;
        double purdueoppfga = 2145;
        double purdueoppfta = 491;
        double purdueopporb = 313;
        double purduetoforced = 411;
        double purduedefrating = 0;
        double purdueeffectivefgpercentage = 0;
        double purdueteamgamescore = 0;
        double purduefouls = 666;
        double purduenetrating = 0;
        double purdueoffensiverating = 0;
        double purduepace = 0;
        double purdueminutesplayed = 7075;
        double purduetrueshootingpercentage = 0;
        purduewinpercentage = (purduewins/purduegamesplayed)*100;
        purdueppg = (purduepointsscored/purduegamesplayed);
        purduepapg = (purduepointsallowed/purduegamesplayed);
        purduefgptg = (purduefgm/purduefga)*100;
        purdue2ptfgptg = (purdue2ptfgm/purdue2ptfga)*100;
        purdue3ptfgptg = (purdue3ptfgm/purdue3ptfga)*100;
        purdueassistspergame = (purdueassists/purduegamesplayed);
        purdueassistsperfgm = (purdueassists/purduefgm);
        purdueassiststoturnoverratio = (purdueassists/purdueturnovers);
        purdueblockspergame = (purdueblocks/purduegamesplayed);
        purduestealspergame = (purduesteals/purduegamesplayed);
        purdueturnoverspergame = (purdueturnovers/purduegamesplayed);
        purdueturnoverpercentage = (100*purdueturnovers)/(purduefga+(0.475*purduefta)+purdueturnovers);
        purdueftpercentage = (purdueftm/purduefta)*100;
        purduereboundspergame = (purduerebounds/purduegamesplayed);
        purdueoffreboundspergame = (purdueoffrebounds/purduegamesplayed);
        purduedefreboundspergame = (purduedefrebounds/purduegamesplayed);
        purduepossessions = (0.5 * (purduefga + (0.475 * purduefta) - purdueoffrebounds + purdueturnovers) + 0.5 * (purdueoppfga + (0.475 * purdueoppfta) - purdueopporb + purduetoforced));
        purduedefrating = 100*(purduepointsallowed/purduepossessions);
        purdueeffectivefgpercentage = ((purduefgm+(0.5*purdue3ptfgm))/purduefga)*100;
        purdueteamgamescore = ((purduepointsscored + (0.4 * purduefgm) - (0.7 * purduefga) - (0.4*(purduefta - purdueftm)) + (0.7 * purdueoffrebounds) + (0.3 * purduedefrebounds) + purduesteals + (0.7 * purdueassists) + (0.7 * purdueblocks) - (0.4 * purduefouls) - purdueturnovers)/8)/purduegamesplayed;
        purduenetrating = 100 * ((purduepointsscored - purduepointsallowed) / purduepossessions);
        purdueoffensiverating = 100 * (purduepointsscored / purduepossessions);
        purduepace = 40 * (purduepossessions / (0.2 * purdueminutesplayed));
        purduetrueshootingpercentage = (purduepointsscored / (2 * (purduefga + 0.475 * purduefta)))*100;
        System.out.println("\nPurdue:\n" + purduewinpercentage + "% Win Percentage\n" + purdueppg +
                " Points Per Game\n"+purduepapg+ " Points Allowed Per Game\n"+purduefgptg+
                "% Field Goal Percentage\n"+purdue2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +purdue3ptfgptg+"% 3 Point Field Goal Percentage\n"+purdueassistspergame+" Assists Per Game\n"+
                purdueassistsperfgm+" Assists Per FGM\n"+ purdueassiststoturnoverratio+" Assists : TO Ratio\n"+
                purdueblockspergame+" Blocks Per Game\n"+purduestealspergame+" Steals Per Game\n"+
                purdueturnoverspergame+" TO Per Game\n"+purdueturnoverpercentage+" TO%\n"+ purdueftpercentage+" FT%\n"+
                purduereboundspergame+" Rebounds Per Game\n"+purdueoffreboundspergame+" Offensive Rebounds Per game\n"+
                purduedefreboundspergame+" Defensive Rebounds Per Game\n"+purduepossessions+" Possessions\n"+
                purduedefrating+" Defensive Rating\n"+purdueeffectivefgpercentage+" EFG%\n"+purdueteamgamescore+" Team Game Score\n"
                +purduenetrating+" Net Rating\n"+purdueoffensiverating+" Offensive Rating\n"+purduepace+" Pace\n"+purduetrueshootingpercentage+" True Shooting Percentage\n");
				
				
		double baylorwins = 27;
        double baylorgamesplayed = 35;
        double baylorwinpercentage = 0;
        double baylorpointsscored = 2550;
        double baylorppg = 0;
        double baylorpointsallowed = 2228;
        double baylorpapg = 0;
        double baylorfgm = 921;
        double baylorfga = 1956;
        double baylorfgptg = 0;
        double baylor2ptfgm = 691;
        double baylor2ptfga = 1315;
        double baylor2ptfgptg = 0;
        double baylor3ptfgm = 230;
        double baylor3ptfga = 641;
        double baylor3ptfgptg = 0;
        double baylorassists = 544;
        double baylorassistspergame = 0;
        double baylorassistsperfgm = 0;
        double baylorassiststoturnoverratio = 0;
        double baylorturnovers = 469;
        double baylorturnoverspergame = 0;
        double baylorblocks = 166;
        double baylorblockspergame = 0;
        double baylorsteals = 180;
        double baylorstealspergame = 0;
        double baylorfta = 661;
        double baylorftm = 478;
        double baylorturnoverpercentage = 0;
        double baylorftpercentage = 0;
        double baylorrebounds = 1329;
        double bayloroffrebounds = 445;
        double baylordefrebounds = 884;
        double baylorreboundspergame = 0;
        double bayloroffreboundspergame = 0;
        double baylordefreboundspergame = 0;
        double baylorpossessions = 0;
        double bayloroppfga = 1960;
        double bayloroppfta = 586;
        double bayloropporb = 351;
        double baylortoforced = 397;
        double baylordefrating = 0;
        double bayloreffectivefgpercentage = 0;
        double baylorteamgamescore = 0;
        double baylorfouls = 617;
        double baylornetrating = 0;
        double bayloroffensiverating = 0;
        double baylorpace = 0;
        double baylorminutesplayed = 7000;
        double baylortrueshootingpercentage = 0;
        baylorwinpercentage = (baylorwins/baylorgamesplayed)*100;
        baylorppg = (baylorpointsscored/baylorgamesplayed);
        baylorpapg = (baylorpointsallowed/baylorgamesplayed);
        baylorfgptg = (baylorfgm/baylorfga)*100;
        baylor2ptfgptg = (baylor2ptfgm/baylor2ptfga)*100;
        baylor3ptfgptg = (baylor3ptfgm/baylor3ptfga)*100;
        baylorassistspergame = (baylorassists/baylorgamesplayed);
        baylorassistsperfgm = (baylorassists/baylorfgm);
        baylorassiststoturnoverratio = (baylorassists/baylorturnovers);
        baylorblockspergame = (baylorblocks/baylorgamesplayed);
        baylorstealspergame = (baylorsteals/baylorgamesplayed);
        baylorturnoverspergame = (baylorturnovers/baylorgamesplayed);
        baylorturnoverpercentage = (100*baylorturnovers)/(baylorfga+(0.475*baylorfta)+baylorturnovers);
        baylorftpercentage = (baylorftm/baylorfta)*100;
        baylorreboundspergame = (baylorrebounds/baylorgamesplayed);
        bayloroffreboundspergame = (bayloroffrebounds/baylorgamesplayed);
        baylordefreboundspergame = (baylordefrebounds/baylorgamesplayed);
        baylorpossessions = (0.5 * (baylorfga + (0.475 * baylorfta) - bayloroffrebounds + baylorturnovers) + 0.5 * (bayloroppfga + (0.475 * bayloroppfta) - bayloropporb + baylortoforced));
        baylordefrating = 100*(baylorpointsallowed/baylorpossessions);
        bayloreffectivefgpercentage = ((baylorfgm+(0.5*baylor3ptfgm))/baylorfga)*100;
        baylorteamgamescore = ((baylorpointsscored + (0.4 * baylorfgm) - (0.7 * baylorfga) - (0.4*(baylorfta - baylorftm)) + (0.7 * bayloroffrebounds) + (0.3 * baylordefrebounds) + baylorsteals + (0.7 * baylorassists) + (0.7 * baylorblocks) - (0.4 * baylorfouls) - baylorturnovers)/8)/baylorgamesplayed;
        baylornetrating = 100 * ((baylorpointsscored - baylorpointsallowed) / baylorpossessions);
        bayloroffensiverating = 100 * (baylorpointsscored / baylorpossessions);
        baylorpace = 40 * (baylorpossessions / (0.2 * baylorminutesplayed));
        baylortrueshootingpercentage = (baylorpointsscored / (2 * (baylorfga + 0.475 * baylorfta)))*100;
        System.out.println("\nBaylor:\n" + baylorwinpercentage + "% Win Percentage\n" + baylorppg +
                " Points Per Game\n"+baylorpapg+ " Points Allowed Per Game\n"+baylorfgptg+
                "% Field Goal Percentage\n"+baylor2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +baylor3ptfgptg+"% 3 Point Field Goal Percentage\n"+baylorassistspergame+" Assists Per Game\n"+
                baylorassistsperfgm+" Assists Per FGM\n"+ baylorassiststoturnoverratio+" Assists : TO Ratio\n"+
                baylorblockspergame+" Blocks Per Game\n"+baylorstealspergame+" Steals Per Game\n"+
                baylorturnoverspergame+" TO Per Game\n"+baylorturnoverpercentage+" TO%\n"+ baylorftpercentage+" FT%\n"+
                baylorreboundspergame+" Rebounds Per Game\n"+bayloroffreboundspergame+" Offensive Rebounds Per game\n"+
                baylordefreboundspergame+" Defensive Rebounds Per Game\n"+baylorpossessions+" Possessions\n"+
                baylordefrating+" Defensive Rating\n"+bayloreffectivefgpercentage+" EFG%\n"+baylorteamgamescore+" Team Game Score\n"
                +baylornetrating+" Net Rating\n"+bayloroffensiverating+" Offensive Rating\n"+baylorpace+" Pace\n"+baylortrueshootingpercentage+" True Shooting Percentage");
				
				
		double wisconsinwins = 27;
        double wisconsingamesplayed = 37;
        double wisconsinwinpercentage = 0;
        double wisconsinpointsscored = 2678;
        double wisconsinppg = 0;
        double wisconsinpointsallowed = 2308;
        double wisconsinpapg = 0;
        double wisconsinfgm = 971;
        double wisconsinfga = 2135;
        double wisconsinfgptg = 0;
        double wisconsin2ptfgm = 688;
        double wisconsin2ptfga = 1347;
        double wisconsin2ptfgptg = 0;
        double wisconsin3ptfgm = 283;
        double wisconsin3ptfga = 788;
        double wisconsin3ptfgptg = 0;
        double wisconsinassists = 504;
        double wisconsinassistspergame = 0;
        double wisconsinassistsperfgm = 0;
        double wisconsinassiststoturnoverratio = 0;
        double wisconsinturnovers = 410;
        double wisconsinturnoverspergame = 0;
        double wisconsinblocks = 130;
        double wisconsinblockspergame = 0;
        double wisconsinsteals = 250;
        double wisconsinstealspergame = 0;
        double wisconsinfta = 703;
        double wisconsinftm = 453;
        double wisconsinturnoverpercentage = 0;
        double wisconsinftpercentage = 0;
        double wisconsinrebounds = 1377;
        double wisconsinoffrebounds = 452;
        double wisconsindefrebounds = 925;
        double wisconsinreboundspergame = 0;
        double wisconsinoffreboundspergame = 0;
        double wisconsindefreboundspergame = 0;
        double wisconsinpossessions = 0;
        double wisconsinoppfga = 1992;
        double wisconsinoppfta = 559;
        double wisconsinopporb = 313;
        double wisconsintoforced = 473;
        double wisconsindefrating = 0;
        double wisconsineffectivefgpercentage = 0;
        double wisconsinteamgamescore = 0;
        double wisconsinfouls = 678;
        double wisconsinnetrating = 0;
        double wisconsinoffensiverating = 0;
        double wisconsinpace = 0;
        double wisconsinminutesplayed = 7500;
        double wisconsintrueshootingpercentage = 0;
        wisconsinwinpercentage = (wisconsinwins/wisconsingamesplayed)*100;
        wisconsinppg = (wisconsinpointsscored/wisconsingamesplayed);
        wisconsinpapg = (wisconsinpointsallowed/wisconsingamesplayed);
        wisconsinfgptg = (wisconsinfgm/wisconsinfga)*100;
        wisconsin2ptfgptg = (wisconsin2ptfgm/wisconsin2ptfga)*100;
        wisconsin3ptfgptg = (wisconsin3ptfgm/wisconsin3ptfga)*100;
        wisconsinassistspergame = (wisconsinassists/wisconsingamesplayed);
        wisconsinassistsperfgm = (wisconsinassists/wisconsinfgm);
        wisconsinassiststoturnoverratio = (wisconsinassists/wisconsinturnovers);
        wisconsinblockspergame = (wisconsinblocks/wisconsingamesplayed);
        wisconsinstealspergame = (wisconsinsteals/wisconsingamesplayed);
        wisconsinturnoverspergame = (wisconsinturnovers/wisconsingamesplayed);
        wisconsinturnoverpercentage = (100*wisconsinturnovers)/(wisconsinfga+(0.475*wisconsinfta)+wisconsinturnovers);
        wisconsinftpercentage = (wisconsinftm/wisconsinfta)*100;
        wisconsinreboundspergame = (wisconsinrebounds/wisconsingamesplayed);
        wisconsinoffreboundspergame = (wisconsinoffrebounds/wisconsingamesplayed);
        wisconsindefreboundspergame = (wisconsindefrebounds/wisconsingamesplayed);
        wisconsinpossessions = (0.5 * (wisconsinfga + (0.475 * wisconsinfta) - wisconsinoffrebounds + wisconsinturnovers) + 0.5 * (wisconsinoppfga + (0.475 * wisconsinoppfta) - wisconsinopporb + wisconsintoforced));
        wisconsindefrating = 100*(wisconsinpointsallowed/wisconsinpossessions);
        wisconsineffectivefgpercentage = ((wisconsinfgm+(0.5*wisconsin3ptfgm))/wisconsinfga)*100;
        wisconsinteamgamescore = ((wisconsinpointsscored + (0.4 * wisconsinfgm) - (0.7 * wisconsinfga) - (0.4*(wisconsinfta - wisconsinftm)) + (0.7 * wisconsinoffrebounds) + (0.3 * wisconsindefrebounds) + wisconsinsteals + (0.7 * wisconsinassists) + (0.7 * wisconsinblocks) - (0.4 * wisconsinfouls) - wisconsinturnovers)/8)/wisconsingamesplayed;
        wisconsinnetrating = 100 * ((wisconsinpointsscored - wisconsinpointsallowed) / wisconsinpossessions);
        wisconsinoffensiverating = 100 * (wisconsinpointsscored / wisconsinpossessions);
        wisconsinpace = 40 * (wisconsinpossessions / (0.2 * wisconsinminutesplayed));
        wisconsintrueshootingpercentage = (wisconsinpointsscored / (2 * (wisconsinfga + 0.475 * wisconsinfta)))*100;
        System.out.println("\nWisconsin:\n" + wisconsinwinpercentage + "% Win Percentage\n" + wisconsinppg +
                " Points Per Game\n"+wisconsinpapg+ " Points Allowed Per Game\n"+wisconsinfgptg+
                "% Field Goal Percentage\n"+wisconsin2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +wisconsin3ptfgptg+"% 3 Point Field Goal Percentage\n"+wisconsinassistspergame+" Assists Per Game\n"+
                wisconsinassistsperfgm+" Assists Per FGM\n"+ wisconsinassiststoturnoverratio+" Assists : TO Ratio\n"+
                wisconsinblockspergame+" Blocks Per Game\n"+wisconsinstealspergame+" Steals Per Game\n"+
                wisconsinturnoverspergame+" TO Per Game\n"+wisconsinturnoverpercentage+" TO%\n"+ wisconsinftpercentage+" FT%\n"+
                wisconsinreboundspergame+" Rebounds Per Game\n"+wisconsinoffreboundspergame+" Offensive Rebounds Per game\n"+
                wisconsindefreboundspergame+" Defensive Rebounds Per Game\n"+wisconsinpossessions+" Possessions\n"+
                wisconsindefrating+" Defensive Rating\n"+wisconsineffectivefgpercentage+" EFG%\n"+wisconsinteamgamescore+" Team Game Score\n"
                +wisconsinnetrating+" Net Rating\n"+wisconsinoffensiverating+" Offensive Rating\n"+wisconsinpace+" Pace\n"+wisconsintrueshootingpercentage+" True Shooting Percentage");
				
				
		double oklahomastwins = 20;
        double oklahomastgamesplayed = 33;
        double oklahomastwinpercentage = 0;
        double oklahomastpointsscored = 2828;
        double oklahomastppg = 0;
        double oklahomastpointsallowed = 2589;
        double oklahomastpapg = 0;
        double oklahomastfgm = 957;
        double oklahomastfga = 2050;
        double oklahomastfgptg = 0;
        double oklahomast2ptfgm = 663;
        double oklahomast2ptfga = 1318;
        double oklahomast2ptfgptg = 0;
        double oklahomast3ptfgm = 294;
        double oklahomast3ptfga = 732;
        double oklahomast3ptfgptg = 0;
        double oklahomastassists = 486;
        double oklahomastassistspergame = 0;
        double oklahomastassistsperfgm = 0;
        double oklahomastassiststoturnoverratio = 0;
        double oklahomastturnovers = 432;
        double oklahomastturnoverspergame = 0;
        double oklahomastblocks = 99;
        double oklahomastblockspergame = 0;
        double oklahomaststeals = 252;
        double oklahomaststealspergame = 0;
        double oklahomastfta = 786;
        double oklahomastftm = 620;
        double oklahomastturnoverpercentage = 0;
        double oklahomastftpercentage = 0;
        double oklahomastrebounds = 1215;
        double oklahomastoffrebounds = 450;
        double oklahomastdefrebounds = 765;
        double oklahomastreboundspergame = 0;
        double oklahomastoffreboundspergame = 0;
        double oklahomastdefreboundspergame = 0;
        double oklahomastpossessions = 0;
        double oklahomastoppfga = 1856;
        double oklahomastoppfta = 834;
        double oklahomastopporb = 345;
        double oklahomasttoforced = 491;
        double oklahomastdefrating = 0;
        double oklahomasteffectivefgpercentage = 0;
        double oklahomastteamgamescore = 0;
        double oklahomastfouls = 730;
        double oklahomastnetrating = 0;
        double oklahomastoffensiverating = 0;
        double oklahomastpace = 0;
        double oklahomastminutesplayed = 6600;
        double oklahomasttrueshootingpercentage = 0;
        oklahomastwinpercentage = (oklahomastwins/oklahomastgamesplayed)*100;
        oklahomastppg = (oklahomastpointsscored/oklahomastgamesplayed);
        oklahomastpapg = (oklahomastpointsallowed/oklahomastgamesplayed);
        oklahomastfgptg = (oklahomastfgm/oklahomastfga)*100;
        oklahomast2ptfgptg = (oklahomast2ptfgm/oklahomast2ptfga)*100;
        oklahomast3ptfgptg = (oklahomast3ptfgm/oklahomast3ptfga)*100;
        oklahomastassistspergame = (oklahomastassists/oklahomastgamesplayed);
        oklahomastassistsperfgm = (oklahomastassists/oklahomastfgm);
        oklahomastassiststoturnoverratio = (oklahomastassists/oklahomastturnovers);
        oklahomastblockspergame = (oklahomastblocks/oklahomastgamesplayed);
        oklahomaststealspergame = (oklahomaststeals/oklahomastgamesplayed);
        oklahomastturnoverspergame = (oklahomastturnovers/oklahomastgamesplayed);
        oklahomastturnoverpercentage = (100*oklahomastturnovers)/(oklahomastfga+(0.475*oklahomastfta)+oklahomastturnovers);
        oklahomastftpercentage = (oklahomastftm/oklahomastfta)*100;
        oklahomastreboundspergame = (oklahomastrebounds/oklahomastgamesplayed);
        oklahomastoffreboundspergame = (oklahomastoffrebounds/oklahomastgamesplayed);
        oklahomastdefreboundspergame = (oklahomastdefrebounds/oklahomastgamesplayed);
        oklahomastpossessions = (0.5 * (oklahomastfga + (0.475 * oklahomastfta) - oklahomastoffrebounds + oklahomastturnovers) + 0.5 * (oklahomastoppfga + (0.475 * oklahomastoppfta) - oklahomastopporb + oklahomasttoforced));
        oklahomastdefrating = 100*(oklahomastpointsallowed/oklahomastpossessions);
        oklahomasteffectivefgpercentage = ((oklahomastfgm+(0.5*oklahomast3ptfgm))/oklahomastfga)*100;
        oklahomastteamgamescore = ((oklahomastpointsscored + (0.4 * oklahomastfgm) - (0.7 * oklahomastfga) - (0.4*(oklahomastfta - oklahomastftm)) + (0.7 * oklahomastoffrebounds) + (0.3 * oklahomastdefrebounds) + oklahomaststeals + (0.7 * oklahomastassists) + (0.7 * oklahomastblocks) - (0.4 * oklahomastfouls) - oklahomastturnovers)/8)/oklahomastgamesplayed;
        oklahomastnetrating = 100 * ((oklahomastpointsscored - oklahomastpointsallowed) / oklahomastpossessions);
        oklahomastoffensiverating = 100 * (oklahomastpointsscored / oklahomastpossessions);
        oklahomastpace = 40 * (oklahomastpossessions / (0.2 * oklahomastminutesplayed));
        oklahomasttrueshootingpercentage = (oklahomastpointsscored / (2 * (oklahomastfga + 0.475 * oklahomastfta)))*100;
        System.out.println("\nOklahoma St:\n" + oklahomastwinpercentage + "% Win Percentage\n" + oklahomastppg +
                " Points Per Game\n"+oklahomastpapg+ " Points Allowed Per Game\n"+oklahomastfgptg+
                "% Field Goal Percentage\n"+oklahomast2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +oklahomast3ptfgptg+"% 3 Point Field Goal Percentage\n"+oklahomastassistspergame+" Assists Per Game\n"+
                oklahomastassistsperfgm+" Assists Per FGM\n"+ oklahomastassiststoturnoverratio+" Assists : TO Ratio\n"+
                oklahomastblockspergame+" Blocks Per Game\n"+oklahomaststealspergame+" Steals Per Game\n"+
                oklahomastturnoverspergame+" TO Per Game\n"+oklahomastturnoverpercentage+" TO%\n"+ oklahomastftpercentage+" FT%\n"+
                oklahomastreboundspergame+" Rebounds Per Game\n"+oklahomastoffreboundspergame+" Offensive Rebounds Per game\n"+
                oklahomastdefreboundspergame+" Defensive Rebounds Per Game\n"+oklahomastpossessions+" Possessions\n"+
                oklahomastdefrating+" Defensive Rating\n"+oklahomasteffectivefgpercentage+" EFG%\n"+oklahomastteamgamescore+" Team Game Score\n"
                +oklahomastnetrating+" Net Rating\n"+oklahomastoffensiverating+" Offensive Rating\n"+oklahomastpace+" Pace\n"+oklahomasttrueshootingpercentage+" True Shooting Percentage");
				
				
		double floridastwins = 26;
        double floridastgamesplayed = 35;
        double floridastwinpercentage = 0;
        double floridastpointsscored = 2873;
        double floridastppg = 0;
        double floridastpointsallowed = 2523;
        double floridastpapg = 0;
        double floridastfgm = 1036;
        double floridastfga = 2146;
        double floridastfgptg = 0;
        double floridast2ptfgm = 803;
        double floridast2ptfga = 1475;
        double floridast2ptfgptg = 0;
        double floridast3ptfgm = 233;
        double floridast3ptfga = 671;
        double floridast3ptfgptg = 0;
        double floridastassists = 511;
        double floridastassistspergame = 0;
        double floridastassistsperfgm = 0;
        double floridastassiststoturnoverratio = 0;
        double floridastturnovers = 415;
        double floridastturnoverspergame = 0;
        double floridastblocks = 180;
        double floridastblockspergame = 0;
        double floridaststeals = 259;
        double floridaststealspergame = 0;
        double floridastfta = 824;
        double floridastftm = 568;
        double floridastturnoverpercentage = 0;
        double floridastftpercentage = 0;
        double floridastrebounds = 1324;
        double floridastoffrebounds = 405;
        double floridastdefrebounds = 919;
        double floridastreboundspergame = 0;
        double floridastoffreboundspergame = 0;
        double floridastdefreboundspergame = 0;
        double floridastpossessions = 0;
        double floridastoppfga = 2060;
        double floridastoppfta = 769;
        double floridastopporb = 382;
        double floridasttoforced = 494;
        double floridastdefrating = 0;
        double floridasteffectivefgpercentage = 0;
        double floridastteamgamescore = 0;
        double floridastfouls = 684;
        double floridastnetrating = 0;
        double floridastoffensiverating = 0;
        double floridastpace = 0;
        double floridastminutesplayed = 7000;
        double floridasttrueshootingpercentage = 0;
        floridastwinpercentage = (floridastwins/floridastgamesplayed)*100;
        floridastppg = (floridastpointsscored/floridastgamesplayed);
        floridastpapg = (floridastpointsallowed/floridastgamesplayed);
        floridastfgptg = (floridastfgm/floridastfga)*100;
        floridast2ptfgptg = (floridast2ptfgm/floridast2ptfga)*100;
        floridast3ptfgptg = (floridast3ptfgm/floridast3ptfga)*100;
        floridastassistspergame = (floridastassists/floridastgamesplayed);
        floridastassistsperfgm = (floridastassists/floridastfgm);
        floridastassiststoturnoverratio = (floridastassists/floridastturnovers);
        floridastblockspergame = (floridastblocks/floridastgamesplayed);
        floridaststealspergame = (floridaststeals/floridastgamesplayed);
        floridastturnoverspergame = (floridastturnovers/floridastgamesplayed);
        floridastturnoverpercentage = (100*floridastturnovers)/(floridastfga+(0.475*floridastfta)+floridastturnovers);
        floridastftpercentage = (floridastftm/floridastfta)*100;
        floridastreboundspergame = (floridastrebounds/floridastgamesplayed);
        floridastoffreboundspergame = (floridastoffrebounds/floridastgamesplayed);
        floridastdefreboundspergame = (floridastdefrebounds/floridastgamesplayed);
        floridastpossessions = (0.5 * (floridastfga + (0.475 * floridastfta) - floridastoffrebounds + floridastturnovers) + 0.5 * (floridastoppfga + (0.475 * floridastoppfta) - floridastopporb + floridasttoforced));
        floridastdefrating = 100*(floridastpointsallowed/floridastpossessions);
        floridasteffectivefgpercentage = ((floridastfgm+(0.5*floridast3ptfgm))/floridastfga)*100;
        floridastteamgamescore = ((floridastpointsscored + (0.4 * floridastfgm) - (0.7 * floridastfga) - (0.4*(floridastfta - floridastftm)) + (0.7 * floridastoffrebounds) + (0.3 * floridastdefrebounds) + floridaststeals + (0.7 * floridastassists) + (0.7 * floridastblocks) - (0.4 * floridastfouls) - floridastturnovers)/8)/floridastgamesplayed;
        floridastnetrating = 100 * ((floridastpointsscored - floridastpointsallowed) / floridastpossessions);
        floridastoffensiverating = 100 * (floridastpointsscored / floridastpossessions);
        floridastpace = 40 * (floridastpossessions / (0.2 * floridastminutesplayed));
        floridasttrueshootingpercentage = (floridastpointsscored / (2 * (floridastfga + 0.475 * floridastfta)))*100;
        System.out.println("\nFlorida St:\n" + floridastwinpercentage + "% Win Percentage\n" + floridastppg +
                " Points Per Game\n"+floridastpapg+ " Points Allowed Per Game\n"+floridastfgptg+
                "% Field Goal Percentage\n"+floridast2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +floridast3ptfgptg+"% 3 Point Field Goal Percentage\n"+floridastassistspergame+" Assists Per Game\n"+
                floridastassistsperfgm+" Assists Per FGM\n"+ floridastassiststoturnoverratio+" Assists : TO Ratio\n"+
                floridastblockspergame+" Blocks Per Game\n"+floridaststealspergame+" Steals Per Game\n"+
                floridastturnoverspergame+" TO Per Game\n"+floridastturnoverpercentage+" TO%\n"+ floridastftpercentage+" FT%\n"+
                floridastreboundspergame+" Rebounds Per Game\n"+floridastoffreboundspergame+" Offensive Rebounds Per game\n"+
                floridastdefreboundspergame+" Defensive Rebounds Per Game\n"+floridastpossessions+" Possessions\n"+
                floridastdefrating+" Defensive Rating\n"+floridasteffectivefgpercentage+" EFG%\n"+floridastteamgamescore+" Team Game Score\n"
                +floridastnetrating+" Net Rating\n"+floridastoffensiverating+" Offensive Rating\n"+floridastpace+" Pace\n"+floridasttrueshootingpercentage+" True Shooting Percentage");
				
		double michiganwins = 26;
        double michigangamesplayed = 38;
        double michiganwinpercentage = 0;
        double michiganpointsscored = 2851;
        double michiganppg = 0;
        double michiganpointsallowed = 2523;
        double michiganpapg = 0;
        double michiganfgm = 1002;
        double michiganfga = 2076;
        double michiganfgptg = 0;
        double michigan2ptfgm = 641;
        double michigan2ptfga = 1139;
        double michigan2ptfgptg = 0;
        double michigan3ptfgm = 361;
        double michigan3ptfga = 937;
        double michigan3ptfgptg = 0;
        double michiganassists = 527;
        double michiganassistspergame = 0;
        double michiganassistsperfgm = 0;
        double michiganassiststoturnoverratio = 0;
        double michiganturnovers = 349;
        double michiganturnoverspergame = 0;
        double michiganblocks = 108;
        double michiganblockspergame = 0;
        double michigansteals = 220;
        double michiganstealspergame = 0;
        double michiganfta = 624;
        double michiganftm = 486;
        double michiganturnoverpercentage = 0;
        double michiganftpercentage = 0;
        double michiganrebounds = 1111;
        double michiganoffrebounds = 274;
        double michigandefrebounds = 837;
        double michiganreboundspergame = 0;
        double michiganoffreboundspergame = 0;
        double michigandefreboundspergame = 0;
        double michiganpossessions = 0;
        double michiganoppfga = 2060;
        double michiganoppfta = 560;
        double michiganopporb = 348;
        double michigantoforced = 478;
        double michigandefrating = 0;
        double michiganeffectivefgpercentage = 0;
        double michiganteamgamescore = 0;
        double michiganfouls = 571;
        double michigannetrating = 0;
        double michiganoffensiverating = 0;
        double michiganpace = 0;
        double michiganminutesplayed = 7675;
        double michigantrueshootingpercentage = 0;
        michiganwinpercentage = (michiganwins/michigangamesplayed)*100;
        michiganppg = (michiganpointsscored/michigangamesplayed);
        michiganpapg = (michiganpointsallowed/michigangamesplayed);
        michiganfgptg = (michiganfgm/michiganfga)*100;
        michigan2ptfgptg = (michigan2ptfgm/michigan2ptfga)*100;
        michigan3ptfgptg = (michigan3ptfgm/michigan3ptfga)*100;
        michiganassistspergame = (michiganassists/michigangamesplayed);
        michiganassistsperfgm = (michiganassists/michiganfgm);
        michiganassiststoturnoverratio = (michiganassists/michiganturnovers);
        michiganblockspergame = (michiganblocks/michigangamesplayed);
        michiganstealspergame = (michigansteals/michigangamesplayed);
        michiganturnoverspergame = (michiganturnovers/michigangamesplayed);
        michiganturnoverpercentage = (100*michiganturnovers)/(michiganfga+(0.475*michiganfta)+michiganturnovers);
        michiganftpercentage = (michiganftm/michiganfta)*100;
        michiganreboundspergame = (michiganrebounds/michigangamesplayed);
        michiganoffreboundspergame = (michiganoffrebounds/michigangamesplayed);
        michigandefreboundspergame = (michigandefrebounds/michigangamesplayed);
        michiganpossessions = (0.5 * (michiganfga + (0.475 * michiganfta) - michiganoffrebounds + michiganturnovers) + 0.5 * (michiganoppfga + (0.475 * michiganoppfta) - michiganopporb + michigantoforced));
        michigandefrating = 100*(michiganpointsallowed/michiganpossessions);
        michiganeffectivefgpercentage = ((michiganfgm+(0.5*michigan3ptfgm))/michiganfga)*100;
        michiganteamgamescore = ((michiganpointsscored + (0.4 * michiganfgm) - (0.7 * michiganfga) - (0.4*(michiganfta - michiganftm)) + (0.7 * michiganoffrebounds) + (0.3 * michigandefrebounds) + michigansteals + (0.7 * michiganassists) + (0.7 * michiganblocks) - (0.4 * michiganfouls) - michiganturnovers)/8)/michigangamesplayed;
        michigannetrating = 100 * ((michiganpointsscored - michiganpointsallowed) / michiganpossessions);
        michiganoffensiverating = 100 * (michiganpointsscored / michiganpossessions);
        michiganpace = 40 * (michiganpossessions / (0.2 * michiganminutesplayed));
        michigantrueshootingpercentage = (michiganpointsscored / (2 * (michiganfga + 0.475 * michiganfta)))*100;
        System.out.println("\nMichigan:\n" + michiganwinpercentage + "% Win Percentage\n" + michiganppg +
                " Points Per Game\n"+michiganpapg+ " Points Allowed Per Game\n"+michiganfgptg+
                "% Field Goal Percentage\n"+michigan2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +michigan3ptfgptg+"% 3 Point Field Goal Percentage\n"+michiganassistspergame+" Assists Per Game\n"+
                michiganassistsperfgm+" Assists Per FGM\n"+ michiganassiststoturnoverratio+" Assists : TO Ratio\n"+
                michiganblockspergame+" Blocks Per Game\n"+michiganstealspergame+" Steals Per Game\n"+
                michiganturnoverspergame+" TO Per Game\n"+michiganturnoverpercentage+" TO%\n"+ michiganftpercentage+" FT%\n"+
                michiganreboundspergame+" Rebounds Per Game\n"+michiganoffreboundspergame+" Offensive Rebounds Per game\n"+
                michigandefreboundspergame+" Defensive Rebounds Per Game\n"+michiganpossessions+" Possessions\n"+
                michigandefrating+" Defensive Rating\n"+michiganeffectivefgpercentage+" EFG%\n"+michiganteamgamescore+" Team Game Score\n"
                +michigannetrating+" Net Rating\n"+michiganoffensiverating+" Offensive Rating\n"+michiganpace+" Pace\n"+michigantrueshootingpercentage+" True Shooting Percentage");
				
		double smuwins = 30;
        double smugamesplayed = 35;
        double smuwinpercentage = 0;
        double smupointsscored = 2599;
        double smuppg = 0;
        double smupointsallowed = 2100;
        double smupapg = 0;
        double smufgm = 914;
        double smufga = 1934;
        double smufgptg = 0;
        double smu2ptfgm = 628;
        double smu2ptfga = 1229;
        double smu2ptfgptg = 0;
        double smu3ptfgm = 286;
        double smu3ptfga = 705;
        double smu3ptfgptg = 0;
        double smuassists = 566;
        double smuassistspergame = 0;
        double smuassistsperfgm = 0;
        double smuassiststoturnoverratio = 0;
        double smuturnovers = 377;
        double smuturnoverspergame = 0;
        double smublocks = 117;
        double smublockspergame = 0;
        double smusteals = 200;
        double smustealspergame = 0;
        double smufta = 696;
        double smuftm = 485;
        double smuturnoverpercentage = 0;
        double smuftpercentage = 0;
        double smurebounds = 1335;
        double smuoffrebounds = 416;
        double smudefrebounds = 919;
        double smureboundspergame = 0;
        double smuoffreboundspergame = 0;
        double smudefreboundspergame = 0;
        double smupossessions = 0;
        double smuoppfga = 1928;
        double smuoppfta = 474;
        double smuopporb = 329;
        double smutoforced = 409;
        double smudefrating = 0;
        double smueffectivefgpercentage = 0;
        double smuteamgamescore = 0;
        double smufouls = 506;
        double smunetrating = 0;
        double smuoffensiverating = 0;
        double smupace = 0;
        double smuminutesplayed = 7000;
        double smutrueshootingpercentage = 0;
        smuwinpercentage = (smuwins/smugamesplayed)*100;
        smuppg = (smupointsscored/smugamesplayed);
        smupapg = (smupointsallowed/smugamesplayed);
        smufgptg = (smufgm/smufga)*100;
        smu2ptfgptg = (smu2ptfgm/smu2ptfga)*100;
        smu3ptfgptg = (smu3ptfgm/smu3ptfga)*100;
        smuassistspergame = (smuassists/smugamesplayed);
        smuassistsperfgm = (smuassists/smufgm);
        smuassiststoturnoverratio = (smuassists/smuturnovers);
        smublockspergame = (smublocks/smugamesplayed);
        smustealspergame = (smusteals/smugamesplayed);
        smuturnoverspergame = (smuturnovers/smugamesplayed);
        smuturnoverpercentage = (100*smuturnovers)/(smufga+(0.475*smufta)+smuturnovers);
        smuftpercentage = (smuftm/smufta)*100;
        smureboundspergame = (smurebounds/smugamesplayed);
        smuoffreboundspergame = (smuoffrebounds/smugamesplayed);
        smudefreboundspergame = (smudefrebounds/smugamesplayed);
        smupossessions = (0.5 * (smufga + (0.475 * smufta) - smuoffrebounds + smuturnovers) + 0.5 * (smuoppfga + (0.475 * smuoppfta) - smuopporb + smutoforced));
        smudefrating = 100*(smupointsallowed/smupossessions);
        smueffectivefgpercentage = ((smufgm+(0.5*smu3ptfgm))/smufga)*100;
        smuteamgamescore = ((smupointsscored + (0.4 * smufgm) - (0.7 * smufga) - (0.4*(smufta - smuftm)) + (0.7 * smuoffrebounds) + (0.3 * smudefrebounds) + smusteals + (0.7 * smuassists) + (0.7 * smublocks) - (0.4 * smufouls) - smuturnovers)/8)/smugamesplayed;
        smunetrating = 100 * ((smupointsscored - smupointsallowed) / smupossessions);
        smuoffensiverating = 100 * (smupointsscored / smupossessions);
        smupace = 40 * (smupossessions / (0.2 * smuminutesplayed));
        smutrueshootingpercentage = (smupointsscored / (2 * (smufga + 0.475 * smufta)))*100;
        System.out.println("\nSMU:\n" + smuwinpercentage + "% Win Percentage\n" + smuppg +
                " Points Per Game\n"+smupapg+ " Points Allowed Per Game\n"+smufgptg+
                "% Field Goal Percentage\n"+smu2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +smu3ptfgptg+"% 3 Point Field Goal Percentage\n"+smuassistspergame+" Assists Per Game\n"+
                smuassistsperfgm+" Assists Per FGM\n"+ smuassiststoturnoverratio+" Assists : TO Ratio\n"+
                smublockspergame+" Blocks Per Game\n"+smustealspergame+" Steals Per Game\n"+
                smuturnoverspergame+" TO Per Game\n"+smuturnoverpercentage+" TO%\n"+ smuftpercentage+" FT%\n"+
                smureboundspergame+" Rebounds Per Game\n"+smuoffreboundspergame+" Offensive Rebounds Per game\n"+
                smudefreboundspergame+" Defensive Rebounds Per Game\n"+smupossessions+" Possessions\n"+
                smudefrating+" Defensive Rating\n"+smueffectivefgpercentage+" EFG%\n"+smuteamgamescore+" Team Game Score\n"
                +smunetrating+" Net Rating\n"+smuoffensiverating+" Offensive Rating\n"+smupace+" Pace\n"+smutrueshootingpercentage+" True Shooting Percentage");


		double cincinnatiwins = 30;
        double cincinnatigamesplayed = 36;
        double cincinnatiwinpercentage = 0;
        double cincinnatipointsscored = 2674;
        double cincinnatippg = 0;
        double cincinnatipointsallowed = 2208;
        double cincinnatipapg = 0;
        double cincinnatifgm = 969;
        double cincinnatifga = 2116;
        double cincinnatifgptg = 0;
        double cincinnati2ptfgm = 705;
        double cincinnati2ptfga = 1352;
        double cincinnati2ptfgptg = 0;
        double cincinnati3ptfgm = 264;
        double cincinnati3ptfga = 764;
        double cincinnati3ptfgptg = 0;
        double cincinnatiassists = 557;
        double cincinnatiassistspergame = 0;
        double cincinnatiassistsperfgm = 0;
        double cincinnatiassiststoturnoverratio = 0;
        double cincinnatiturnovers = 364;
        double cincinnatiturnoverspergame = 0;
        double cincinnatiblocks = 173;
        double cincinnatiblockspergame = 0;
        double cincinnatisteals = 261;
        double cincinnatistealspergame = 0;
        double cincinnatifta = 688;
        double cincinnatiftm = 472;
        double cincinnatiturnoverpercentage = 0;
        double cincinnatiftpercentage = 0;
        double cincinnatirebounds = 1328;
        double cincinnatioffrebounds = 437;
        double cincinnatidefrebounds = 891;
        double cincinnatireboundspergame = 0;
        double cincinnatioffreboundspergame = 0;
        double cincinnatidefreboundspergame = 0;
        double cincinnatipossessions = 0;
        double cincinnatioppfga = 1974;
        double cincinnatioppfta = 575;
        double cincinnatiopporb = 368;
        double cincinnatitoforced = 475;
        double cincinnatidefrating = 0;
        double cincinnatieffectivefgpercentage = 0;
        double cincinnatiteamgamescore = 0;
        double cincinnatifouls = 566;
        double cincinnatinetrating = 0;
        double cincinnatioffensiverating = 0;
        double cincinnatipace = 0;
        double cincinnatiminutesplayed = 7250;
        double cincinnatitrueshootingpercentage = 0;
        cincinnatiwinpercentage = (cincinnatiwins/cincinnatigamesplayed)*100;
        cincinnatippg = (cincinnatipointsscored/cincinnatigamesplayed);
        cincinnatipapg = (cincinnatipointsallowed/cincinnatigamesplayed);
        cincinnatifgptg = (cincinnatifgm/cincinnatifga)*100;
        cincinnati2ptfgptg = (cincinnati2ptfgm/cincinnati2ptfga)*100;
        cincinnati3ptfgptg = (cincinnati3ptfgm/cincinnati3ptfga)*100;
        cincinnatiassistspergame = (cincinnatiassists/cincinnatigamesplayed);
        cincinnatiassistsperfgm = (cincinnatiassists/cincinnatifgm);
        cincinnatiassiststoturnoverratio = (cincinnatiassists/cincinnatiturnovers);
        cincinnatiblockspergame = (cincinnatiblocks/cincinnatigamesplayed);
        cincinnatistealspergame = (cincinnatisteals/cincinnatigamesplayed);
        cincinnatiturnoverspergame = (cincinnatiturnovers/cincinnatigamesplayed);
        cincinnatiturnoverpercentage = (100*cincinnatiturnovers)/(cincinnatifga+(0.475*cincinnatifta)+cincinnatiturnovers);
        cincinnatiftpercentage = (cincinnatiftm/cincinnatifta)*100;
        cincinnatireboundspergame = (cincinnatirebounds/cincinnatigamesplayed);
        cincinnatioffreboundspergame = (cincinnatioffrebounds/cincinnatigamesplayed);
        cincinnatidefreboundspergame = (cincinnatidefrebounds/cincinnatigamesplayed);
        cincinnatipossessions = (0.5 * (cincinnatifga + (0.475 * cincinnatifta) - cincinnatioffrebounds + cincinnatiturnovers) + 0.5 * (cincinnatioppfga + (0.475 * cincinnatioppfta) - cincinnatiopporb + cincinnatitoforced));
        cincinnatidefrating = 100*(cincinnatipointsallowed/cincinnatipossessions);
        cincinnatieffectivefgpercentage = ((cincinnatifgm+(0.5*cincinnati3ptfgm))/cincinnatifga)*100;
        cincinnatiteamgamescore = ((cincinnatipointsscored + (0.4 * cincinnatifgm) - (0.7 * cincinnatifga) - (0.4*(cincinnatifta - cincinnatiftm)) + (0.7 * cincinnatioffrebounds) + (0.3 * cincinnatidefrebounds) + cincinnatisteals + (0.7 * cincinnatiassists) + (0.7 * cincinnatiblocks) - (0.4 * cincinnatifouls) - cincinnatiturnovers)/8)/cincinnatigamesplayed;
        cincinnatinetrating = 100 * ((cincinnatipointsscored - cincinnatipointsallowed) / cincinnatipossessions);
        cincinnatioffensiverating = 100 * (cincinnatipointsscored / cincinnatipossessions);
        cincinnatipace = 40 * (cincinnatipossessions / (0.2 * cincinnatiminutesplayed));
        cincinnatitrueshootingpercentage = (cincinnatipointsscored / (2 * (cincinnatifga + 0.475 * cincinnatifta)))*100;
        System.out.println("\nCincinnati:\n" + cincinnatiwinpercentage + "% Win Percentage\n" + cincinnatippg +
                " Points Per Game\n"+cincinnatipapg+ " Points Allowed Per Game\n"+cincinnatifgptg+
                "% Field Goal Percentage\n"+cincinnati2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +cincinnati3ptfgptg+"% 3 Point Field Goal Percentage\n"+cincinnatiassistspergame+" Assists Per Game\n"+
                cincinnatiassistsperfgm+" Assists Per FGM\n"+ cincinnatiassiststoturnoverratio+" Assists : TO Ratio\n"+
                cincinnatiblockspergame+" Blocks Per Game\n"+cincinnatistealspergame+" Steals Per Game\n"+
                cincinnatiturnoverspergame+" TO Per Game\n"+cincinnatiturnoverpercentage+" TO%\n"+ cincinnatiftpercentage+" FT%\n"+
                cincinnatireboundspergame+" Rebounds Per Game\n"+cincinnatioffreboundspergame+" Offensive Rebounds Per game\n"+
                cincinnatidefreboundspergame+" Defensive Rebounds Per Game\n"+cincinnatipossessions+" Possessions\n"+
                cincinnatidefrating+" Defensive Rating\n"+cincinnatieffectivefgpercentage+" EFG%\n"+cincinnatiteamgamescore+" Team Game Score\n"
                +cincinnatinetrating+" Net Rating\n"+cincinnatioffensiverating+" Offensive Rating\n"+cincinnatipace+" Pace\n"+cincinnatitrueshootingpercentage+" True Shooting Percentage");
				
		double arizonawins = 32;
        double arizonagamesplayed = 37;
        double arizonawinpercentage = 0;
        double arizonapointsscored = 2833;
        double arizonappg = 0;
        double arizonapointsallowed = 2440;
        double arizonapapg = 0;
        double arizonafgm = 977;
        double arizonafga = 2048;
        double arizonafgptg = 0;
        double arizona2ptfgm = 733;
        double arizona2ptfga = 1423;
        double arizona2ptfgptg = 0;
        double arizona3ptfgm = 244;
        double arizona3ptfga = 625;
        double arizona3ptfgptg = 0;
        double arizonaassists = 501;
        double arizonaassistspergame = 0;
        double arizonaassistsperfgm = 0;
        double arizonaassiststoturnoverratio = 0;
        double arizonaturnovers = 414;
        double arizonaturnoverspergame = 0;
        double arizonablocks = 119;
        double arizonablockspergame = 0;
        double arizonasteals = 201;
        double arizonastealspergame = 0;
        double arizonafta = 830;
        double arizonaftm = 635;
        double arizonaturnoverpercentage = 0;
        double arizonaftpercentage = 0;
        double arizonarebounds = 1358;
        double arizonaoffrebounds = 379;
        double arizonadefrebounds = 979;
        double arizonareboundspergame = 0;
        double arizonaoffreboundspergame = 0;
        double arizonadefreboundspergame = 0;
        double arizonapossessions = 0;
        double arizonaoppfga = 2121;
        double arizonaoppfta = 607;
        double arizonaopporb = 339;
        double arizonatoforced = 432;
        double arizonadefrating = 0;
        double arizonaeffectivefgpercentage = 0;
        double arizonateamgamescore = 0;
        double arizonafouls = 625;
        double arizonanetrating = 0;
        double arizonaoffensiverating = 0;
        double arizonapace = 0;
        double arizonaminutesplayed = 7400;
        double arizonatrueshootingpercentage = 0;
        arizonawinpercentage = (arizonawins/arizonagamesplayed)*100;
        arizonappg = (arizonapointsscored/arizonagamesplayed);
        arizonapapg = (arizonapointsallowed/arizonagamesplayed);
        arizonafgptg = (arizonafgm/arizonafga)*100;
        arizona2ptfgptg = (arizona2ptfgm/arizona2ptfga)*100;
        arizona3ptfgptg = (arizona3ptfgm/arizona3ptfga)*100;
        arizonaassistspergame = (arizonaassists/arizonagamesplayed);
        arizonaassistsperfgm = (arizonaassists/arizonafgm);
        arizonaassiststoturnoverratio = (arizonaassists/arizonaturnovers);
        arizonablockspergame = (arizonablocks/arizonagamesplayed);
        arizonastealspergame = (arizonasteals/arizonagamesplayed);
        arizonaturnoverspergame = (arizonaturnovers/arizonagamesplayed);
        arizonaturnoverpercentage = (100*arizonaturnovers)/(arizonafga+(0.475*arizonafta)+arizonaturnovers);
        arizonaftpercentage = (arizonaftm/arizonafta)*100;
        arizonareboundspergame = (arizonarebounds/arizonagamesplayed);
        arizonaoffreboundspergame = (arizonaoffrebounds/arizonagamesplayed);
        arizonadefreboundspergame = (arizonadefrebounds/arizonagamesplayed);
        arizonapossessions = (0.5 * (arizonafga + (0.475 * arizonafta) - arizonaoffrebounds + arizonaturnovers) + 0.5 * (arizonaoppfga + (0.475 * arizonaoppfta) - arizonaopporb + arizonatoforced));
        arizonadefrating = 100*(arizonapointsallowed/arizonapossessions);
        arizonaeffectivefgpercentage = ((arizonafgm+(0.5*arizona3ptfgm))/arizonafga)*100;
        arizonateamgamescore = ((arizonapointsscored + (0.4 * arizonafgm) - (0.7 * arizonafga) - (0.4*(arizonafta - arizonaftm)) + (0.7 * arizonaoffrebounds) + (0.3 * arizonadefrebounds) + arizonasteals + (0.7 * arizonaassists) + (0.7 * arizonablocks) - (0.4 * arizonafouls) - arizonaturnovers)/8)/arizonagamesplayed;
        arizonanetrating = 100 * ((arizonapointsscored - arizonapointsallowed) / arizonapossessions);
        arizonaoffensiverating = 100 * (arizonapointsscored / arizonapossessions);
        arizonapace = 40 * (arizonapossessions / (0.2 * arizonaminutesplayed));
        arizonatrueshootingpercentage = (arizonapointsscored / (2 * (arizonafga + 0.475 * arizonafta)))*100;
        System.out.println("\nArizona:\n" + arizonawinpercentage + "% Win Percentage\n" + arizonappg +
                " Points Per Game\n"+arizonapapg+ " Points Allowed Per Game\n"+arizonafgptg+
                "% Field Goal Percentage\n"+arizona2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +arizona3ptfgptg+"% 3 Point Field Goal Percentage\n"+arizonaassistspergame+" Assists Per Game\n"+
                arizonaassistsperfgm+" Assists Per FGM\n"+ arizonaassiststoturnoverratio+" Assists : TO Ratio\n"+
                arizonablockspergame+" Blocks Per Game\n"+arizonastealspergame+" Steals Per Game\n"+
                arizonaturnoverspergame+" TO Per Game\n"+arizonaturnoverpercentage+" TO%\n"+ arizonaftpercentage+" FT%\n"+
                arizonareboundspergame+" Rebounds Per Game\n"+arizonaoffreboundspergame+" Offensive Rebounds Per game\n"+
                arizonadefreboundspergame+" Defensive Rebounds Per Game\n"+arizonapossessions+" Possessions\n"+
                arizonadefrating+" Defensive Rating\n"+arizonaeffectivefgpercentage+" EFG%\n"+arizonateamgamescore+" Team Game Score\n"
                +arizonanetrating+" Net Rating\n"+arizonaoffensiverating+" Offensive Rating\n"+arizonapace+" Pace\n"+arizonatrueshootingpercentage+" True Shooting Percentage");
				
				
		double notredamewins = 26;
        double notredamegamesplayed = 36;
        double notredamewinpercentage = 0;
        double notredamepointsscored = 2783;
        double notredameppg = 0;
        double notredamepointsallowed = 2494;
        double notredamepapg = 0;
        double notredamefgm = 980;
        double notredamefga = 2139;
        double notredamefgptg = 0;
        double notredame2ptfgm = 646;
        double notredame2ptfga = 1270;
        double notredame2ptfgptg = 0;
        double notredame3ptfgm = 334;
        double notredame3ptfga = 869;
        double notredame3ptfgptg = 0;
        double notredameassists = 566;
        double notredameassistspergame = 0;
        double notredameassistsperfgm = 0;
        double notredameassiststoturnoverratio = 0;
        double notredameturnovers = 342;
        double notredameturnoverspergame = 0;
        double notredameblocks = 134;
        double notredameblockspergame = 0;
        double notredamesteals = 255;
        double notredamestealspergame = 0;
        double notredamefta = 611;
        double notredameftm = 489;
        double notredameturnoverpercentage = 0;
        double notredameftpercentage = 0;
        double notredamerebounds = 1212;
        double notredameoffrebounds = 327;
        double notredamedefrebounds = 885;
        double notredamereboundspergame = 0;
        double notredameoffreboundspergame = 0;
        double notredamedefreboundspergame = 0;
        double notredamepossessions = 0;
        double notredameoppfga = 2118;
        double notredameoppfta = 565;
        double notredameopporb = 387;
        double notredametoforced = 456;
        double notredamedefrating = 0;
        double notredameeffectivefgpercentage = 0;
        double notredameteamgamescore = 0;
        double notredamefouls = 533;
        double notredamenetrating = 0;
        double notredameoffensiverating = 0;
        double notredamepace = 0;
        double notredameminutesplayed = 7225;
        double notredametrueshootingpercentage = 0;
        notredamewinpercentage = (notredamewins/notredamegamesplayed)*100;
        notredameppg = (notredamepointsscored/notredamegamesplayed);
        notredamepapg = (notredamepointsallowed/notredamegamesplayed);
        notredamefgptg = (notredamefgm/notredamefga)*100;
        notredame2ptfgptg = (notredame2ptfgm/notredame2ptfga)*100;
        notredame3ptfgptg = (notredame3ptfgm/notredame3ptfga)*100;
        notredameassistspergame = (notredameassists/notredamegamesplayed);
        notredameassistsperfgm = (notredameassists/notredamefgm);
        notredameassiststoturnoverratio = (notredameassists/notredameturnovers);
        notredameblockspergame = (notredameblocks/notredamegamesplayed);
        notredamestealspergame = (notredamesteals/notredamegamesplayed);
        notredameturnoverspergame = (notredameturnovers/notredamegamesplayed);
        notredameturnoverpercentage = (100*notredameturnovers)/(notredamefga+(0.475*notredamefta)+notredameturnovers);
        notredameftpercentage = (notredameftm/notredamefta)*100;
        notredamereboundspergame = (notredamerebounds/notredamegamesplayed);
        notredameoffreboundspergame = (notredameoffrebounds/notredamegamesplayed);
        notredamedefreboundspergame = (notredamedefrebounds/notredamegamesplayed);
        notredamepossessions = (0.5 * (notredamefga + (0.475 * notredamefta) - notredameoffrebounds + notredameturnovers) + 0.5 * (notredameoppfga + (0.475 * notredameoppfta) - notredameopporb + notredametoforced));
        notredamedefrating = 100*(notredamepointsallowed/notredamepossessions);
        notredameeffectivefgpercentage = ((notredamefgm+(0.5*notredame3ptfgm))/notredamefga)*100;
        notredameteamgamescore = ((notredamepointsscored + (0.4 * notredamefgm) - (0.7 * notredamefga) - (0.4*(notredamefta - notredameftm)) + (0.7 * notredameoffrebounds) + (0.3 * notredamedefrebounds) + notredamesteals + (0.7 * notredameassists) + (0.7 * notredameblocks) - (0.4 * notredamefouls) - notredameturnovers)/8)/notredamegamesplayed;
        notredamenetrating = 100 * ((notredamepointsscored - notredamepointsallowed) / notredamepossessions);
        notredameoffensiverating = 100 * (notredamepointsscored / notredamepossessions);
        notredamepace = 40 * (notredamepossessions / (0.2 * notredameminutesplayed));
        notredametrueshootingpercentage = (notredamepointsscored / (2 * (notredamefga + 0.475 * notredamefta)))*100;
        System.out.println("\nNotre Dame:\n" + notredamewinpercentage + "% Win Percentage\n" + notredameppg +
                " Points Per Game\n"+notredamepapg+ " Points Allowed Per Game\n"+notredamefgptg+
                "% Field Goal Percentage\n"+notredame2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +notredame3ptfgptg+"% 3 Point Field Goal Percentage\n"+notredameassistspergame+" Assists Per Game\n"+
                notredameassistsperfgm+" Assists Per FGM\n"+ notredameassiststoturnoverratio+" Assists : TO Ratio\n"+
                notredameblockspergame+" Blocks Per Game\n"+notredamestealspergame+" Steals Per Game\n"+
                notredameturnoverspergame+" TO Per Game\n"+notredameturnoverpercentage+" TO%\n"+ notredameftpercentage+" FT%\n"+
                notredamereboundspergame+" Rebounds Per Game\n"+notredameoffreboundspergame+" Offensive Rebounds Per game\n"+
                notredamedefreboundspergame+" Defensive Rebounds Per Game\n"+notredamepossessions+" Possessions\n"+
                notredamedefrating+" Defensive Rating\n"+notredameeffectivefgpercentage+" EFG%\n"+notredameteamgamescore+" Team Game Score\n"
                +notredamenetrating+" Net Rating\n"+notredameoffensiverating+" Offensive Rating\n"+notredamepace+" Pace\n"+notredametrueshootingpercentage+" True Shooting Percentage");
				
				
		double butlerwins = 25;
        double butlergamesplayed = 34;
        double butlerwinpercentage = 0;
        double butlerpointsscored = 2595;
        double butlerppg = 0;
        double butlerpointsallowed = 2341;
        double butlerpapg = 0;
        double butlerfgm = 906;
        double butlerfga = 1898;
        double butlerfgptg = 0;
        double butler2ptfgm = 645;
        double butler2ptfga = 1184;
        double butler2ptfgptg = 0;
        double butler3ptfgm = 261;
        double butler3ptfga = 714;
        double butler3ptfgptg = 0;
        double butlerassists = 453;
        double butlerassistspergame = 0;
        double butlerassistsperfgm = 0;
        double butlerassiststoturnoverratio = 0;
        double butlerturnovers = 346;
        double butlerturnoverspergame = 0;
        double butlerblocks = 96;
        double butlerblockspergame = 0;
        double butlersteals = 206;
        double butlerstealspergame = 0;
        double butlerfta = 704;
        double butlerftm = 522;
        double butlerturnoverpercentage = 0;
        double butlerftpercentage = 0;
        double butlerrebounds = 1091;
        double butleroffrebounds = 287;
        double butlerdefrebounds = 804;
        double butlerreboundspergame = 0;
        double butleroffreboundspergame = 0;
        double butlerdefreboundspergame = 0;
        double butlerpossessions = 0;
        double butleroppfga = 1837;
        double butleroppfta = 680;
        double butleropporb = 293;
        double butlertoforced = 451;
        double butlerdefrating = 0;
        double butlereffectivefgpercentage = 0;
        double butlerteamgamescore = 0;
        double butlerfouls = 640;
        double butlernetrating = 0;
        double butleroffensiverating = 0;
        double butlerpace = 0;
        double butlerminutesplayed = 6850;
        double butlertrueshootingpercentage = 0;
        butlerwinpercentage = (butlerwins/butlergamesplayed)*100;
        butlerppg = (butlerpointsscored/butlergamesplayed);
        butlerpapg = (butlerpointsallowed/butlergamesplayed);
        butlerfgptg = (butlerfgm/butlerfga)*100;
        butler2ptfgptg = (butler2ptfgm/butler2ptfga)*100;
        butler3ptfgptg = (butler3ptfgm/butler3ptfga)*100;
        butlerassistspergame = (butlerassists/butlergamesplayed);
        butlerassistsperfgm = (butlerassists/butlerfgm);
        butlerassiststoturnoverratio = (butlerassists/butlerturnovers);
        butlerblockspergame = (butlerblocks/butlergamesplayed);
        butlerstealspergame = (butlersteals/butlergamesplayed);
        butlerturnoverspergame = (butlerturnovers/butlergamesplayed);
        butlerturnoverpercentage = (100*butlerturnovers)/(butlerfga+(0.475*butlerfta)+butlerturnovers);
        butlerftpercentage = (butlerftm/butlerfta)*100;
        butlerreboundspergame = (butlerrebounds/butlergamesplayed);
        butleroffreboundspergame = (butleroffrebounds/butlergamesplayed);
        butlerdefreboundspergame = (butlerdefrebounds/butlergamesplayed);
        butlerpossessions = (0.5 * (butlerfga + (0.475 * butlerfta) - butleroffrebounds + butlerturnovers) + 0.5 * (butleroppfga + (0.475 * butleroppfta) - butleropporb + butlertoforced));
        butlerdefrating = 100*(butlerpointsallowed/butlerpossessions);
        butlereffectivefgpercentage = ((butlerfgm+(0.5*butler3ptfgm))/butlerfga)*100;
        butlerteamgamescore = ((butlerpointsscored + (0.4 * butlerfgm) - (0.7 * butlerfga) - (0.4*(butlerfta - butlerftm)) + (0.7 * butleroffrebounds) + (0.3 * butlerdefrebounds) + butlersteals + (0.7 * butlerassists) + (0.7 * butlerblocks) - (0.4 * butlerfouls) - butlerturnovers)/8)/butlergamesplayed;
        butlernetrating = 100 * ((butlerpointsscored - butlerpointsallowed) / butlerpossessions);
        butleroffensiverating = 100 * (butlerpointsscored / butlerpossessions);
        butlerpace = 40 * (butlerpossessions / (0.2 * butlerminutesplayed));
        butlertrueshootingpercentage = (butlerpointsscored / (2 * (butlerfga + 0.475 * butlerfta)))*100;
        System.out.println("\nButler:\n" + butlerwinpercentage + "% Win Percentage\n" + butlerppg +
                " Points Per Game\n"+butlerpapg+ " Points Allowed Per Game\n"+butlerfgptg+
                "% Field Goal Percentage\n"+butler2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +butler3ptfgptg+"% 3 Point Field Goal Percentage\n"+butlerassistspergame+" Assists Per Game\n"+
                butlerassistsperfgm+" Assists Per FGM\n"+ butlerassiststoturnoverratio+" Assists : TO Ratio\n"+
                butlerblockspergame+" Blocks Per Game\n"+butlerstealspergame+" Steals Per Game\n"+
                butlerturnoverspergame+" TO Per Game\n"+butlerturnoverpercentage+" TO%\n"+ butlerftpercentage+" FT%\n"+
                butlerreboundspergame+" Rebounds Per Game\n"+butleroffreboundspergame+" Offensive Rebounds Per game\n"+
                butlerdefreboundspergame+" Defensive Rebounds Per Game\n"+butlerpossessions+" Possessions\n"+
                butlerdefrating+" Defensive Rating\n"+butlereffectivefgpercentage+" EFG%\n"+butlerteamgamescore+" Team Game Score\n"
                +butlernetrating+" Net Rating\n"+butleroffensiverating+" Offensive Rating\n"+butlerpace+" Pace\n"+butlertrueshootingpercentage+" True Shooting Percentage");
				
		double southcarolinawins = 26;
        double southcarolinagamesplayed = 37;
        double southcarolinawinpercentage = 0;
        double southcarolinapointsscored = 2707;
        double southcarolinappg = 0;
        double southcarolinapointsallowed = 2414;
        double southcarolinapapg = 0;
        double southcarolinafgm = 924;
        double southcarolinafga = 2197;
        double southcarolinafgptg = 0;
        double southcarolina2ptfgm = 676;
        double southcarolina2ptfga = 1464;
        double southcarolina2ptfgptg = 0;
        double southcarolina3ptfgm = 248;
        double southcarolina3ptfga = 733;
        double southcarolina3ptfgptg = 0;
        double southcarolinaassists = 468;
        double southcarolinaassistspergame = 0;
        double southcarolinaassistsperfgm = 0;
        double southcarolinaassiststoturnoverratio = 0;
        double southcarolinaturnovers = 480;
        double southcarolinaturnoverspergame = 0;
        double southcarolinablocks = 142;
        double southcarolinablockspergame = 0;
        double southcarolinasteals = 288;
        double southcarolinastealspergame = 0;
        double southcarolinafta = 874;
        double southcarolinaftm = 611;
        double southcarolinaturnoverpercentage = 0;
        double southcarolinaftpercentage = 0;
        double southcarolinarebounds = 1346;
        double southcarolinaoffrebounds = 451;
        double southcarolinadefrebounds = 895;
        double southcarolinareboundspergame = 0;
        double southcarolinaoffreboundspergame = 0;
        double southcarolinadefreboundspergame = 0;
        double southcarolinapossessions = 0;
        double southcarolinaoppfga = 1969;
        double southcarolinaoppfta = 868;
        double southcarolinaopporb = 382;
        double southcarolinatoforced = 632;
        double southcarolinadefrating = 0;
        double southcarolinaeffectivefgpercentage = 0;
        double southcarolinateamgamescore = 0;
        double southcarolinafouls = 751;
        double southcarolinanetrating = 0;
        double southcarolinaoffensiverating = 0;
        double southcarolinapace = 0;
        double southcarolinaminutesplayed = 7525;
        double southcarolinatrueshootingpercentage = 0;
        southcarolinawinpercentage = (southcarolinawins/southcarolinagamesplayed)*100;
        southcarolinappg = (southcarolinapointsscored/southcarolinagamesplayed);
        southcarolinapapg = (southcarolinapointsallowed/southcarolinagamesplayed);
        southcarolinafgptg = (southcarolinafgm/southcarolinafga)*100;
        southcarolina2ptfgptg = (southcarolina2ptfgm/southcarolina2ptfga)*100;
        southcarolina3ptfgptg = (southcarolina3ptfgm/southcarolina3ptfga)*100;
        southcarolinaassistspergame = (southcarolinaassists/southcarolinagamesplayed);
        southcarolinaassistsperfgm = (southcarolinaassists/southcarolinafgm);
        southcarolinaassiststoturnoverratio = (southcarolinaassists/southcarolinaturnovers);
        southcarolinablockspergame = (southcarolinablocks/southcarolinagamesplayed);
        southcarolinastealspergame = (southcarolinasteals/southcarolinagamesplayed);
        southcarolinaturnoverspergame = (southcarolinaturnovers/southcarolinagamesplayed);
        southcarolinaturnoverpercentage = (100*southcarolinaturnovers)/(southcarolinafga+(0.475*southcarolinafta)+southcarolinaturnovers);
        southcarolinaftpercentage = (southcarolinaftm/southcarolinafta)*100;
        southcarolinareboundspergame = (southcarolinarebounds/southcarolinagamesplayed);
        southcarolinaoffreboundspergame = (southcarolinaoffrebounds/southcarolinagamesplayed);
        southcarolinadefreboundspergame = (southcarolinadefrebounds/southcarolinagamesplayed);
        southcarolinapossessions = (0.5 * (southcarolinafga + (0.475 * southcarolinafta) - southcarolinaoffrebounds + southcarolinaturnovers) + 0.5 * (southcarolinaoppfga + (0.475 * southcarolinaoppfta) - southcarolinaopporb + southcarolinatoforced));
        southcarolinadefrating = 100*(southcarolinapointsallowed/southcarolinapossessions);
        southcarolinaeffectivefgpercentage = ((southcarolinafgm+(0.5*southcarolina3ptfgm))/southcarolinafga)*100;
        southcarolinateamgamescore = ((southcarolinapointsscored + (0.4 * southcarolinafgm) - (0.7 * southcarolinafga) - (0.4*(southcarolinafta - southcarolinaftm)) + (0.7 * southcarolinaoffrebounds) + (0.3 * southcarolinadefrebounds) + southcarolinasteals + (0.7 * southcarolinaassists) + (0.7 * southcarolinablocks) - (0.4 * southcarolinafouls) - southcarolinaturnovers)/8)/southcarolinagamesplayed;
        southcarolinanetrating = 100 * ((southcarolinapointsscored - southcarolinapointsallowed) / southcarolinapossessions);
        southcarolinaoffensiverating = 100 * (southcarolinapointsscored / southcarolinapossessions);
        southcarolinapace = 40 * (southcarolinapossessions / (0.2 * southcarolinaminutesplayed));
        southcarolinatrueshootingpercentage = (southcarolinapointsscored / (2 * (southcarolinafga + 0.475 * southcarolinafta)))*100;
        System.out.println("\nSouth Carolina:\n" + southcarolinawinpercentage + "% Win Percentage\n" + southcarolinappg +
                " Points Per Game\n"+southcarolinapapg+ " Points Allowed Per Game\n"+southcarolinafgptg+
                "% Field Goal Percentage\n"+southcarolina2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +southcarolina3ptfgptg+"% 3 Point Field Goal Percentage\n"+southcarolinaassistspergame+" Assists Per Game\n"+
                southcarolinaassistsperfgm+" Assists Per FGM\n"+ southcarolinaassiststoturnoverratio+" Assists : TO Ratio\n"+
                southcarolinablockspergame+" Blocks Per Game\n"+southcarolinastealspergame+" Steals Per Game\n"+
                southcarolinaturnoverspergame+" TO Per Game\n"+southcarolinaturnoverpercentage+" TO%\n"+ southcarolinaftpercentage+" FT%\n"+
                southcarolinareboundspergame+" Rebounds Per Game\n"+southcarolinaoffreboundspergame+" Offensive Rebounds Per game\n"+
                southcarolinadefreboundspergame+" Defensive Rebounds Per Game\n"+southcarolinapossessions+" Possessions\n"+
                southcarolinadefrating+" Defensive Rating\n"+southcarolinaeffectivefgpercentage+" EFG%\n"+southcarolinateamgamescore+" Team Game Score\n"
                +southcarolinanetrating+" Net Rating\n"+southcarolinaoffensiverating+" Offensive Rating\n"+southcarolinapace+" Pace\n"+southcarolinatrueshootingpercentage+" True Shooting Percentage");
				
				
		double creightonwins = 25;
        double creightongamesplayed = 35;
        double creightonwinpercentage = 0;
        double creightonpointsscored = 2864;
        double creightonppg = 0;
        double creightonpointsallowed = 2549;
        double creightonpapg = 0;
        double creightonfgm = 1078;
        double creightonfga = 2137;
        double creightonfgptg = 0;
        double creighton2ptfgm = 774;
        double creighton2ptfga = 1371;
        double creighton2ptfgptg = 0;
        double creighton3ptfgm = 304;
        double creighton3ptfga = 766;
        double creighton3ptfgptg = 0;
        double creightonassists = 598;
        double creightonassistspergame = 0;
        double creightonassistsperfgm = 0;
        double creightonassiststoturnoverratio = 0;
        double creightonturnovers = 434;
        double creightonturnoverspergame = 0;
        double creightonblocks = 102;
        double creightonblockspergame = 0;
        double creightonsteals = 213;
        double creightonstealspergame = 0;
        double creightonfta = 592;
        double creightonftm = 404;
        double creightonturnoverpercentage = 0;
        double creightonftpercentage = 0;
        double creightonrebounds = 1223;
        double creightonoffrebounds = 288;
        double creightondefrebounds = 935;
        double creightonreboundspergame = 0;
        double creightonoffreboundspergame = 0;
        double creightondefreboundspergame = 0;
        double creightonpossessions = 0;
        double creightonoppfga = 2134;
        double creightonoppfta = 615;
        double creightonopporb = 379;
        double creightontoforced = 489;
        double creightondefrating = 0;
        double creightoneffectivefgpercentage = 0;
        double creightonteamgamescore = 0;
        double creightonfouls = 582;
        double creightonnetrating = 0;
        double creightonoffensiverating = 0;
        double creightonpace = 0;
        double creightonminutesplayed = 7000;
        double creightontrueshootingpercentage = 0;
        creightonwinpercentage = (creightonwins/creightongamesplayed)*100;
        creightonppg = (creightonpointsscored/creightongamesplayed);
        creightonpapg = (creightonpointsallowed/creightongamesplayed);
        creightonfgptg = (creightonfgm/creightonfga)*100;
        creighton2ptfgptg = (creighton2ptfgm/creighton2ptfga)*100;
        creighton3ptfgptg = (creighton3ptfgm/creighton3ptfga)*100;
        creightonassistspergame = (creightonassists/creightongamesplayed);
        creightonassistsperfgm = (creightonassists/creightonfgm);
        creightonassiststoturnoverratio = (creightonassists/creightonturnovers);
        creightonblockspergame = (creightonblocks/creightongamesplayed);
        creightonstealspergame = (creightonsteals/creightongamesplayed);
        creightonturnoverspergame = (creightonturnovers/creightongamesplayed);
        creightonturnoverpercentage = (100*creightonturnovers)/(creightonfga+(0.475*creightonfta)+creightonturnovers);
        creightonftpercentage = (creightonftm/creightonfta)*100;
        creightonreboundspergame = (creightonrebounds/creightongamesplayed);
        creightonoffreboundspergame = (creightonoffrebounds/creightongamesplayed);
        creightondefreboundspergame = (creightondefrebounds/creightongamesplayed);
        creightonpossessions = (0.5 * (creightonfga + (0.475 * creightonfta) - creightonoffrebounds + creightonturnovers) + 0.5 * (creightonoppfga + (0.475 * creightonoppfta) - creightonopporb + creightontoforced));
        creightondefrating = 100*(creightonpointsallowed/creightonpossessions);
        creightoneffectivefgpercentage = ((creightonfgm+(0.5*creighton3ptfgm))/creightonfga)*100;
        creightonteamgamescore = ((creightonpointsscored + (0.4 * creightonfgm) - (0.7 * creightonfga) - (0.4*(creightonfta - creightonftm)) + (0.7 * creightonoffrebounds) + (0.3 * creightondefrebounds) + creightonsteals + (0.7 * creightonassists) + (0.7 * creightonblocks) - (0.4 * creightonfouls) - creightonturnovers)/8)/creightongamesplayed;
        creightonnetrating = 100 * ((creightonpointsscored - creightonpointsallowed) / creightonpossessions);
        creightonoffensiverating = 100 * (creightonpointsscored / creightonpossessions);
        creightonpace = 40 * (creightonpossessions / (0.2 * creightonminutesplayed));
        creightontrueshootingpercentage = (creightonpointsscored / (2 * (creightonfga + 0.475 * creightonfta)))*100;
        System.out.println("\nCreighton:\n" + creightonwinpercentage + "% Win Percentage\n" + creightonppg +
                " Points Per Game\n"+creightonpapg+ " Points Allowed Per Game\n"+creightonfgptg+
                "% Field Goal Percentage\n"+creighton2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +creighton3ptfgptg+"% 3 Point Field Goal Percentage\n"+creightonassistspergame+" Assists Per Game\n"+
                creightonassistsperfgm+" Assists Per FGM\n"+ creightonassiststoturnoverratio+" Assists : TO Ratio\n"+
                creightonblockspergame+" Blocks Per Game\n"+creightonstealspergame+" Steals Per Game\n"+
                creightonturnoverspergame+" TO Per Game\n"+creightonturnoverpercentage+" TO%\n"+ creightonftpercentage+" FT%\n"+
                creightonreboundspergame+" Rebounds Per Game\n"+creightonoffreboundspergame+" Offensive Rebounds Per game\n"+
                creightondefreboundspergame+" Defensive Rebounds Per Game\n"+creightonpossessions+" Possessions\n"+
                creightondefrating+" Defensive Rating\n"+creightoneffectivefgpercentage+" EFG%\n"+creightonteamgamescore+" Team Game Score\n"
                +creightonnetrating+" Net Rating\n"+creightonoffensiverating+" Offensive Rating\n"+creightonpace+" Pace\n"+creightontrueshootingpercentage+" True Shooting Percentage");
				
				
		double stmaryswins = 29;
        double stmarysgamesplayed = 34;
        double stmaryswinpercentage = 0;
        double stmaryspointsscored = 2449;
        double stmarysppg = 0;
        double stmaryspointsallowed = 1954;
        double stmaryspapg = 0;
        double stmarysfgm = 892;
        double stmarysfga = 1797;
        double stmarysfgptg = 0;
        double stmarys2ptfgm = 599;
        double stmarys2ptfga = 1053;
        double stmarys2ptfgptg = 0;
        double stmarys3ptfgm = 293;
        double stmarys3ptfga = 744;
        double stmarys3ptfgptg = 0;
        double stmarysassists = 563;
        double stmarysassistspergame = 0;
        double stmarysassistsperfgm = 0;
        double stmarysassiststoturnoverratio = 0;
        double stmarysturnovers = 365;
        double stmarysturnoverspergame = 0;
        double stmarysblocks = 110;
        double stmarysblockspergame = 0;
        double stmaryssteals = 143;
        double stmarysstealspergame = 0;
        double stmarysfta = 499;
        double stmarysftm = 372;
        double stmarysturnoverpercentage = 0;
        double stmarysftpercentage = 0;
        double stmarysrebounds = 1205;
        double stmarysoffrebounds = 319;
        double stmarysdefrebounds = 886;
        double stmarysreboundspergame = 0;
        double stmarysoffreboundspergame = 0;
        double stmarysdefreboundspergame = 0;
        double stmaryspossessions = 0;
        double stmarysoppfga = 1792;
        double stmarysoppfta = 476;
        double stmarysopporb = 245;
        double stmarystoforced = 318;
        double stmarysdefrating = 0;
        double stmaryseffectivefgpercentage = 0;
        double stmarysteamgamescore = 0;
        double stmarysfouls = 512;
        double stmarysnetrating = 0;
        double stmarysoffensiverating = 0;
        double stmaryspace = 0;
        double stmarysminutesplayed = 6800;
        double stmarystrueshootingpercentage = 0;
        stmaryswinpercentage = (stmaryswins/stmarysgamesplayed)*100;
        stmarysppg = (stmaryspointsscored/stmarysgamesplayed);
        stmaryspapg = (stmaryspointsallowed/stmarysgamesplayed);
        stmarysfgptg = (stmarysfgm/stmarysfga)*100;
        stmarys2ptfgptg = (stmarys2ptfgm/stmarys2ptfga)*100;
        stmarys3ptfgptg = (stmarys3ptfgm/stmarys3ptfga)*100;
        stmarysassistspergame = (stmarysassists/stmarysgamesplayed);
        stmarysassistsperfgm = (stmarysassists/stmarysfgm);
        stmarysassiststoturnoverratio = (stmarysassists/stmarysturnovers);
        stmarysblockspergame = (stmarysblocks/stmarysgamesplayed);
        stmarysstealspergame = (stmaryssteals/stmarysgamesplayed);
        stmarysturnoverspergame = (stmarysturnovers/stmarysgamesplayed);
        stmarysturnoverpercentage = (100*stmarysturnovers)/(stmarysfga+(0.475*stmarysfta)+stmarysturnovers);
        stmarysftpercentage = (stmarysftm/stmarysfta)*100;
        stmarysreboundspergame = (stmarysrebounds/stmarysgamesplayed);
        stmarysoffreboundspergame = (stmarysoffrebounds/stmarysgamesplayed);
        stmarysdefreboundspergame = (stmarysdefrebounds/stmarysgamesplayed);
        stmaryspossessions = (0.5 * (stmarysfga + (0.475 * stmarysfta) - stmarysoffrebounds + stmarysturnovers) + 0.5 * (stmarysoppfga + (0.475 * stmarysoppfta) - stmarysopporb + stmarystoforced));
        stmarysdefrating = 100*(stmaryspointsallowed/stmaryspossessions);
        stmaryseffectivefgpercentage = ((stmarysfgm+(0.5*stmarys3ptfgm))/stmarysfga)*100;
        stmarysteamgamescore = ((stmaryspointsscored + (0.4 * stmarysfgm) - (0.7 * stmarysfga) - (0.4*(stmarysfta - stmarysftm)) + (0.7 * stmarysoffrebounds) + (0.3 * stmarysdefrebounds) + stmaryssteals + (0.7 * stmarysassists) + (0.7 * stmarysblocks) - (0.4 * stmarysfouls) - stmarysturnovers)/8)/stmarysgamesplayed;
        stmarysnetrating = 100 * ((stmaryspointsscored - stmaryspointsallowed) / stmaryspossessions);
        stmarysoffensiverating = 100 * (stmaryspointsscored / stmaryspossessions);
        stmaryspace = 40 * (stmaryspossessions / (0.2 * stmarysminutesplayed));
        stmarystrueshootingpercentage = (stmaryspointsscored / (2 * (stmarysfga + 0.475 * stmarysfta)))*100;
        System.out.println("\nSt Mary's:\n" + stmaryswinpercentage + "% Win Percentage\n" + stmarysppg +
                " Points Per Game\n"+stmaryspapg+ " Points Allowed Per Game\n"+stmarysfgptg+
                "% Field Goal Percentage\n"+stmarys2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +stmarys3ptfgptg+"% 3 Point Field Goal Percentage\n"+stmarysassistspergame+" Assists Per Game\n"+
                stmarysassistsperfgm+" Assists Per FGM\n"+ stmarysassiststoturnoverratio+" Assists : TO Ratio\n"+
                stmarysblockspergame+" Blocks Per Game\n"+stmarysstealspergame+" Steals Per Game\n"+
                stmarysturnoverspergame+" TO Per Game\n"+stmarysturnoverpercentage+" TO%\n"+ stmarysftpercentage+" FT%\n"+
                stmarysreboundspergame+" Rebounds Per Game\n"+stmarysoffreboundspergame+" Offensive Rebounds Per game\n"+
                stmarysdefreboundspergame+" Defensive Rebounds Per Game\n"+stmaryspossessions+" Possessions\n"+
                stmarysdefrating+" Defensive Rating\n"+stmaryseffectivefgpercentage+" EFG%\n"+stmarysteamgamescore+" Team Game Score\n"
                +stmarysnetrating+" Net Rating\n"+stmarysoffensiverating+" Offensive Rating\n"+stmaryspace+" Pace\n"+stmarystrueshootingpercentage+" True Shooting Percentage");
				
		double tcuwins = 24;
        double tcugamesplayed = 39;
        double tcuwinpercentage = 0;
        double tcupointsscored = 2914;
        double tcuppg = 0;
        double tcupointsallowed = 2718;
        double tcupapg = 0;
        double tcufgm = 1064;
        double tcufga = 2284;
        double tcufgptg = 0;
        double tcu2ptfgm = 784;
        double tcu2ptfga = 1494;
        double tcu2ptfgptg = 0;
        double tcu3ptfgm = 280;
        double tcu3ptfga = 790;
        double tcu3ptfgptg = 0;
        double tcuassists = 661;
        double tcuassistspergame = 0;
        double tcuassistsperfgm = 0;
        double tcuassiststoturnoverratio = 0;
        double tcuturnovers = 504;
        double tcuturnoverspergame = 0;
        double tcublocks = 175;
        double tcublockspergame = 0;
        double tcusteals = 256;
        double tcustealspergame = 0;
        double tcufta = 738;
        double tcuftm = 506;
        double tcuturnoverpercentage = 0;
        double tcuftpercentage = 0;
        double tcurebounds = 1404;
        double tcuoffrebounds = 453;
        double tcudefrebounds = 951;
        double tcureboundspergame = 0;
        double tcuoffreboundspergame = 0;
        double tcudefreboundspergame = 0;
        double tcupossessions = 0;
        double tcuoppfga = 2230;
        double tcuoppfta = 685;
        double tcuopporb = 392;
        double tcutoforced = 509;
        double tcudefrating = 0;
        double tcueffectivefgpercentage = 0;
        double tcuteamgamescore = 0;
        double tcufouls = 676;
        double tcunetrating = 0;
        double tcuoffensiverating = 0;
        double tcupace = 0;
        double tcuminutesplayed = 7850;
        double tcutrueshootingpercentage = 0;
        tcuwinpercentage = (tcuwins/tcugamesplayed)*100;
        tcuppg = (tcupointsscored/tcugamesplayed);
        tcupapg = (tcupointsallowed/tcugamesplayed);
        tcufgptg = (tcufgm/tcufga)*100;
        tcu2ptfgptg = (tcu2ptfgm/tcu2ptfga)*100;
        tcu3ptfgptg = (tcu3ptfgm/tcu3ptfga)*100;
        tcuassistspergame = (tcuassists/tcugamesplayed);
        tcuassistsperfgm = (tcuassists/tcufgm);
        tcuassiststoturnoverratio = (tcuassists/tcuturnovers);
        tcublockspergame = (tcublocks/tcugamesplayed);
        tcustealspergame = (tcusteals/tcugamesplayed);
        tcuturnoverspergame = (tcuturnovers/tcugamesplayed);
        tcuturnoverpercentage = (100*tcuturnovers)/(tcufga+(0.475*tcufta)+tcuturnovers);
        tcuftpercentage = (tcuftm/tcufta)*100;
        tcureboundspergame = (tcurebounds/tcugamesplayed);
        tcuoffreboundspergame = (tcuoffrebounds/tcugamesplayed);
        tcudefreboundspergame = (tcudefrebounds/tcugamesplayed);
        tcupossessions = (0.5 * (tcufga + (0.475 * tcufta) - tcuoffrebounds + tcuturnovers) + 0.5 * (tcuoppfga + (0.475 * tcuoppfta) - tcuopporb + tcutoforced));
        tcudefrating = 100*(tcupointsallowed/tcupossessions);
        tcueffectivefgpercentage = ((tcufgm+(0.5*tcu3ptfgm))/tcufga)*100;
        tcuteamgamescore = ((tcupointsscored + (0.4 * tcufgm) - (0.7 * tcufga) - (0.4*(tcufta - tcuftm)) + (0.7 * tcuoffrebounds) + (0.3 * tcudefrebounds) + tcusteals + (0.7 * tcuassists) + (0.7 * tcublocks) - (0.4 * tcufouls) - tcuturnovers)/8)/tcugamesplayed;
        tcunetrating = 100 * ((tcupointsscored - tcupointsallowed) / tcupossessions);
        tcuoffensiverating = 100 * (tcupointsscored / tcupossessions);
        tcupace = 40 * (tcupossessions / (0.2 * tcuminutesplayed));
        tcutrueshootingpercentage = (tcupointsscored / (2 * (tcufga + 0.475 * tcufta)))*100;
        System.out.println("\nTCU:\n" + tcuwinpercentage + "% Win Percentage\n" + tcuppg +
                " Points Per Game\n"+tcupapg+ " Points Allowed Per Game\n"+tcufgptg+
                "% Field Goal Percentage\n"+tcu2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +tcu3ptfgptg+"% 3 Point Field Goal Percentage\n"+tcuassistspergame+" Assists Per Game\n"+
                tcuassistsperfgm+" Assists Per FGM\n"+ tcuassiststoturnoverratio+" Assists : TO Ratio\n"+
                tcublockspergame+" Blocks Per Game\n"+tcustealspergame+" Steals Per Game\n"+
                tcuturnoverspergame+" TO Per Game\n"+tcuturnoverpercentage+" TO%\n"+ tcuftpercentage+" FT%\n"+
                tcureboundspergame+" Rebounds Per Game\n"+tcuoffreboundspergame+" Offensive Rebounds Per game\n"+
                tcudefreboundspergame+" Defensive Rebounds Per Game\n"+tcupossessions+" Possessions\n"+
                tcudefrating+" Defensive Rating\n"+tcueffectivefgpercentage+" EFG%\n"+tcuteamgamescore+" Team Game Score\n"
                +tcunetrating+" Net Rating\n"+tcuoffensiverating+" Offensive Rating\n"+tcupace+" Pace\n"+tcutrueshootingpercentage+" True Shooting Percentage");
				
				
		double marquettewins = 19;
        double marquettegamesplayed = 32;
        double marquettewinpercentage = 0;
        double marquettepointsscored = 2631;
        double marquetteppg = 0;
        double marquettepointsallowed = 2418;
        double marquettepapg = 0;
        double marquettefgm = 919;
        double marquettefga = 1888;
        double marquettefgptg = 0;
        double marquette2ptfgm = 583;
        double marquette2ptfga = 1105;
        double marquette2ptfgptg = 0;
        double marquette3ptfgm = 336;
        double marquette3ptfga = 783;
        double marquette3ptfgptg = 0;
        double marquetteassists = 525;
        double marquetteassistspergame = 0;
        double marquetteassistsperfgm = 0;
        double marquetteassiststoturnoverratio = 0;
        double marquetteturnovers = 396;
        double marquetteturnoverspergame = 0;
        double marquetteblocks = 115;
        double marquetteblockspergame = 0;
        double marquettesteals = 231;
        double marquettestealspergame = 0;
        double marquettefta = 585;
        double marquetteftm = 457;
        double marquetteturnoverpercentage = 0;
        double marquetteftpercentage = 0;
        double marquetterebounds = 1058;
        double marquetteoffrebounds = 279;
        double marquettedefrebounds = 779;
        double marquettereboundspergame = 0;
        double marquetteoffreboundspergame = 0;
        double marquettedefreboundspergame = 0;
        double marquettepossessions = 0;
        double marquetteoppfga = 1871;
        double marquetteoppfta = 465;
        double marquetteopporb = 319;
        double marquettetoforced = 418;
        double marquettedefrating = 0;
        double marquetteeffectivefgpercentage = 0;
        double marquetteteamgamescore = 0;
        double marquettefouls = 620;
        double marquettenetrating = 0;
        double marquetteoffensiverating = 0;
        double marquettepace = 0;
        double marquetteminutesplayed = 6425;
        double marquettetrueshootingpercentage = 0;
        marquettewinpercentage = (marquettewins/marquettegamesplayed)*100;
        marquetteppg = (marquettepointsscored/marquettegamesplayed);
        marquettepapg = (marquettepointsallowed/marquettegamesplayed);
        marquettefgptg = (marquettefgm/marquettefga)*100;
        marquette2ptfgptg = (marquette2ptfgm/marquette2ptfga)*100;
        marquette3ptfgptg = (marquette3ptfgm/marquette3ptfga)*100;
        marquetteassistspergame = (marquetteassists/marquettegamesplayed);
        marquetteassistsperfgm = (marquetteassists/marquettefgm);
        marquetteassiststoturnoverratio = (marquetteassists/marquetteturnovers);
        marquetteblockspergame = (marquetteblocks/marquettegamesplayed);
        marquettestealspergame = (marquettesteals/marquettegamesplayed);
        marquetteturnoverspergame = (marquetteturnovers/marquettegamesplayed);
        marquetteturnoverpercentage = (100*marquetteturnovers)/(marquettefga+(0.475*marquettefta)+marquetteturnovers);
        marquetteftpercentage = (marquetteftm/marquettefta)*100;
        marquettereboundspergame = (marquetterebounds/marquettegamesplayed);
        marquetteoffreboundspergame = (marquetteoffrebounds/marquettegamesplayed);
        marquettedefreboundspergame = (marquettedefrebounds/marquettegamesplayed);
        marquettepossessions = (0.5 * (marquettefga + (0.475 * marquettefta) - marquetteoffrebounds + marquetteturnovers) + 0.5 * (marquetteoppfga + (0.475 * marquetteoppfta) - marquetteopporb + marquettetoforced));
        marquettedefrating = 100*(marquettepointsallowed/marquettepossessions);
        marquetteeffectivefgpercentage = ((marquettefgm+(0.5*marquette3ptfgm))/marquettefga)*100;
        marquetteteamgamescore = ((marquettepointsscored + (0.4 * marquettefgm) - (0.7 * marquettefga) - (0.4*(marquettefta - marquetteftm)) + (0.7 * marquetteoffrebounds) + (0.3 * marquettedefrebounds) + marquettesteals + (0.7 * marquetteassists) + (0.7 * marquetteblocks) - (0.4 * marquettefouls) - marquetteturnovers)/8)/marquettegamesplayed;
        marquettenetrating = 100 * ((marquettepointsscored - marquettepointsallowed) / marquettepossessions);
        marquetteoffensiverating = 100 * (marquettepointsscored / marquettepossessions);
        marquettepace = 40 * (marquettepossessions / (0.2 * marquetteminutesplayed));
        marquettetrueshootingpercentage = (marquettepointsscored / (2 * (marquettefga + 0.475 * marquettefta)))*100;
        System.out.println("\nMarquette:\n" + marquettewinpercentage + "% Win Percentage\n" + marquetteppg +
                " Points Per Game\n"+marquettepapg+ " Points Allowed Per Game\n"+marquettefgptg+
                "% Field Goal Percentage\n"+marquette2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +marquette3ptfgptg+"% 3 Point Field Goal Percentage\n"+marquetteassistspergame+" Assists Per Game\n"+
                marquetteassistsperfgm+" Assists Per FGM\n"+ marquetteassiststoturnoverratio+" Assists : TO Ratio\n"+
                marquetteblockspergame+" Blocks Per Game\n"+marquettestealspergame+" Steals Per Game\n"+
                marquetteturnoverspergame+" TO Per Game\n"+marquetteturnoverpercentage+" TO%\n"+ marquetteftpercentage+" FT%\n"+
                marquettereboundspergame+" Rebounds Per Game\n"+marquetteoffreboundspergame+" Offensive Rebounds Per game\n"+
                marquettedefreboundspergame+" Defensive Rebounds Per Game\n"+marquettepossessions+" Possessions\n"+
                marquettedefrating+" Defensive Rating\n"+marquetteeffectivefgpercentage+" EFG%\n"+marquetteteamgamescore+" Team Game Score\n"
                +marquettenetrating+" Net Rating\n"+marquetteoffensiverating+" Offensive Rating\n"+marquettepace+" Pace\n"+marquettetrueshootingpercentage+" True Shooting Percentage");
				
		double kansasstwins = 21;
        double kansasstgamesplayed = 35;
        double kansasstwinpercentage = 0;
        double kansasstpointsscored = 2523;
        double kansasstppg = 0;
        double kansasstpointsallowed = 2372;
        double kansasstpapg = 0;
        double kansasstfgm = 869;
        double kansasstfga = 1883;
        double kansasstfgptg = 0;
        double kansasst2ptfgm = 622;
        double kansasst2ptfga = 1200;
        double kansasst2ptfgptg = 0;
        double kansasst3ptfgm = 247;
        double kansasst3ptfga = 683;
        double kansasst3ptfgptg = 0;
        double kansasstassists = 521;
        double kansasstassistspergame = 0;
        double kansasstassistsperfgm = 0;
        double kansasstassiststoturnoverratio = 0;
        double kansasstturnovers = 453;
        double kansasstturnoverspergame = 0;
        double kansasstblocks = 130;
        double kansasstblockspergame = 0;
        double kansasststeals = 271;
        double kansasststealspergame = 0;
        double kansasstfta = 775;
        double kansasstftm = 538;
        double kansasstturnoverpercentage = 0;
        double kansasstftpercentage = 0;
        double kansasstrebounds = 1132;
        double kansasstoffrebounds = 327;
        double kansasstdefrebounds = 805;
        double kansasstreboundspergame = 0;
        double kansasstoffreboundspergame = 0;
        double kansasstdefreboundspergame = 0;
        double kansasstpossessions = 0;
        double kansasstoppfga = 1921;
        double kansasstoppfta = 642;
        double kansasstopporb = 382;
        double kansassttoforced = 525;
        double kansasstdefrating = 0;
        double kansassteffectivefgpercentage = 0;
        double kansasstteamgamescore = 0;
        double kansasstfouls = 630;
        double kansasstnetrating = 0;
        double kansasstoffensiverating = 0;
        double kansasstpace = 0;
        double kansasstminutesplayed = 7025;
        double kansassttrueshootingpercentage = 0;
        kansasstwinpercentage = (kansasstwins/kansasstgamesplayed)*100;
        kansasstppg = (kansasstpointsscored/kansasstgamesplayed);
        kansasstpapg = (kansasstpointsallowed/kansasstgamesplayed);
        kansasstfgptg = (kansasstfgm/kansasstfga)*100;
        kansasst2ptfgptg = (kansasst2ptfgm/kansasst2ptfga)*100;
        kansasst3ptfgptg = (kansasst3ptfgm/kansasst3ptfga)*100;
        kansasstassistspergame = (kansasstassists/kansasstgamesplayed);
        kansasstassistsperfgm = (kansasstassists/kansasstfgm);
        kansasstassiststoturnoverratio = (kansasstassists/kansasstturnovers);
        kansasstblockspergame = (kansasstblocks/kansasstgamesplayed);
        kansasststealspergame = (kansasststeals/kansasstgamesplayed);
        kansasstturnoverspergame = (kansasstturnovers/kansasstgamesplayed);
        kansasstturnoverpercentage = (100*kansasstturnovers)/(kansasstfga+(0.475*kansasstfta)+kansasstturnovers);
        kansasstftpercentage = (kansasstftm/kansasstfta)*100;
        kansasstreboundspergame = (kansasstrebounds/kansasstgamesplayed);
        kansasstoffreboundspergame = (kansasstoffrebounds/kansasstgamesplayed);
        kansasstdefreboundspergame = (kansasstdefrebounds/kansasstgamesplayed);
        kansasstpossessions = (0.5 * (kansasstfga + (0.475 * kansasstfta) - kansasstoffrebounds + kansasstturnovers) + 0.5 * (kansasstoppfga + (0.475 * kansasstoppfta) - kansasstopporb + kansassttoforced));
        kansasstdefrating = 100*(kansasstpointsallowed/kansasstpossessions);
        kansassteffectivefgpercentage = ((kansasstfgm+(0.5*kansasst3ptfgm))/kansasstfga)*100;
        kansasstteamgamescore = ((kansasstpointsscored + (0.4 * kansasstfgm) - (0.7 * kansasstfga) - (0.4*(kansasstfta - kansasstftm)) + (0.7 * kansasstoffrebounds) + (0.3 * kansasstdefrebounds) + kansasststeals + (0.7 * kansasstassists) + (0.7 * kansasstblocks) - (0.4 * kansasstfouls) - kansasstturnovers)/8)/kansasstgamesplayed;
        kansasstnetrating = 100 * ((kansasstpointsscored - kansasstpointsallowed) / kansasstpossessions);
        kansasstoffensiverating = 100 * (kansasstpointsscored / kansasstpossessions);
        kansasstpace = 40 * (kansasstpossessions / (0.2 * kansasstminutesplayed));
        kansassttrueshootingpercentage = (kansasstpointsscored / (2 * (kansasstfga + 0.475 * kansasstfta)))*100;
        System.out.println("\nKansas State:\n" + kansasstwinpercentage + "% Win Percentage\n" + kansasstppg +
                " Points Per Game\n"+kansasstpapg+ " Points Allowed Per Game\n"+kansasstfgptg+
                "% Field Goal Percentage\n"+kansasst2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +kansasst3ptfgptg+"% 3 Point Field Goal Percentage\n"+kansasstassistspergame+" Assists Per Game\n"+
                kansasstassistsperfgm+" Assists Per FGM\n"+ kansasstassiststoturnoverratio+" Assists : TO Ratio\n"+
                kansasstblockspergame+" Blocks Per Game\n"+kansasststealspergame+" Steals Per Game\n"+
                kansasstturnoverspergame+" TO Per Game\n"+kansasstturnoverpercentage+" TO%\n"+ kansasstftpercentage+" FT%\n"+
                kansasstreboundspergame+" Rebounds Per Game\n"+kansasstoffreboundspergame+" Offensive Rebounds Per game\n"+
                kansasstdefreboundspergame+" Defensive Rebounds Per Game\n"+kansasstpossessions+" Possessions\n"+
                kansasstdefrating+" Defensive Rating\n"+kansassteffectivefgpercentage+" EFG%\n"+kansasstteamgamescore+" Team Game Score\n"
                +kansasstnetrating+" Net Rating\n"+kansasstoffensiverating+" Offensive Rating\n"+kansasstpace+" Pace\n"+kansassttrueshootingpercentage+" True Shooting Percentage");
				
				
		double xavierwins = 24;
        double xaviergamesplayed = 38;
        double xavierwinpercentage = 0;
        double xavierpointsscored = 2836;
        double xavierppg = 0;
        double xavierpointsallowed = 2711;
        double xavierpapg = 0;
        double xavierfgm = 981;
        double xavierfga = 2148;
        double xavierfgptg = 0;
        double xavier2ptfgm = 714;
        double xavier2ptfga = 1372;
        double xavier2ptfgptg = 0;
        double xavier3ptfgm = 267;
        double xavier3ptfga = 776;
        double xavier3ptfgptg = 0;
        double xavierassists = 559;
        double xavierassistspergame = 0;
        double xavierassistsperfgm = 0;
        double xavierassiststoturnoverratio = 0;
        double xavierturnovers = 478;
        double xavierturnoverspergame = 0;
        double xavierblocks = 100;
        double xavierblockspergame = 0;
        double xaviersteals = 228;
        double xavierstealspergame = 0;
        double xavierfta = 881;
        double xavierftm = 607;
        double xavierturnoverpercentage = 0;
        double xavierftpercentage = 0;
        double xavierrebounds = 1417;
        double xavieroffrebounds = 443;
        double xavierdefrebounds = 974;
        double xavierreboundspergame = 0;
        double xavieroffreboundspergame = 0;
        double xavierdefreboundspergame = 0;
        double xavierpossessions = 0;
        double xavieroppfga = 2144;
        double xavieroppfta = 716;
        double xavieropporb = 327;
        double xaviertoforced = 454;
        double xavierdefrating = 0;
        double xaviereffectivefgpercentage = 0;
        double xavierteamgamescore = 0;
        double xavierfouls = 708;
        double xaviernetrating = 0;
        double xavieroffensiverating = 0;
        double xavierpace = 0;
        double xavierminutesplayed = 7625;
        double xaviertrueshootingpercentage = 0;
        xavierwinpercentage = (xavierwins/xaviergamesplayed)*100;
        xavierppg = (xavierpointsscored/xaviergamesplayed);
        xavierpapg = (xavierpointsallowed/xaviergamesplayed);
        xavierfgptg = (xavierfgm/xavierfga)*100;
        xavier2ptfgptg = (xavier2ptfgm/xavier2ptfga)*100;
        xavier3ptfgptg = (xavier3ptfgm/xavier3ptfga)*100;
        xavierassistspergame = (xavierassists/xaviergamesplayed);
        xavierassistsperfgm = (xavierassists/xavierfgm);
        xavierassiststoturnoverratio = (xavierassists/xavierturnovers);
        xavierblockspergame = (xavierblocks/xaviergamesplayed);
        xavierstealspergame = (xaviersteals/xaviergamesplayed);
        xavierturnoverspergame = (xavierturnovers/xaviergamesplayed);
        xavierturnoverpercentage = (100*xavierturnovers)/(xavierfga+(0.475*xavierfta)+xavierturnovers);
        xavierftpercentage = (xavierftm/xavierfta)*100;
        xavierreboundspergame = (xavierrebounds/xaviergamesplayed);
        xavieroffreboundspergame = (xavieroffrebounds/xaviergamesplayed);
        xavierdefreboundspergame = (xavierdefrebounds/xaviergamesplayed);
        xavierpossessions = (0.5 * (xavierfga + (0.475 * xavierfta) - xavieroffrebounds + xavierturnovers) + 0.5 * (xavieroppfga + (0.475 * xavieroppfta) - xavieropporb + xaviertoforced));
        xavierdefrating = 100*(xavierpointsallowed/xavierpossessions);
        xaviereffectivefgpercentage = ((xavierfgm+(0.5*xavier3ptfgm))/xavierfga)*100;
        xavierteamgamescore = ((xavierpointsscored + (0.4 * xavierfgm) - (0.7 * xavierfga) - (0.4*(xavierfta - xavierftm)) + (0.7 * xavieroffrebounds) + (0.3 * xavierdefrebounds) + xaviersteals + (0.7 * xavierassists) + (0.7 * xavierblocks) - (0.4 * xavierfouls) - xavierturnovers)/8)/xaviergamesplayed;
        xaviernetrating = 100 * ((xavierpointsscored - xavierpointsallowed) / xavierpossessions);
        xavieroffensiverating = 100 * (xavierpointsscored / xavierpossessions);
        xavierpace = 40 * (xavierpossessions / (0.2 * xavierminutesplayed));
        xaviertrueshootingpercentage = (xavierpointsscored / (2 * (xavierfga + 0.475 * xavierfta)))*100;
        System.out.println("\nXavier:\n" + xavierwinpercentage + "% Win Percentage\n" + xavierppg +
                " Points Per Game\n"+xavierpapg+ " Points Allowed Per Game\n"+xavierfgptg+
                "% Field Goal Percentage\n"+xavier2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +xavier3ptfgptg+"% 3 Point Field Goal Percentage\n"+xavierassistspergame+" Assists Per Game\n"+
                xavierassistsperfgm+" Assists Per FGM\n"+ xavierassiststoturnoverratio+" Assists : TO Ratio\n"+
                xavierblockspergame+" Blocks Per Game\n"+xavierstealspergame+" Steals Per Game\n"+
                xavierturnoverspergame+" TO Per Game\n"+xavierturnoverpercentage+" TO%\n"+ xavierftpercentage+" FT%\n"+
                xavierreboundspergame+" Rebounds Per Game\n"+xavieroffreboundspergame+" Offensive Rebounds Per game\n"+
                xavierdefreboundspergame+" Defensive Rebounds Per Game\n"+xavierpossessions+" Possessions\n"+
                xavierdefrating+" Defensive Rating\n"+xaviereffectivefgpercentage+" EFG%\n"+xavierteamgamescore+" Team Game Score\n"
                +xaviernetrating+" Net Rating\n"+xavieroffensiverating+" Offensive Rating\n"+xavierpace+" Pace\n"+xaviertrueshootingpercentage+" True Shooting Percentage");
				
		double indianawins = 18;
        double indianagamesplayed = 34;
        double indianawinpercentage = 0;
        double indianapointsscored = 2711;
        double indianappg = 0;
        double indianapointsallowed = 2491;
        double indianapapg = 0;
        double indianafgm = 959;
        double indianafga = 2004;
        double indianafgptg = 0;
        double indiana2ptfgm = 664;
        double indiana2ptfga = 1228;
        double indiana2ptfgptg = 0;
        double indiana3ptfgm = 295;
        double indiana3ptfga = 776;
        double indiana3ptfgptg = 0;
        double indianaassists = 488;
        double indianaassistspergame = 0;
        double indianaassistsperfgm = 0;
        double indianaassiststoturnoverratio = 0;
        double indianaturnovers = 517;
        double indianaturnoverspergame = 0;
        double indianablocks = 157;
        double indianablockspergame = 0;
        double indianasteals = 209;
        double indianastealspergame = 0;
        double indianafta = 683;
        double indianaftm = 498;
        double indianaturnoverpercentage = 0;
        double indianaftpercentage = 0;
        double indianarebounds = 1328;
        double indianaoffrebounds = 413;
        double indianadefrebounds = 915;
        double indianareboundspergame = 0;
        double indianaoffreboundspergame = 0;
        double indianadefreboundspergame = 0;
        double indianapossessions = 0;
        double indianaoppfga = 2021;
        double indianaoppfta = 743;
        double indianaopporb = 355;
        double indianatoforced = 379;
        double indianadefrating = 0;
        double indianaeffectivefgpercentage = 0;
        double indianateamgamescore = 0;
        double indianafouls = 682;
        double indiananetrating = 0;
        double indianaoffensiverating = 0;
        double indianapace = 0;
        double indianaminutesplayed = 6950;
        double indianatrueshootingpercentage = 0;
        indianawinpercentage = (indianawins/indianagamesplayed)*100;
        indianappg = (indianapointsscored/indianagamesplayed);
        indianapapg = (indianapointsallowed/indianagamesplayed);
        indianafgptg = (indianafgm/indianafga)*100;
        indiana2ptfgptg = (indiana2ptfgm/indiana2ptfga)*100;
        indiana3ptfgptg = (indiana3ptfgm/indiana3ptfga)*100;
        indianaassistspergame = (indianaassists/indianagamesplayed);
        indianaassistsperfgm = (indianaassists/indianafgm);
        indianaassiststoturnoverratio = (indianaassists/indianaturnovers);
        indianablockspergame = (indianablocks/indianagamesplayed);
        indianastealspergame = (indianasteals/indianagamesplayed);
        indianaturnoverspergame = (indianaturnovers/indianagamesplayed);
        indianaturnoverpercentage = (100*indianaturnovers)/(indianafga+(0.475*indianafta)+indianaturnovers);
        indianaftpercentage = (indianaftm/indianafta)*100;
        indianareboundspergame = (indianarebounds/indianagamesplayed);
        indianaoffreboundspergame = (indianaoffrebounds/indianagamesplayed);
        indianadefreboundspergame = (indianadefrebounds/indianagamesplayed);
        indianapossessions = (0.5 * (indianafga + (0.475 * indianafta) - indianaoffrebounds + indianaturnovers) + 0.5 * (indianaoppfga + (0.475 * indianaoppfta) - indianaopporb + indianatoforced));
        indianadefrating = 100*(indianapointsallowed/indianapossessions);
        indianaeffectivefgpercentage = ((indianafgm+(0.5*indiana3ptfgm))/indianafga)*100;
        indianateamgamescore = ((indianapointsscored + (0.4 * indianafgm) - (0.7 * indianafga) - (0.4*(indianafta - indianaftm)) + (0.7 * indianaoffrebounds) + (0.3 * indianadefrebounds) + indianasteals + (0.7 * indianaassists) + (0.7 * indianablocks) - (0.4 * indianafouls) - indianaturnovers)/8)/indianagamesplayed;
        indiananetrating = 100 * ((indianapointsscored - indianapointsallowed) / indianapossessions);
        indianaoffensiverating = 100 * (indianapointsscored / indianapossessions);
        indianapace = 40 * (indianapossessions / (0.2 * indianaminutesplayed));
        indianatrueshootingpercentage = (indianapointsscored / (2 * (indianafga + 0.475 * indianafta)))*100;
        System.out.println("\nIndiana:\n" + indianawinpercentage + "% Win Percentage\n" + indianappg +
                " Points Per Game\n"+indianapapg+ " Points Allowed Per Game\n"+indianafgptg+
                "% Field Goal Percentage\n"+indiana2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +indiana3ptfgptg+"% 3 Point Field Goal Percentage\n"+indianaassistspergame+" Assists Per Game\n"+
                indianaassistsperfgm+" Assists Per FGM\n"+ indianaassiststoturnoverratio+" Assists : TO Ratio\n"+
                indianablockspergame+" Blocks Per Game\n"+indianastealspergame+" Steals Per Game\n"+
                indianaturnoverspergame+" TO Per Game\n"+indianaturnoverpercentage+" TO%\n"+ indianaftpercentage+" FT%\n"+
                indianareboundspergame+" Rebounds Per Game\n"+indianaoffreboundspergame+" Offensive Rebounds Per game\n"+
                indianadefreboundspergame+" Defensive Rebounds Per Game\n"+indianapossessions+" Possessions\n"+
                indianadefrating+" Defensive Rating\n"+indianaeffectivefgpercentage+" EFG%\n"+indianateamgamescore+" Team Game Score\n"
                +indiananetrating+" Net Rating\n"+indianaoffensiverating+" Offensive Rating\n"+indianapace+" Pace\n"+indianatrueshootingpercentage+" True Shooting Percentage");
				
				
		double minnesotawins = 24;
        double minnesotagamesplayed = 34;
        double minnesotawinpercentage = 0;
        double minnesotapointsscored = 2556;
        double minnesotappg = 0;
        double minnesotapointsallowed = 2361;
        double minnesotapapg = 0;
        double minnesotafgm = 887;
        double minnesotafga = 2037;
        double minnesotafgptg = 0;
        double minnesota2ptfgm = 678;
        double minnesota2ptfga = 1427;
        double minnesota2ptfgptg = 0;
        double minnesota3ptfgm = 209;
        double minnesota3ptfga = 610;
        double minnesota3ptfgptg = 0;
        double minnesotaassists = 507;
        double minnesotaassistspergame = 0;
        double minnesotaassistsperfgm = 0;
        double minnesotaassiststoturnoverratio = 0;
        double minnesotaturnovers = 393;
        double minnesotaturnoverspergame = 0;
        double minnesotablocks = 227;
        double minnesotablockspergame = 0;
        double minnesotasteals = 194;
        double minnesotastealspergame = 0;
        double minnesotafta = 806;
        double minnesotaftm = 573;
        double minnesotaturnoverpercentage = 0;
        double minnesotaftpercentage = 0;
        double minnesotarebounds = 1341;
        double minnesotaoffrebounds = 377;
        double minnesotadefrebounds = 964;
        double minnesotareboundspergame = 0;
        double minnesotaoffreboundspergame = 0;
        double minnesotadefreboundspergame = 0;
        double minnesotapossessions = 0;
        double minnesotaoppfga = 2142;
        double minnesotaoppfta = 626;
        double minnesotaopporb = 415;
        double minnesotatoforced = 429;
        double minnesotadefrating = 0;
        double minnesotaeffectivefgpercentage = 0;
        double minnesotateamgamescore = 0;
        double minnesotafouls = 577;
        double minnesotanetrating = 0;
        double minnesotaoffensiverating = 0;
        double minnesotapace = 0;
        double minnesotaminutesplayed = 6950;
        double minnesotatrueshootingpercentage = 0;
        minnesotawinpercentage = (minnesotawins/minnesotagamesplayed)*100;
        minnesotappg = (minnesotapointsscored/minnesotagamesplayed);
        minnesotapapg = (minnesotapointsallowed/minnesotagamesplayed);
        minnesotafgptg = (minnesotafgm/minnesotafga)*100;
        minnesota2ptfgptg = (minnesota2ptfgm/minnesota2ptfga)*100;
        minnesota3ptfgptg = (minnesota3ptfgm/minnesota3ptfga)*100;
        minnesotaassistspergame = (minnesotaassists/minnesotagamesplayed);
        minnesotaassistsperfgm = (minnesotaassists/minnesotafgm);
        minnesotaassiststoturnoverratio = (minnesotaassists/minnesotaturnovers);
        minnesotablockspergame = (minnesotablocks/minnesotagamesplayed);
        minnesotastealspergame = (minnesotasteals/minnesotagamesplayed);
        minnesotaturnoverspergame = (minnesotaturnovers/minnesotagamesplayed);
        minnesotaturnoverpercentage = (100*minnesotaturnovers)/(minnesotafga+(0.475*minnesotafta)+minnesotaturnovers);
        minnesotaftpercentage = (minnesotaftm/minnesotafta)*100;
        minnesotareboundspergame = (minnesotarebounds/minnesotagamesplayed);
        minnesotaoffreboundspergame = (minnesotaoffrebounds/minnesotagamesplayed);
        minnesotadefreboundspergame = (minnesotadefrebounds/minnesotagamesplayed);
        minnesotapossessions = (0.5 * (minnesotafga + (0.475 * minnesotafta) - minnesotaoffrebounds + minnesotaturnovers) + 0.5 * (minnesotaoppfga + (0.475 * minnesotaoppfta) - minnesotaopporb + minnesotatoforced));
        minnesotadefrating = 100*(minnesotapointsallowed/minnesotapossessions);
        minnesotaeffectivefgpercentage = ((minnesotafgm+(0.5*minnesota3ptfgm))/minnesotafga)*100;
        minnesotateamgamescore = ((minnesotapointsscored + (0.4 * minnesotafgm) - (0.7 * minnesotafga) - (0.4*(minnesotafta - minnesotaftm)) + (0.7 * minnesotaoffrebounds) + (0.3 * minnesotadefrebounds) + minnesotasteals + (0.7 * minnesotaassists) + (0.7 * minnesotablocks) - (0.4 * minnesotafouls) - minnesotaturnovers)/8)/minnesotagamesplayed;
        minnesotanetrating = 100 * ((minnesotapointsscored - minnesotapointsallowed) / minnesotapossessions);
        minnesotaoffensiverating = 100 * (minnesotapointsscored / minnesotapossessions);
        minnesotapace = 40 * (minnesotapossessions / (0.2 * minnesotaminutesplayed));
        minnesotatrueshootingpercentage = (minnesotapointsscored / (2 * (minnesotafga + 0.475 * minnesotafta)))*100;
        System.out.println("\nMinnesota:\n" + minnesotawinpercentage + "% Win Percentage\n" + minnesotappg +
                " Points Per Game\n"+minnesotapapg+ " Points Allowed Per Game\n"+minnesotafgptg+
                "% Field Goal Percentage\n"+minnesota2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +minnesota3ptfgptg+"% 3 Point Field Goal Percentage\n"+minnesotaassistspergame+" Assists Per Game\n"+
                minnesotaassistsperfgm+" Assists Per FGM\n"+ minnesotaassiststoturnoverratio+" Assists : TO Ratio\n"+
                minnesotablockspergame+" Blocks Per Game\n"+minnesotastealspergame+" Steals Per Game\n"+
                minnesotaturnoverspergame+" TO Per Game\n"+minnesotaturnoverpercentage+" TO%\n"+ minnesotaftpercentage+" FT%\n"+
                minnesotareboundspergame+" Rebounds Per Game\n"+minnesotaoffreboundspergame+" Offensive Rebounds Per game\n"+
                minnesotadefreboundspergame+" Defensive Rebounds Per Game\n"+minnesotapossessions+" Possessions\n"+
                minnesotadefrating+" Defensive Rating\n"+minnesotaeffectivefgpercentage+" EFG%\n"+minnesotateamgamescore+" Team Game Score\n"
                +minnesotanetrating+" Net Rating\n"+minnesotaoffensiverating+" Offensive Rating\n"+minnesotapace+" Pace\n"+minnesotatrueshootingpercentage+" True Shooting Percentage");
				
		


        double gonzagafinalranking = 0.0;
        double northcarolinafinalranking = 0.0;
        double westvirginiafinalranking = 0.0;
        double kentuckyfinalranking = 0.0;
        double villanovafinalranking = 0.0;
        double kansasfinalranking = 0.0;
        double louisvillefinalranking = 0.0;
        double floridafinalranking = 0.0;
        double dukefinalranking = 0.0;
        double wichitastfinalranking = 0.0;
        double oregonfinalranking = 0.0;
		double uclafinalranking = 0.0;
		double virginiafinalranking = 0.0;
		double iowastfinalranking = 0.0;
		double purduefinalranking = 0.0;
		double baylorfinalranking = 0.0;
		double wisconsinfinalranking = 0.0;
		double oklahomastfinalranking = 0.0;
		double floridastfinalranking = 0.0;
		double michiganfinalranking = 0.0;
		double smufinalranking = 0.0;
		double cincinnatifinalranking = 0.0;
		double arizonafinalranking = 0.0;
		double notredamefinalranking = 0.0;
		double butlerfinalranking = 0.0;
		double southcarolinafinalranking = 0.0;
		double creightonfinalranking = 0.0;
		double stmarysfinalranking = 0.0;
		double tcufinalranking = 0.0;
		double marquettefinalranking = 0.0;
		double kansasstfinalranking = 0.0;
		double xavierfinalranking = 0.0;
		double indianafinalranking = 0.0;
		double minnesotafinalranking = 0.0;
        double gonzagatournamentwinptg = 0.0;
        double northcarolinatournamentwinptg = 0.0;
        double westvirginiatournamentwinptg = 0.0;
        double kentuckytournamentwinptg = 0.0;
        double villanovatournamentwinptg = 0.0;
        double kansastournamentwinptg = 0.0;
        double louisvilletournamentwinptg = 0.0;
        double floridatournamentwinptg = 0.0;
        double duketournamentwinptg = 0.0;
        double wichitasttournamentwinptg = 0.0;
        double oregontournamentwinptg = 0.0;
		double uclatournamentwinptg = 0.0;
		double virginiatournamentwinptg = 0.0;
		double iowasttournamentwinptg = 0.0;
		double purduetournamentwinptg = 0.0;
		double baylortournamentwinptg = 0.0;
		double wisconsintournamentwinptg = 0.0;
		double oklahomasttournamentwinptg = 0.0;
		double floridasttournamentwinptg = 0.0;
		double michigantournamentwinptg = 0.0;
		double smutournamentwinptg = 0.0;
		double cincinnatitournamentwinptg = 0.0;
		double arizonatournamentwinptg = 0.0;
		double notredametournamentwinptg = 0.0;
		double butlertournamentwinptg = 0.0;
		double southcarolinatournamentwinptg = 0.0;
		double creightontournamentwinptg = 0.0;
		double stmarystournamentwinptg = 0.0;
		double tcutournamentwinptg = 0.0;
		double marquettetournamentwinptg = 0.0;
		double kansassttournamentwinptg = 0.0;
		double xaviertournamentwinptg = 0.0;
		double indianatournamentwinptg = 0.0;
		double minnesotatournamentwinptg = 0.0;
		
		
        System.out.println("\nBen Marks Power Ratings");
        gonzagafinalranking = ((((gonzagawinpercentage*75)*(50*(gonzagappg/gonzagapapg))*(50*gonzagafgptg)*(10*gonzagaassistsperfgm)*(20*gonzagaassiststoturnoverratio)*(gonzagablockspergame+gonzagastealspergame)*gonzagaftpercentage*(gonzagaoffensiverating+gonzagadefrating+gonzaganetrating+gonzagapace)*gonzagatrueshootingpercentage)/gonzagaturnoverpercentage)/1000000000/10000000);
        System.out.println("Gonzaga: "+gonzagafinalranking);
        northcarolinafinalranking = ((((northcarolinawinpercentage*75)*(50*(northcarolinappg/northcarolinapapg))*(50*northcarolinafgptg)*(10*northcarolinaassistsperfgm)*(20*northcarolinaassiststoturnoverratio)*(northcarolinablockspergame+northcarolinastealspergame)*northcarolinaftpercentage*(northcarolinaoffensiverating+northcarolinadefrating+northcarolinanetrating+northcarolinapace)*northcarolinatrueshootingpercentage)/northcarolinaturnoverpercentage)/1000000000/10000000);
        System.out.println("North Carolina: "+northcarolinafinalranking);
        westvirginiafinalranking = ((((westvirginiawinpercentage*75)*(50*(westvirginiappg/westvirginiapapg))*(50*westvirginiafgptg)*(10*westvirginiaassistsperfgm)*(20*westvirginiaassiststoturnoverratio)*(westvirginiablockspergame+westvirginiastealspergame)*westvirginiaftpercentage*(westvirginiaoffensiverating+westvirginiadefrating+westvirginianetrating+westvirginiapace)*westvirginiatrueshootingpercentage)/westvirginiaturnoverpercentage)/1000000000/10000000);
        System.out.println("West Virginia: "+westvirginiafinalranking);
        kentuckyfinalranking = ((((kentuckywinpercentage*75)*(50*(kentuckyppg/kentuckypapg))*(50*kentuckyfgptg)*(10*kentuckyassistsperfgm)*(20*kentuckyassiststoturnoverratio)*(kentuckyblockspergame+kentuckystealspergame)*kentuckyftpercentage*(kentuckyoffensiverating+kentuckydefrating+kentuckynetrating+kentuckypace)*kentuckytrueshootingpercentage)/kentuckyturnoverpercentage)/1000000000/10000000);
        System.out.println("Kentucky: "+kentuckyfinalranking);
        villanovafinalranking = ((((villanovawinpercentage*75)*(50*(villanovappg/villanovapapg))*(50*villanovafgptg)*(10*villanovaassistsperfgm)*(20*villanovaassiststoturnoverratio)*(villanovablockspergame+villanovastealspergame)*villanovaftpercentage*(villanovaoffensiverating+villanovadefrating+villanovanetrating+villanovapace)*villanovatrueshootingpercentage)/villanovaturnoverpercentage)/1000000000/10000000);
        System.out.println("Villanova: "+villanovafinalranking);
        kansasfinalranking = ((((kansaswinpercentage*75)*(50*(kansasppg/kansaspapg))*(50*kansasfgptg)*(10*kansasassistsperfgm)*(20*kansasassiststoturnoverratio)*(kansasblockspergame+kansasstealspergame)*kansasftpercentage*(kansasoffensiverating+kansasdefrating+kansasnetrating+kansaspace)*kansastrueshootingpercentage)/kansasturnoverpercentage)/1000000000/10000000);
        System.out.println("Kansas: "+kansasfinalranking);
        louisvillefinalranking = ((((louisvillewinpercentage*75)*(50*(louisvilleppg/louisvillepapg))*(50*louisvillefgptg)*(10*louisvilleassistsperfgm)*(20*louisvilleassiststoturnoverratio)*(louisvilleblockspergame+louisvillestealspergame)*louisvilleftpercentage*(louisvilleoffensiverating+louisvilledefrating+louisvillenetrating+louisvillepace)*louisvilletrueshootingpercentage)/louisvilleturnoverpercentage)/1000000000/10000000);
        System.out.println("Louisville: "+louisvillefinalranking);
        floridafinalranking = ((((floridawinpercentage*75)*(50*(floridappg/floridapapg))*(50*floridafgptg)*(10*floridaassistsperfgm)*(20*floridaassiststoturnoverratio)*(floridablockspergame+floridastealspergame)*floridaftpercentage*(floridaoffensiverating+floridadefrating+floridanetrating+floridapace)*floridatrueshootingpercentage)/floridaturnoverpercentage)/1000000000/10000000);
        System.out.println("Florida: "+floridafinalranking);
        dukefinalranking = ((((dukewinpercentage*75)*(50*(dukeppg/dukepapg))*(50*dukefgptg)*(10*dukeassistsperfgm)*(20*dukeassiststoturnoverratio)*(dukeblockspergame+dukestealspergame)*dukeftpercentage*(dukeoffensiverating+dukedefrating+dukenetrating+dukepace)*duketrueshootingpercentage)/duketurnoverpercentage)/1000000000/10000000);
        System.out.println("Duke: "+dukefinalranking);
        wichitastfinalranking = ((((wichitastwinpercentage*75)*(50*(wichitastppg/wichitastpapg))*(50*wichitastfgptg)*(10*wichitastassistsperfgm)*(20*wichitastassiststoturnoverratio)*(wichitastblockspergame+wichitaststealspergame)*wichitastftpercentage*(wichitastoffensiverating+wichitastdefrating+wichitastnetrating+wichitastpace)*wichitasttrueshootingpercentage)/wichitastturnoverpercentage)/1000000000/10000000);
        System.out.println("Wichita St: "+wichitastfinalranking);
        oregonfinalranking = ((((oregonwinpercentage*75)*(50*(oregonppg/oregonpapg))*(50*oregonfgptg)*(10*oregonassistsperfgm)*(20*oregonassiststoturnoverratio)*(oregonblockspergame+oregonstealspergame)*oregonftpercentage*(oregonoffensiverating+oregondefrating+oregonnetrating+oregonpace)*oregontrueshootingpercentage)/oregonturnoverpercentage)/1000000000/10000000);
        System.out.println("Oregon: "+oregonfinalranking);
		uclafinalranking = ((((uclawinpercentage*75)*(50*(uclappg/uclapapg))*(50*uclafgptg)*(10*uclaassistsperfgm)*(20*uclaassiststoturnoverratio)*(uclablockspergame+uclastealspergame)*uclaftpercentage*(uclaoffensiverating+ucladefrating+uclanetrating+uclapace)*uclatrueshootingpercentage)/uclaturnoverpercentage)/1000000000/10000000);
        System.out.println("UCLA: "+uclafinalranking);
		virginiafinalranking = ((((virginiawinpercentage*75)*(50*(virginiappg/virginiapapg))*(50*virginiafgptg)*(10*virginiaassistsperfgm)*(20*virginiaassiststoturnoverratio)*(virginiablockspergame+virginiastealspergame)*virginiaftpercentage*(virginiaoffensiverating+virginiadefrating+virginianetrating+virginiapace)*virginiatrueshootingpercentage)/virginiaturnoverpercentage)/1000000000/10000000);
        System.out.println("Virginia: "+virginiafinalranking);
		iowastfinalranking = ((((iowastwinpercentage*75)*(50*(iowastppg/iowastpapg))*(50*iowastfgptg)*(10*iowastassistsperfgm)*(20*iowastassiststoturnoverratio)*(iowastblockspergame+iowaststealspergame)*iowastftpercentage*(iowastoffensiverating+iowastdefrating+iowastnetrating+iowastpace)*iowasttrueshootingpercentage)/iowastturnoverpercentage)/1000000000/10000000);
        System.out.println("Iowa St: "+iowastfinalranking);
		purduefinalranking = ((((purduewinpercentage*75)*(50*(purdueppg/purduepapg))*(50*purduefgptg)*(10*purdueassistsperfgm)*(20*purdueassiststoturnoverratio)*(purdueblockspergame+purduestealspergame)*purdueftpercentage*(purdueoffensiverating+purduedefrating+purduenetrating+purduepace)*purduetrueshootingpercentage)/purdueturnoverpercentage)/1000000000/10000000);
        System.out.println("Purdue: "+purduefinalranking);
		baylorfinalranking = ((((baylorwinpercentage*75)*(50*(baylorppg/baylorpapg))*(50*baylorfgptg)*(10*baylorassistsperfgm)*(20*baylorassiststoturnoverratio)*(baylorblockspergame+baylorstealspergame)*baylorftpercentage*(bayloroffensiverating+baylordefrating+baylornetrating+baylorpace)*baylortrueshootingpercentage)/baylorturnoverpercentage)/1000000000/10000000);
        System.out.println("Baylor: "+baylorfinalranking);
		wisconsinfinalranking = ((((wisconsinwinpercentage*75)*(50*(wisconsinppg/wisconsinpapg))*(50*wisconsinfgptg)*(10*wisconsinassistsperfgm)*(20*wisconsinassiststoturnoverratio)*(wisconsinblockspergame+wisconsinstealspergame)*wisconsinftpercentage*(wisconsinoffensiverating+wisconsindefrating+wisconsinnetrating+wisconsinpace)*wisconsintrueshootingpercentage)/wisconsinturnoverpercentage)/1000000000/10000000);
        System.out.println("Wisconsin: "+wisconsinfinalranking);
		oklahomastfinalranking = ((((oklahomastwinpercentage*75)*(50*(oklahomastppg/oklahomastpapg))*(50*oklahomastfgptg)*(10*oklahomastassistsperfgm)*(20*oklahomastassiststoturnoverratio)*(oklahomastblockspergame+oklahomaststealspergame)*oklahomastftpercentage*(oklahomastoffensiverating+oklahomastdefrating+oklahomastnetrating+oklahomastpace)*oklahomasttrueshootingpercentage)/oklahomastturnoverpercentage)/1000000000/10000000);
        System.out.println("Oklahoma St: "+oklahomastfinalranking);
		floridastfinalranking = ((((floridastwinpercentage*75)*(50*(floridastppg/floridastpapg))*(50*floridastfgptg)*(10*floridastassistsperfgm)*(20*floridastassiststoturnoverratio)*(floridastblockspergame+floridaststealspergame)*floridastftpercentage*(floridastoffensiverating+floridastdefrating+floridastnetrating+floridastpace)*floridasttrueshootingpercentage)/floridastturnoverpercentage)/1000000000/10000000);
        System.out.println("Florida St: "+floridastfinalranking);
		michiganfinalranking = ((((michiganwinpercentage*75)*(50*(michiganppg/michiganpapg))*(50*michiganfgptg)*(10*michiganassistsperfgm)*(20*michiganassiststoturnoverratio)*(michiganblockspergame+michiganstealspergame)*michiganftpercentage*(michiganoffensiverating+michigandefrating+michigannetrating+michiganpace)*michigantrueshootingpercentage)/michiganturnoverpercentage)/1000000000/10000000);
        System.out.println("Michigan: "+michiganfinalranking);
		smufinalranking = ((((smuwinpercentage*75)*(50*(smuppg/smupapg))*(50*smufgptg)*(10*smuassistsperfgm)*(20*smuassiststoturnoverratio)*(smublockspergame+smustealspergame)*smuftpercentage*(smuoffensiverating+smudefrating+smunetrating+smupace)*smutrueshootingpercentage)/smuturnoverpercentage)/1000000000/10000000);
        System.out.println("SMU: "+smufinalranking);
		cincinnatifinalranking = ((((cincinnatiwinpercentage*75)*(50*(cincinnatippg/cincinnatipapg))*(50*cincinnatifgptg)*(10*cincinnatiassistsperfgm)*(20*cincinnatiassiststoturnoverratio)*(cincinnatiblockspergame+cincinnatistealspergame)*cincinnatiftpercentage*(cincinnatioffensiverating+cincinnatidefrating+cincinnatinetrating+cincinnatipace)*cincinnatitrueshootingpercentage)/cincinnatiturnoverpercentage)/1000000000/10000000);
        System.out.println("Cincinnati: "+cincinnatifinalranking);
		arizonafinalranking = ((((arizonawinpercentage*75)*(50*(arizonappg/arizonapapg))*(50*arizonafgptg)*(10*arizonaassistsperfgm)*(20*arizonaassiststoturnoverratio)*(arizonablockspergame+arizonastealspergame)*arizonaftpercentage*(arizonaoffensiverating+arizonadefrating+arizonanetrating+arizonapace)*arizonatrueshootingpercentage)/arizonaturnoverpercentage)/1000000000/10000000);
        System.out.println("Arizona: "+arizonafinalranking);
		notredamefinalranking = ((((notredamewinpercentage*75)*(50*(notredameppg/notredamepapg))*(50*notredamefgptg)*(10*notredameassistsperfgm)*(20*notredameassiststoturnoverratio)*(notredameblockspergame+notredamestealspergame)*notredameftpercentage*(notredameoffensiverating+notredamedefrating+notredamenetrating+notredamepace)*notredametrueshootingpercentage)/notredameturnoverpercentage)/1000000000/10000000);
        System.out.println("Notre Dame: "+notredamefinalranking);
		butlerfinalranking = ((((butlerwinpercentage*75)*(50*(butlerppg/butlerpapg))*(50*butlerfgptg)*(10*butlerassistsperfgm)*(20*butlerassiststoturnoverratio)*(butlerblockspergame+butlerstealspergame)*butlerftpercentage*(butleroffensiverating+butlerdefrating+butlernetrating+butlerpace)*butlertrueshootingpercentage)/butlerturnoverpercentage)/1000000000/10000000);
        System.out.println("Butler: "+butlerfinalranking);
		southcarolinafinalranking = ((((southcarolinawinpercentage*75)*(50*(southcarolinappg/southcarolinapapg))*(50*southcarolinafgptg)*(10*southcarolinaassistsperfgm)*(20*southcarolinaassiststoturnoverratio)*(southcarolinablockspergame+southcarolinastealspergame)*southcarolinaftpercentage*(southcarolinaoffensiverating+southcarolinadefrating+southcarolinanetrating+southcarolinapace)*southcarolinatrueshootingpercentage)/southcarolinaturnoverpercentage)/1000000000/10000000);
        System.out.println("South Carolina: "+southcarolinafinalranking);
		creightonfinalranking = ((((creightonwinpercentage*75)*(50*(creightonppg/creightonpapg))*(50*creightonfgptg)*(10*creightonassistsperfgm)*(20*creightonassiststoturnoverratio)*(creightonblockspergame+creightonstealspergame)*creightonftpercentage*(creightonoffensiverating+creightondefrating+creightonnetrating+creightonpace)*creightontrueshootingpercentage)/creightonturnoverpercentage)/1000000000/10000000);
        System.out.println("Creighton: "+creightonfinalranking);
		stmarysfinalranking = ((((stmaryswinpercentage*75)*(50*(stmarysppg/stmaryspapg))*(50*stmarysfgptg)*(10*stmarysassistsperfgm)*(20*stmarysassiststoturnoverratio)*(stmarysblockspergame+stmarysstealspergame)*stmarysftpercentage*(stmarysoffensiverating+stmarysdefrating+stmarysnetrating+stmaryspace)*stmarystrueshootingpercentage)/stmarysturnoverpercentage)/1000000000/10000000);
        System.out.println("St Mary's: "+stmarysfinalranking);
		tcufinalranking = ((((tcuwinpercentage*75)*(50*(tcuppg/tcupapg))*(50*tcufgptg)*(10*tcuassistsperfgm)*(20*tcuassiststoturnoverratio)*(tcublockspergame+tcustealspergame)*tcuftpercentage*(tcuoffensiverating+tcudefrating+tcunetrating+tcupace)*tcutrueshootingpercentage)/tcuturnoverpercentage)/1000000000/10000000);
        System.out.println("TCU: "+tcufinalranking);
		marquettefinalranking = ((((marquettewinpercentage*75)*(50*(marquetteppg/marquettepapg))*(50*marquettefgptg)*(10*marquetteassistsperfgm)*(20*marquetteassiststoturnoverratio)*(marquetteblockspergame+marquettestealspergame)*marquetteftpercentage*(marquetteoffensiverating+marquettedefrating+marquettenetrating+marquettepace)*marquettetrueshootingpercentage)/marquetteturnoverpercentage)/1000000000/10000000);
        System.out.println("Marquette: "+marquettefinalranking);
		kansasstfinalranking = ((((kansasstwinpercentage*75)*(50*(kansasstppg/kansasstpapg))*(50*kansasstfgptg)*(10*kansasstassistsperfgm)*(20*kansasstassiststoturnoverratio)*(kansasstblockspergame+kansasststealspergame)*kansasstftpercentage*(kansasstoffensiverating+kansasstdefrating+kansasstnetrating+kansasstpace)*kansassttrueshootingpercentage)/kansasstturnoverpercentage)/1000000000/10000000);
        System.out.println("Kansas St: "+kansasstfinalranking);
		xavierfinalranking = ((((xavierwinpercentage*75)*(50*(xavierppg/xavierpapg))*(50*xavierfgptg)*(10*xavierassistsperfgm)*(20*xavierassiststoturnoverratio)*(xavierblockspergame+xavierstealspergame)*xavierftpercentage*(xavieroffensiverating+xavierdefrating+xaviernetrating+xavierpace)*xaviertrueshootingpercentage)/xavierturnoverpercentage)/1000000000/10000000);
        System.out.println("Xavier: "+xavierfinalranking);
		indianafinalranking = ((((indianawinpercentage*75)*(50*(indianappg/indianapapg))*(50*indianafgptg)*(10*indianaassistsperfgm)*(20*indianaassiststoturnoverratio)*(indianablockspergame+indianastealspergame)*indianaftpercentage*(indianaoffensiverating+indianadefrating+indiananetrating+indianapace)*indianatrueshootingpercentage)/indianaturnoverpercentage)/1000000000/10000000);
        System.out.println("Indiana: "+indianafinalranking);
		minnesotafinalranking = ((((minnesotawinpercentage*75)*(50*(minnesotappg/minnesotapapg))*(50*minnesotafgptg)*(10*minnesotaassistsperfgm)*(20*minnesotaassiststoturnoverratio)*(minnesotablockspergame+minnesotastealspergame)*minnesotaftpercentage*(minnesotaoffensiverating+minnesotadefrating+minnesotanetrating+minnesotapace)*minnesotatrueshootingpercentage)/minnesotaturnoverpercentage)/1000000000/10000000);
        System.out.println("Minnesota: "+minnesotafinalranking);

        double totalrankings = gonzagafinalranking + northcarolinafinalranking + westvirginiafinalranking + kentuckyfinalranking + villanovafinalranking + kansasfinalranking + louisvillefinalranking + floridafinalranking + dukefinalranking + wichitastfinalranking + oregonfinalranking + uclafinalranking + virginiafinalranking + iowastfinalranking + purduefinalranking + baylorfinalranking + wisconsinfinalranking + oklahomastfinalranking + floridastfinalranking + michiganfinalranking + smufinalranking + cincinnatifinalranking + arizonafinalranking + notredamefinalranking + butlerfinalranking + southcarolinafinalranking + creightonfinalranking + stmarysfinalranking + tcufinalranking + marquettefinalranking + kansasstfinalranking + xavierfinalranking + indianafinalranking + minnesotafinalranking;
        System.out.println("\nNCAA Tournament Title Percent Chance: ");
        gonzagatournamentwinptg = (100*(gonzagafinalranking/totalrankings));
        System.out.println("Gonzaga: "+gonzagatournamentwinptg);
        northcarolinatournamentwinptg = (100*(northcarolinafinalranking/totalrankings));
        System.out.println("North Carolina: "+northcarolinatournamentwinptg);
        westvirginiatournamentwinptg = (100*(westvirginiafinalranking/totalrankings));
        System.out.println("West Virginia: "+westvirginiatournamentwinptg);
        kentuckytournamentwinptg = (100*(kentuckyfinalranking/totalrankings));
        System.out.println("Kentucky: "+kentuckytournamentwinptg);
        villanovatournamentwinptg = (100*(villanovafinalranking/totalrankings));
        System.out.println("Villanova: "+villanovatournamentwinptg);
        kansastournamentwinptg = (100*(kansasfinalranking/totalrankings));
        System.out.println("Kansas: "+kansastournamentwinptg);
        louisvilletournamentwinptg = (100*(louisvillefinalranking/totalrankings));
        System.out.println("Louisville: "+louisvilletournamentwinptg);
        floridatournamentwinptg = (100*(floridafinalranking/totalrankings));
        System.out.println("Florida: "+floridatournamentwinptg);
        duketournamentwinptg = (100*(dukefinalranking/totalrankings));
        System.out.println("Duke: "+duketournamentwinptg);
        wichitasttournamentwinptg = (100*(wichitastfinalranking/totalrankings));
        System.out.println("Wichita St: "+wichitasttournamentwinptg);
        oregontournamentwinptg = (100*(oregonfinalranking/totalrankings));
        System.out.println("Oregon: "+oregontournamentwinptg);
		uclatournamentwinptg = (100*(uclafinalranking/totalrankings));
        System.out.println("UCLA: "+uclatournamentwinptg);
		virginiatournamentwinptg = (100*(virginiafinalranking/totalrankings));
        System.out.println("Virginia: "+virginiatournamentwinptg);
		iowasttournamentwinptg = (100*(iowastfinalranking/totalrankings));
        System.out.println("Iowa St: "+iowasttournamentwinptg);
		purduetournamentwinptg = (100*(purduefinalranking/totalrankings));
        System.out.println("Purdue: "+purduetournamentwinptg);
		baylortournamentwinptg = (100*(baylorfinalranking/totalrankings));
        System.out.println("Baylor: "+baylortournamentwinptg);
		wisconsintournamentwinptg = (100*(wisconsinfinalranking/totalrankings));
        System.out.println("Wisconsin: "+wisconsintournamentwinptg);
		oklahomasttournamentwinptg = (100*(oklahomastfinalranking/totalrankings));
        System.out.println("Oklahoma St: "+oklahomasttournamentwinptg);
		floridasttournamentwinptg = (100*(floridastfinalranking/totalrankings));
        System.out.println("Florida St: "+floridasttournamentwinptg);
		michigantournamentwinptg = (100*(michiganfinalranking/totalrankings));
        System.out.println("Michigan: "+michigantournamentwinptg);
		smutournamentwinptg = (100*(smufinalranking/totalrankings));
        System.out.println("SMU: "+smutournamentwinptg);
		cincinnatitournamentwinptg = (100*(cincinnatifinalranking/totalrankings));
        System.out.println("Cincinnati: "+cincinnatitournamentwinptg);
		arizonatournamentwinptg = (100*(arizonafinalranking/totalrankings));
        System.out.println("Arizona: "+arizonatournamentwinptg);
		notredametournamentwinptg = (100*(notredamefinalranking/totalrankings));
        System.out.println("Notre Dame: "+notredametournamentwinptg);
		butlertournamentwinptg = (100*(butlerfinalranking/totalrankings));
        System.out.println("Butler: "+butlertournamentwinptg);
		southcarolinatournamentwinptg = (100*(southcarolinafinalranking/totalrankings));
        System.out.println("South Carolina: "+southcarolinatournamentwinptg);
		creightontournamentwinptg = (100*(creightonfinalranking/totalrankings));
        System.out.println("Creighton: "+creightontournamentwinptg);
		stmarystournamentwinptg = (100*(stmarysfinalranking/totalrankings));
        System.out.println("St Mary's: "+stmarystournamentwinptg);
		tcutournamentwinptg = (100*(tcufinalranking/totalrankings));
        System.out.println("TCU: "+tcutournamentwinptg);
		marquettetournamentwinptg = (100*(marquettefinalranking/totalrankings));
        System.out.println("Marquette: "+marquettetournamentwinptg);
		kansassttournamentwinptg = (100*(kansasstfinalranking/totalrankings));
        System.out.println("Kansas St: "+kansassttournamentwinptg);
		xaviertournamentwinptg = (100*(xavierfinalranking/totalrankings));
        System.out.println("Xavier: "+xaviertournamentwinptg);
		indianatournamentwinptg = (100*(indianafinalranking/totalrankings));
        System.out.println("Indiana: "+indianatournamentwinptg);
		minnesotatournamentwinptg = (100*(minnesotafinalranking/totalrankings));
        System.out.println("Minnesota: "+minnesotatournamentwinptg);
		
    }
}
/*
Formulas:
Rk,School,Conf,,W,L,Pts,Opp,MOV,,SOS,,OSRS,DSRS,SRS,ORtg,DRtg,NRtg
Strength Of Conference: (Total Team Wins/Total Teams * Total Net Rating/Teams)
Significant Injuries: (Add Integer Value)
Win Percentage: (Wins/Total Games)
Points Per Game: (Total Points Scored/Games)
Points Allowed Per Game: (Total Points Allowed/Games)
Point Differential: (Total Points - Total Points Allowed)
Strength Of Schedule: Take Value from Basketball-Referance.com
Field Goal Percentage: (Field Goals Made/Field Goals Attempted)
2 Point Percentage: (2 Point FG Made/2 Point FG Attempted)
3 Point Percentage: (3 Point FG Made/3 Point FG Attempted)
Assists Per Game: (Total Assists/Games)
Blocks Per Game: (Total Blocks/Games)
Steals Per Game: (Total Steals/Games)
Turnovers Per Game: (Total Turnovers/Games)
Turnover Percentage: 100 * TOV / (FGA + 0.475 * FTA + TOV)
Defensive Rebounds Per Game: (Total Defensive Rebounds/Games)
Offensive Rebounds Per Game: (Total Offensive Rebounds/Games)
Defensive Rating: 100*(Opponent Points/Possessions)
Effective Field Goal Percentage: (Field Goals+(0.5*3 Pointers))/Field Goals Attempted
Free Throw Percentage: (FTMade/FTAttempted)
Free Throw Attempts Per Game: FTAttempted
Team Game Score: (PTS + 0.4 * FG - 0.7 * FGA - 0.4*(FTA - FT) + 0.7 * ORB + 0.3 * DRB + STL + 0.7 * AST + 0.7 * BLK - 0.4 * PF - TOV)/8
Net Rating: 100 * ((PTS - Opp PTS) / Poss)
Offensive Rating: 100 * (PTS / Poss)
Pace: 40 * (Poss / (0.2 * Tm MP))
Possessions: 0.5 * (FGA + 0.475 * FTA - ORB + TOV) + 0.5 * (Opp FGA + 0.475 * Opp FTA - Opp ORB + Opp TOV)
True Shooting Percentage: PTS / (2 * (FGA + 0.475 * FTA))
Rk,School,Conf,,W,L,Pts,Opp,MOV,,SOS,,OSRS,DSRS,SRS,ORtg,DRtg,NRtg
1,Gonzaga,WCC,,37,2,82.6,61.5,21.13,,4.13,,12.79,12.47,25.26,119.23,82.51,36.71
2,North Carolina,ACC,,33,7,84.4,70.6,13.83,,11.76,,16.92,7.91,24.84,122.33,86.92,35.41
3,West Virginia,Big 12,,28,9,81.5,66.7,14.78,,9.67,,14.63,9.83,24.45,118.49,84.37,34.12
4,Kentucky,SEC,,32,6,84.9,71.5,13.39,,10.49,,16.92,6.96,23.88,120.28,86.87,33.41
5,Villanova,Big East,,32,4,77.2,62.7,14.53,,9.28,,9.20,14.61,23.80,123.50,87.45,36.05
6,Kansas,Big 12,,31,5,83.2,71.9,11.31,,12.23,,16.58,6.95,23.53,123.67,89.65,34.02
7,Louisville,ACC,,25,9,77.3,66.0,11.32,,11.15,,10.35,12.13,22.47,118.44,85.52,32.93
8,Florida,SEC,,27,9,77.9,66.5,11.39,,11.01,,11.36,11.04,22.40,117.61,85.10,32.51
9,Duke,ACC,,28,9,80.8,70.2,10.65,,10.91,,13.15,8.41,21.56,122.70,91.17,31.53
10,Wichita State,MVC,,31,5,81.0,62.4,18.61,,2.96,,10.67,10.57,21.24,117.30,86.44,30.85
11,Oregon,Pac-12,,33,6,78.9,65.8,13.10,,8.38,,9.52,11.29,20.80,118.40,88.20,30.20
12,UCLA,Pac-12,,31,5,89.8,75.5,14.28,,6.39,,20.52,0.15,20.67,124.63,95.78,28.85
13,Virginia,ACC,,23,11,66.1,56.4,9.71,,10.93,,-1.49,22.12,20.63,114.37,81.99,32.38
14,Iowa State,Big 12,,24,11,80.8,72.3,8.57,,11.94,,12.54,7.97,20.51,119.92,90.84,29.09
15,Purdue,Big Ten,,27,8,79.7,68.4,11.34,,8.79,,11.54,8.59,20.13,118.48,88.85,29.63
16,Baylor,Big 12,,27,8,72.9,63.7,9.20,,11.87,,4.89,14.86,19.75,117.81,87.95,29.86
17,Wisconsin,Big Ten,,27,10,72.4,62.4,10.00,,9.40,,3.85,15.56,19.40,116.38,86.58,29.80
18,Oklahoma State,Big 12,,20,13,85.7,78.5,7.24,,12.22,,19.23,-0.04,19.19,125.05,97.65,27.40
19,Florida State,ACC,,26,9,82.1,72.1,10.00,,8.87,,13.22,5.65,18.87,117.54,90.36,27.18
20,Michigan,Big Ten,,26,12,75.0,66.4,8.63,,10.17,,7.68,11.13,18.80,123.68,94.53,29.14
21,Southern Methodist,AAC,,30,5,74.3,60.0,14.26,,4.45,,5.83,12.88,18.71,120.93,90.91,30.02
22,Cincinnati,AAC,,30,6,74.3,61.3,12.94,,5.49,,4.50,13.94,18.43,116.04,88.07,27.97
23,Arizona,Pac-12,,32,5,76.6,65.9,10.62,,7.63,,7.47,10.79,18.25,118.07,90.77,27.29
24,Notre Dame,ACC,,26,10,77.3,69.3,8.03,,9.78,,10.00,7.81,17.81,119.69,93.01,26.68
25,Butler,Big East,,25,9,76.3,68.9,7.47,,10.23,,8.45,9.25,17.70,119.19,92.47,26.71
26,South Carolina,SEC,,26,11,73.2,65.2,7.92,,10.16,,5.20,12.32,17.52,109.79,83.76,26.03
27,Creighton,Big East,,25,10,81.8,72.8,9.00,,8.95,,12.76,4.51,17.27,116.88,91.79,25.08
28,Saint Mary's (CA),WCC,,29,5,72.0,57.5,14.56,,2.19,,1.09,15.66,16.75,119.63,91.48,28.15
29,Texas Christian,Big 12,,24,15,74.7,69.7,5.03,,10.95,,7.12,8.52,15.64,116.16,92.98,23.18
30,Marquette,Big East,,19,13,82.2,75.6,6.66,,8.60,,14.48,0.78,15.26,122.04,99.18,22.86
31,Kansas State,Big 12,,21,14,72.1,67.8,4.31,,10.48,,4.38,10.42,14.80,114.30,91.81,22.49
32,Xavier,Big East,,24,14,74.6,71.3,3.29,,11.51,,7.60,7.20,14.80,115.94,93.35,22.59
33,Indiana,Big Ten,,18,16,79.7,73.3,6.47,,8.16,,11.23,3.39,14.63,117.34,96.09,21.25
34,Minnesota,Big Ten,,24,10,75.2,69.4,5.74,,8.82,,7.61,6.95,14.56,109.07,87.65,21.42
35,Miami(FL),ACC,,21,12,69.0,64.1,4.91,,9.57,,0.43,14.05,14.48,110.75,89.05,21.70
36,Wake Forest,ACC,,19,14,82.8,78.4,4.39,,9.80,,14.95,-0.76,14.19,120.96,100.01,20.94
37,Texas Tech,Big 12,,18,14,73.3,67.1,6.25,,7.86,,3.31,10.80,14.11,115.27,93.60,21.68
38,Arkansas,SEC,,26,10,79.3,73.9,5.44,,8.60,,10.56,3.48,14.04,116.19,95.76,20.43
39,Northwestern,Big Ten,,24,12,71.1,65.5,5.58,,8.43,,2.90,11.12,14.02,111.60,90.43,21.17
40,Syracuse,ACC,,19,15,76.3,71.1,5.24,,8.47,,8.33,5.37,13.70,117.39,96.51,20.88
41,Vanderbilt,SEC,,19,16,71.1,68.1,2.97,,10.72,,3.95,9.75,13.69,113.82,92.70,21.11
42,Michigan State,Big Ten,,20,15,71.9,68.7,3.17,,10.50,,4.20,9.47,13.67,113.33,92.34,20.99
43,Clemson,ACC,,17,16,74.8,71.5,3.24,,9.98,,6.64,6.58,13.22,115.83,95.51,20.32
44,Dayton,A-10,,24,8,75.9,66.4,9.44,,4.27,,5.80,7.18,12.98,111.80,92.02,19.78
45,Rhode Island,A-10,,25,10,73.6,65.4,8.26,,4.62,,3.78,9.10,12.88,111.77,91.83,19.94
46,Maryland,Big Ten,,24,9,73.9,68.1,5.82,,8.29,,5.84,6.95,12.79,113.29,93.65,19.65
47,Virginia Tech,ACC,,22,11,79.1,74.7,4.39,,8.38,,10.14,2.63,12.77,117.40,98.49,18.91
48,Utah,Pac-12,,20,12,78.5,68.1,10.34,,4.32,,7.80,4.66,12.45,114.36,95.51,18.85
49,Houston,AAC,,21,11,73.7,64.9,8.78,,3.42,,4.35,7.84,12.20,114.46,95.06,19.40
50,Seton Hall,Big East,,21,12,73.2,70.4,2.85,,9.25,,4.83,7.28,12.10,110.37,92.15,18.22
51,Virginia Commonwealth,A-10,,26,9,74.7,66.9,7.80,,3.77,,5.67,5.90,11.57,109.80,91.91,17.89
52,Southern California,Pac-12,,26,10,78.2,73.1,5.08,,6.40,,8.07,3.41,11.48,114.63,96.98,17.65
53,Oklahoma,Big 12,,11,20,73.0,74.2,-1.19,,12.62,,6.56,4.86,11.42,108.25,91.41,16.84
54,Alabama,SEC,,19,15,68.5,64.7,3.82,,7.47,,-0.99,12.28,11.29,105.39,88.25,17.14
55,Tennessee,SEC,,16,16,74.5,73.0,1.50,,10.18,,6.45,4.83,11.28,110.71,93.31,17.40
56,Providence,Big East,,20,13,70.3,66.9,3.39,,7.84,,1.51,9.73,11.24,108.83,91.63,17.20
57,Georgetown,Big East,,14,18,74.0,72.2,1.88,,9.31,,5.47,5.71,11.18,110.07,92.94,17.13
58,Georgia,SEC,,19,15,71.6,70.4,1.24,,10.28,,2.82,8.31,11.13,108.73,91.96,16.78
59,University of California,Pac-12,,21,13,68.1,63.4,4.76,,6.34,,-0.42,11.53,11.11,105.35,88.19,17.15
60,Texas,Big 12,,11,22,67.1,68.9,-1.76,,12.75,,0.36,10.63,10.99,105.21,88.78,16.44
61,Illinois,Big Ten,,20,15,71.7,69.1,2.60,,9.25,,1.53,9.01,10.54,108.95,92.69,16.26
62,Nevada,MWC,,28,7,79.8,71.3,8.46,,2.03,,8.93,1.56,10.49,113.89,98.08,15.81
63,Texas A&M,SEC,,16,15,70.2,67.8,2.39,,7.97,,0.05,10.30,10.36,108.52,92.68,15.84
64,Ohio State,Big Ten,,17,15,72.8,69.8,3.03,,7.28,,4.91,5.41,10.31,111.73,95.59,16.14
65,Illinois State,MVC,,28,7,69.1,61.3,7.77,,2.71,,-1.46,11.76,10.30,106.79,89.94,16.84
66,Iowa,Big Ten,,19,15,80.5,78.1,2.47,,7.54,,11.68,-1.67,10.01,113.29,98.21,15.08
67,Middle Tennessee,CUSA,,31,5,74.9,63.9,11.06,,-0.48,,0.50,9.30,9.80,111.43,95.30,16.13
68,Mississippi,SEC,,22,14,78.0,76.3,1.67,,7.99,,9.14,0.51,9.65,110.83,96.22,14.60
69,Central Florida,AAC,,24,12,67.1,61.2,5.89,,3.69,,-2.13,11.71,9.58,104.66,89.29,15.37
70,Pittsburgh,ACC,,16,17,72.8,74.7,-1.82,,11.06,,4.98,4.26,9.25,113.86,99.92,13.94
71,Colorado,Pac-12,,19,15,75.5,72.2,3.32,,6.00,,6.04,3.08,9.12,112.22,97.62,14.59
72,Brigham Young,WCC,,22,12,80.6,74.3,6.35,,1.87,,11.12,-2.90,8.22,107.61,95.64,11.97
73,Auburn,SEC,,18,14,80.4,79.6,0.84,,7.33,,11.88,-3.71,8.17,111.05,98.51,12.54
74,North Carolina-Wilmington,CAA,,29,6,84.8,75.0,9.80,,-0.55,,10.95,-2.89,8.06,116.75,103.88,12.88
75,Penn State,Big Ten,,15,18,71.7,72.7,-1.00,,8.90,,4.53,3.37,7.90,104.89,92.49,12.41
76,Georgia Tech,ACC,,21,16,67.5,66.8,0.65,,8.21,,-2.58,10.41,7.82,101.01,88.85,12.16
77,East Tennessee State,Southern,,27,8,79.5,69.7,9.83,,-2.11,,4.41,2.91,7.31,106.66,95.47,11.19
78,Connecticut,AAC,,16,17,67.3,66.3,0.94,,6.61,,-1.61,8.84,7.23,105.56,93.53,12.03
79,Mississippi State,SEC,,16,16,72.5,71.3,1.22,,5.90,,2.89,4.23,7.12,107.40,95.89,11.51
80,San Diego State,MWC,,19,14,68.5,62.5,5.94,,1.47,,-3.94,10.82,6.88,103.55,92.18,11.36
81,Vermont,AEC,,29,6,73.5,62.1,11.34,,-3.27,,-0.77,7.44,6.67,109.54,97.21,12.34
82,Princeton,Ivy,,23,7,71.6,61.4,10.20,,-1.84,,-3.08,9.65,6.57,108.58,95.69,12.89
83,Memphis,AAC,,19,13,74.0,70.7,3.28,,3.19,,3.66,2.81,6.47,107.85,97.57,10.28
84,Nebraska,Big Ten,,12,19,69.9,73.0,-3.10,,10.74,,2.24,4.23,6.47,105.69,95.24,10.45
85,Davidson,A-10,,17,15,73.8,71.6,2.19,,4.26,,3.56,2.88,6.45,108.31,98.04,10.27
86,St. John's (NY),Big East,,14,19,76.8,78.7,-1.94,,8.39,,8.75,-2.30,6.45,109.60,98.42,11.17
87,Stanford,Pac-12,,14,17,69.7,71.1,-1.35,,8.59,,1.00,5.39,6.39,104.69,94.35,10.34
88,North Carolina State,ACC,,15,17,77.6,79.6,-2.00,,8.09,,9.14,-3.05,6.09,111.92,102.33,9.59
89,Colorado State,MWC,,24,12,72.5,68.0,4.56,,2.17,,0.75,5.28,6.03,108.07,97.68,10.40
90,St. Bonaventure,A-10,,20,12,76.8,72.4,4.47,,1.48,,4.49,1.46,5.95,108.03,98.14,9.89
91,Texas-Arlington,Sun Belt,,27,9,78.3,69.9,8.39,,-0.87,,5.42,0.50,5.92,108.37,98.94,9.42
92,Bucknell,Patriot,,26,9,76.3,67.9,8.37,,-2.48,,4.04,1.85,5.89,107.33,98.12,9.21
93,Boise State,MWC,,20,12,75.1,71.2,3.94,,2.72,,4.06,1.47,5.52,107.69,98.66,9.03
94,Richmond,A-10,,22,13,74.2,72.0,2.17,,3.28,,4.16,1.28,5.45,109.83,100.38,9.45
95,Louisiana Tech,CUSA,,23,10,77.5,66.8,10.73,,-4.35,,2.39,2.81,5.20,106.91,98.19,8.72
96,Loyola (IL),MVC,,18,14,73.4,66.8,6.59,,1.02,,1.07,4.08,5.15,108.25,98.95,9.30
97,Monmouth,MAAC,,27,7,81.2,73.6,7.56,,-2.62,,6.61,-1.66,4.94,106.12,98.15,7.97
98,Temple,AAC,,16,16,70.9,71.2,-0.25,,5.09,,2.72,2.12,4.84,107.77,99.33,8.44
99,New Mexico State,WAC,,28,6,78.8,67.9,10.82,,-3.82,,2.84,1.83,4.66,109.00,100.52,8.48
100,Fresno State,MWC,,20,13,73.5,70.2,3.36,,2.31,,1.53,2.84,4.37,104.30,96.69,7.62
*/