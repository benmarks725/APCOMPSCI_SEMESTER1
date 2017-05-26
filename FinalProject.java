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
        double gonzagaoppfga = 875;
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
        System.out.println("Ben Marks Power Ratings");
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

        double totalrankings = gonzagafinalranking + northcarolinafinalranking + westvirginiafinalranking + kentuckyfinalranking + villanovafinalranking + kansasfinalranking + louisvillefinalranking + floridafinalranking + dukefinalranking + wichitastfinalranking + oregonfinalranking + uclafinalranking + virginiafinalranking + iowastfinalranking + purduefinalranking;
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