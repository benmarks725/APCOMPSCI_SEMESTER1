public class FinalProjectTwo
{
    public static void main (String[]args)
    {
        System.out.println("NCAA 2016-2017 BMI(Ben Marks Index)\n");

        double miamiwins = 21;
        double miamigamesplayed = 33;
        double miamiwinpercentage = 0;
        double miamipointsscored = 2278;
        double miamippg = 0;
        double miamipointsallowed = 2116;
        double miamipapg = 0;
        double miamifgm = 813;
        double miamifga = 1800;
        double miamifgptg = 0;
        double miami2ptfgm = 604;
        double miami2ptfga = 1213;
        double miami2ptfgptg = 0;
        double miami3ptfgm = 209;
        double miami3ptfga = 587;
        double miami3ptfgptg = 0;
        double miamiassists = 389;
        double miamiassistspergame = 0;
        double miamiassistsperfgm = 0;
        double miamiassiststoturnoverratio = 0;
        double miamiturnovers = 417;
        double miamiturnoverspergame = 0;
        double miamiblocks = 125;
        double miamiblockspergame = 0;
        double miamisteals = 213;
        double miamistealspergame = 0;
        double miamifta = 617;
        double miamiftm = 443;
        double miamiturnoverpercentage = 0;
        double miamiftpercentage = 0;
        double miamirebounds = 1176;
        double miamioffrebounds = 359;
        double miamidefrebounds = 817;
        double miamireboundspergame = 0;
        double miamioffreboundspergame = 0;
        double miamidefreboundspergame = 0;
        double miamipossessions = 0;
        double miamioppfga = 1817;
        double miamioppfta = 522;
        double miamiopporb = 318;
        double miamitoforced = 392;
        double miamidefrating = 0;
        double miamieffectivefgpercentage = 0;
        double miamiteamgamescore = 0;
        double miamifouls = 513;
        double miaminetrating = 0;
        double miamioffensiverating = 0;
        double miamipace = 0;
        double miamiminutesplayed = 6625;
        double miamitrueshootingpercentage = 0;
        miamiwinpercentage = (miamiwins/miamigamesplayed)*100;
        miamippg = (miamipointsscored/miamigamesplayed);
        miamipapg = (miamipointsallowed/miamigamesplayed);
        miamifgptg = (miamifgm/miamifga)*100;
        miami2ptfgptg = (miami2ptfgm/miami2ptfga)*100;
        miami3ptfgptg = (miami3ptfgm/miami3ptfga)*100;
        miamiassistspergame = (miamiassists/miamigamesplayed);
        miamiassistsperfgm = (miamiassists/miamifgm);
        miamiassiststoturnoverratio = (miamiassists/miamiturnovers);
        miamiblockspergame = (miamiblocks/miamigamesplayed);
        miamistealspergame = (miamisteals/miamigamesplayed);
        miamiturnoverspergame = (miamiturnovers/miamigamesplayed);
        miamiturnoverpercentage = (100*miamiturnovers)/(miamifga+(0.475*miamifta)+miamiturnovers);
        miamiftpercentage = (miamiftm/miamifta)*100;
        miamireboundspergame = (miamirebounds/miamigamesplayed);
        miamioffreboundspergame = (miamioffrebounds/miamigamesplayed);
        miamidefreboundspergame = (miamidefrebounds/miamigamesplayed);
        miamipossessions = (0.5 * (miamifga + (0.475 * miamifta) - miamioffrebounds + miamiturnovers) + 0.5 * (miamioppfga + (0.475 * miamioppfta) - miamiopporb + miamitoforced));
        miamidefrating = 100*(miamipointsallowed/miamipossessions);
        miamieffectivefgpercentage = ((miamifgm+(0.5*miami3ptfgm))/miamifga)*100;
        miamiteamgamescore = ((miamipointsscored + (0.4 * miamifgm) - (0.7 * miamifga) - (0.4*(miamifta - miamiftm)) + (0.7 * miamioffrebounds) + (0.3 * miamidefrebounds) + miamisteals + (0.7 * miamiassists) + (0.7 * miamiblocks) - (0.4 * miamifouls) - miamiturnovers)/8)/miamigamesplayed;
        miaminetrating = 100 * ((miamipointsscored - miamipointsallowed) / miamipossessions);
        miamioffensiverating = 100 * (miamipointsscored / miamipossessions);
        miamipace = 40 * (miamipossessions / (0.2 * miamiminutesplayed));
        miamitrueshootingpercentage = (miamipointsscored / (2 * (miamifga + 0.475 * miamifta)))*100;
        System.out.println("\nMiami:\n" + miamiwinpercentage + "% Win Percentage\n" + miamippg +
                " Points Per Game\n"+miamipapg+ " Points Allowed Per Game\n"+miamifgptg+
                "% Field Goal Percentage\n"+miami2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +miami3ptfgptg+"% 3 Point Field Goal Percentage\n"+miamiassistspergame+" Assists Per Game\n"+
                miamiassistsperfgm+" Assists Per FGM\n"+ miamiassiststoturnoverratio+" Assists : TO Ratio\n"+
                miamiblockspergame+" Blocks Per Game\n"+miamistealspergame+" Steals Per Game\n"+
                miamiturnoverspergame+" TO Per Game\n"+miamiturnoverpercentage+" TO%\n"+ miamiftpercentage+" FT%\n"+
                miamireboundspergame+" Rebounds Per Game\n"+miamioffreboundspergame+" Offensive Rebounds Per game\n"+
                miamidefreboundspergame+" Defensive Rebounds Per Game\n"+miamipossessions+" Possessions\n"+
                miamidefrating+" Defensive Rating\n"+miamieffectivefgpercentage+" EFG%\n"+miamiteamgamescore+" Team Game Score\n"
                +miaminetrating+" Net Rating\n"+miamioffensiverating+" Offensive Rating\n"+miamipace+" Pace\n"+miamitrueshootingpercentage+" True Shooting Percentage");

        double wakeforestwins = 19;
        double wakeforestgamesplayed = 33;
        double wakeforestwinpercentage = 0;
        double wakeforestpointsscored = 2733;
        double wakeforestppg = 0;
        double wakeforestpointsallowed = 2588;
        double wakeforestpapg = 0;
        double wakeforestfgm = 923;
        double wakeforestfga = 1955;
        double wakeforestfgptg = 0;
        double wakeforest2ptfgm = 655;
        double wakeforest2ptfga = 1258;
        double wakeforest2ptfgptg = 0;
        double wakeforest3ptfgm = 268;
        double wakeforest3ptfga = 697;
        double wakeforest3ptfgptg = 0;
        double wakeforestassists = 512;
        double wakeforestassistspergame = 0;
        double wakeforestassistsperfgm = 0;
        double wakeforestassiststoturnoverratio = 0;
        double wakeforestturnovers = 388;
        double wakeforestturnoverspergame = 0;
        double wakeforestblocks = 121;
        double wakeforestblockspergame = 0;
        double wakeforeststeals = 183;
        double wakeforeststealspergame = 0;
        double wakeforestfta = 795;
        double wakeforestftm = 619;
        double wakeforestturnoverpercentage = 0;
        double wakeforestftpercentage = 0;
        double wakeforestrebounds = 1199;
        double wakeforestoffrebounds = 348;
        double wakeforestdefrebounds = 851;
        double wakeforestreboundspergame = 0;
        double wakeforestoffreboundspergame = 0;
        double wakeforestdefreboundspergame = 0;
        double wakeforestpossessions = 0;
        double wakeforestoppfga = 1948;
        double wakeforestoppfta = 740;
        double wakeforestopporb = 323;
        double wakeforesttoforced = 385;
        double wakeforestdefrating = 0;
        double wakeforesteffectivefgpercentage = 0;
        double wakeforestteamgamescore = 0;
        double wakeforestfouls = 668;
        double wakeforestnetrating = 0;
        double wakeforestoffensiverating = 0;
        double wakeforestpace = 0;
        double wakeforestminutesplayed = 6600;
        double wakeforesttrueshootingpercentage = 0;
        wakeforestwinpercentage = (wakeforestwins/wakeforestgamesplayed)*100;
        wakeforestppg = (wakeforestpointsscored/wakeforestgamesplayed);
        wakeforestpapg = (wakeforestpointsallowed/wakeforestgamesplayed);
        wakeforestfgptg = (wakeforestfgm/wakeforestfga)*100;
        wakeforest2ptfgptg = (wakeforest2ptfgm/wakeforest2ptfga)*100;
        wakeforest3ptfgptg = (wakeforest3ptfgm/wakeforest3ptfga)*100;
        wakeforestassistspergame = (wakeforestassists/wakeforestgamesplayed);
        wakeforestassistsperfgm = (wakeforestassists/wakeforestfgm);
        wakeforestassiststoturnoverratio = (wakeforestassists/wakeforestturnovers);
        wakeforestblockspergame = (wakeforestblocks/wakeforestgamesplayed);
        wakeforeststealspergame = (wakeforeststeals/wakeforestgamesplayed);
        wakeforestturnoverspergame = (wakeforestturnovers/wakeforestgamesplayed);
        wakeforestturnoverpercentage = (100*wakeforestturnovers)/(wakeforestfga+(0.475*wakeforestfta)+wakeforestturnovers);
        wakeforestftpercentage = (wakeforestftm/wakeforestfta)*100;
        wakeforestreboundspergame = (wakeforestrebounds/wakeforestgamesplayed);
        wakeforestoffreboundspergame = (wakeforestoffrebounds/wakeforestgamesplayed);
        wakeforestdefreboundspergame = (wakeforestdefrebounds/wakeforestgamesplayed);
        wakeforestpossessions = (0.5 * (wakeforestfga + (0.475 * wakeforestfta) - wakeforestoffrebounds + wakeforestturnovers) + 0.5 * (wakeforestoppfga + (0.475 * wakeforestoppfta) - wakeforestopporb + wakeforesttoforced));
        wakeforestdefrating = 100*(wakeforestpointsallowed/wakeforestpossessions);
        wakeforesteffectivefgpercentage = ((wakeforestfgm+(0.5*wakeforest3ptfgm))/wakeforestfga)*100;
        wakeforestteamgamescore = ((wakeforestpointsscored + (0.4 * wakeforestfgm) - (0.7 * wakeforestfga) - (0.4*(wakeforestfta - wakeforestftm)) + (0.7 * wakeforestoffrebounds) + (0.3 * wakeforestdefrebounds) + wakeforeststeals + (0.7 * wakeforestassists) + (0.7 * wakeforestblocks) - (0.4 * wakeforestfouls) - wakeforestturnovers)/8)/wakeforestgamesplayed;
        wakeforestnetrating = 100 * ((wakeforestpointsscored - wakeforestpointsallowed) / wakeforestpossessions);
        wakeforestoffensiverating = 100 * (wakeforestpointsscored / wakeforestpossessions);
        wakeforestpace = 40 * (wakeforestpossessions / (0.2 * wakeforestminutesplayed));
        wakeforesttrueshootingpercentage = (wakeforestpointsscored / (2 * (wakeforestfga + 0.475 * wakeforestfta)))*100;
        System.out.println("\nWake Forest:\n" + wakeforestwinpercentage + "% Win Percentage\n" + wakeforestppg +
                " Points Per Game\n"+wakeforestpapg+ " Points Allowed Per Game\n"+wakeforestfgptg+
                "% Field Goal Percentage\n"+wakeforest2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +wakeforest3ptfgptg+"% 3 Point Field Goal Percentage\n"+wakeforestassistspergame+" Assists Per Game\n"+
                wakeforestassistsperfgm+" Assists Per FGM\n"+ wakeforestassiststoturnoverratio+" Assists : TO Ratio\n"+
                wakeforestblockspergame+" Blocks Per Game\n"+wakeforeststealspergame+" Steals Per Game\n"+
                wakeforestturnoverspergame+" TO Per Game\n"+wakeforestturnoverpercentage+" TO%\n"+ wakeforestftpercentage+" FT%\n"+
                wakeforestreboundspergame+" Rebounds Per Game\n"+wakeforestoffreboundspergame+" Offensive Rebounds Per game\n"+
                wakeforestdefreboundspergame+" Defensive Rebounds Per Game\n"+wakeforestpossessions+" Possessions\n"+
                wakeforestdefrating+" Defensive Rating\n"+wakeforesteffectivefgpercentage+" EFG%\n"+wakeforestteamgamescore+" Team Game Score\n"
                +wakeforestnetrating+" Net Rating\n"+wakeforestoffensiverating+" Offensive Rating\n"+wakeforestpace+" Pace\n"+wakeforesttrueshootingpercentage+" True Shooting Percentage");

        double texastechwins = 18;
        double texastechgamesplayed = 32;
        double texastechwinpercentage = 0;
        double texastechpointsscored = 2346;
        double texastechppg = 0;
        double texastechpointsallowed = 2146;
        double texastechpapg = 0;
        double texastechfgm = 835;
        double texastechfga = 1776;
        double texastechfgptg = 0;
        double texastech2ptfgm = 623;
        double texastech2ptfga = 1199;
        double texastech2ptfgptg = 0;
        double texastech3ptfgm = 212;
        double texastech3ptfga = 577;
        double texastech3ptfgptg = 0;
        double texastechassists = 427;
        double texastechassistspergame = 0;
        double texastechassistsperfgm = 0;
        double texastechassiststoturnoverratio = 0;
        double texastechturnovers = 354;
        double texastechturnoverspergame = 0;
        double texastechblocks = 98;
        double texastechblockspergame = 0;
        double texastechsteals = 169;
        double texastechstealspergame = 0;
        double texastechfta = 633;
        double texastechftm = 464;
        double texastechturnoverpercentage = 0;
        double texastechftpercentage = 0;
        double texastechrebounds = 1050;
        double texastechoffrebounds = 298;
        double texastechdefrebounds = 752;
        double texastechreboundspergame = 0;
        double texastechoffreboundspergame = 0;
        double texastechdefreboundspergame = 0;
        double texastechpossessions = 0;
        double texastechoppfga = 1690;
        double texastechoppfta = 602;
        double texastechopporb = 261;
        double texastechtoforced = 436;
        double texastechdefrating = 0;
        double texastecheffectivefgpercentage = 0;
        double texastechteamgamescore = 0;
        double texastechfouls = 562;
        double texastechnetrating = 0;
        double texastechoffensiverating = 0;
        double texastechpace = 0;
        double texastechminutesplayed = 6500;
        double texastechtrueshootingpercentage = 0;
        texastechwinpercentage = (texastechwins/texastechgamesplayed)*100;
        texastechppg = (texastechpointsscored/texastechgamesplayed);
        texastechpapg = (texastechpointsallowed/texastechgamesplayed);
        texastechfgptg = (texastechfgm/texastechfga)*100;
        texastech2ptfgptg = (texastech2ptfgm/texastech2ptfga)*100;
        texastech3ptfgptg = (texastech3ptfgm/texastech3ptfga)*100;
        texastechassistspergame = (texastechassists/texastechgamesplayed);
        texastechassistsperfgm = (texastechassists/texastechfgm);
        texastechassiststoturnoverratio = (texastechassists/texastechturnovers);
        texastechblockspergame = (texastechblocks/texastechgamesplayed);
        texastechstealspergame = (texastechsteals/texastechgamesplayed);
        texastechturnoverspergame = (texastechturnovers/texastechgamesplayed);
        texastechturnoverpercentage = (100*texastechturnovers)/(texastechfga+(0.475*texastechfta)+texastechturnovers);
        texastechftpercentage = (texastechftm/texastechfta)*100;
        texastechreboundspergame = (texastechrebounds/texastechgamesplayed);
        texastechoffreboundspergame = (texastechoffrebounds/texastechgamesplayed);
        texastechdefreboundspergame = (texastechdefrebounds/texastechgamesplayed);
        texastechpossessions = (0.5 * (texastechfga + (0.475 * texastechfta) - texastechoffrebounds + texastechturnovers) + 0.5 * (texastechoppfga + (0.475 * texastechoppfta) - texastechopporb + texastechtoforced));
        texastechdefrating = 100*(texastechpointsallowed/texastechpossessions);
        texastecheffectivefgpercentage = ((texastechfgm+(0.5*texastech3ptfgm))/texastechfga)*100;
        texastechteamgamescore = ((texastechpointsscored + (0.4 * texastechfgm) - (0.7 * texastechfga) - (0.4*(texastechfta - texastechftm)) + (0.7 * texastechoffrebounds) + (0.3 * texastechdefrebounds) + texastechsteals + (0.7 * texastechassists) + (0.7 * texastechblocks) - (0.4 * texastechfouls) - texastechturnovers)/8)/texastechgamesplayed;
        texastechnetrating = 100 * ((texastechpointsscored - texastechpointsallowed) / texastechpossessions);
        texastechoffensiverating = 100 * (texastechpointsscored / texastechpossessions);
        texastechpace = 40 * (texastechpossessions / (0.2 * texastechminutesplayed));
        texastechtrueshootingpercentage = (texastechpointsscored / (2 * (texastechfga + 0.475 * texastechfta)))*100;
        System.out.println("\nTexas Tech:\n" + texastechwinpercentage + "% Win Percentage\n" + texastechppg +
                " Points Per Game\n"+texastechpapg+ " Points Allowed Per Game\n"+texastechfgptg+
                "% Field Goal Percentage\n"+texastech2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +texastech3ptfgptg+"% 3 Point Field Goal Percentage\n"+texastechassistspergame+" Assists Per Game\n"+
                texastechassistsperfgm+" Assists Per FGM\n"+ texastechassiststoturnoverratio+" Assists : TO Ratio\n"+
                texastechblockspergame+" Blocks Per Game\n"+texastechstealspergame+" Steals Per Game\n"+
                texastechturnoverspergame+" TO Per Game\n"+texastechturnoverpercentage+" TO%\n"+ texastechftpercentage+" FT%\n"+
                texastechreboundspergame+" Rebounds Per Game\n"+texastechoffreboundspergame+" Offensive Rebounds Per game\n"+
                texastechdefreboundspergame+" Defensive Rebounds Per Game\n"+texastechpossessions+" Possessions\n"+
                texastechdefrating+" Defensive Rating\n"+texastecheffectivefgpercentage+" EFG%\n"+texastechteamgamescore+" Team Game Score\n"
                +texastechnetrating+" Net Rating\n"+texastechoffensiverating+" Offensive Rating\n"+texastechpace+" Pace\n"+texastechtrueshootingpercentage+" True Shooting Percentage");


        double arkansaswins = 26;
        double arkansasgamesplayed = 36;
        double arkansaswinpercentage = 0;
        double arkansaspointsscored = 2855;
        double arkansasppg = 0;
        double arkansaspointsallowed = 2659;
        double arkansaspapg = 0;
        double arkansasfgm = 997;
        double arkansasfga = 2165;
        double arkansasfgptg = 0;
        double arkansas2ptfgm = 764;
        double arkansas2ptfga = 1527;
        double arkansas2ptfgptg = 0;
        double arkansas3ptfgm = 233;
        double arkansas3ptfga = 638;
        double arkansas3ptfgptg = 0;
        double arkansasassists = 497;
        double arkansasassistspergame = 0;
        double arkansasassistsperfgm = 0;
        double arkansasassiststoturnoverratio = 0;
        double arkansasturnovers = 428;
        double arkansasturnoverspergame = 0;
        double arkansasblocks = 170;
        double arkansasblockspergame = 0;
        double arkansassteals = 278;
        double arkansasstealspergame = 0;
        double arkansasfta = 825;
        double arkansasftm = 628;
        double arkansasturnoverpercentage = 0;
        double arkansasftpercentage = 0;
        double arkansasrebounds = 1298;
        double arkansasoffrebounds = 397;
        double arkansasdefrebounds = 901;
        double arkansasreboundspergame = 0;
        double arkansasoffreboundspergame = 0;
        double arkansasdefreboundspergame = 0;
        double arkansaspossessions = 0;
        double arkansasoppfga = 2159;
        double arkansasoppfta = 843;
        double arkansasopporb = 460;
        double arkansastoforced = 477;
        double arkansasdefrating = 0;
        double arkansaseffectivefgpercentage = 0;
        double arkansasteamgamescore = 0;
        double arkansasfouls = 739;
        double arkansasnetrating = 0;
        double arkansasoffensiverating = 0;
        double arkansaspace = 0;
        double arkansasminutesplayed = 7200;
        double arkansastrueshootingpercentage = 0;
        arkansaswinpercentage = (arkansaswins/arkansasgamesplayed)*100;
        arkansasppg = (arkansaspointsscored/arkansasgamesplayed);
        arkansaspapg = (arkansaspointsallowed/arkansasgamesplayed);
        arkansasfgptg = (arkansasfgm/arkansasfga)*100;
        arkansas2ptfgptg = (arkansas2ptfgm/arkansas2ptfga)*100;
        arkansas3ptfgptg = (arkansas3ptfgm/arkansas3ptfga)*100;
        arkansasassistspergame = (arkansasassists/arkansasgamesplayed);
        arkansasassistsperfgm = (arkansasassists/arkansasfgm);
        arkansasassiststoturnoverratio = (arkansasassists/arkansasturnovers);
        arkansasblockspergame = (arkansasblocks/arkansasgamesplayed);
        arkansasstealspergame = (arkansassteals/arkansasgamesplayed);
        arkansasturnoverspergame = (arkansasturnovers/arkansasgamesplayed);
        arkansasturnoverpercentage = (100*arkansasturnovers)/(arkansasfga+(0.475*arkansasfta)+arkansasturnovers);
        arkansasftpercentage = (arkansasftm/arkansasfta)*100;
        arkansasreboundspergame = (arkansasrebounds/arkansasgamesplayed);
        arkansasoffreboundspergame = (arkansasoffrebounds/arkansasgamesplayed);
        arkansasdefreboundspergame = (arkansasdefrebounds/arkansasgamesplayed);
        arkansaspossessions = (0.5 * (arkansasfga + (0.475 * arkansasfta) - arkansasoffrebounds + arkansasturnovers) + 0.5 * (arkansasoppfga + (0.475 * arkansasoppfta) - arkansasopporb + arkansastoforced));
        arkansasdefrating = 100*(arkansaspointsallowed/arkansaspossessions);
        arkansaseffectivefgpercentage = ((arkansasfgm+(0.5*arkansas3ptfgm))/arkansasfga)*100;
        arkansasteamgamescore = ((arkansaspointsscored + (0.4 * arkansasfgm) - (0.7 * arkansasfga) - (0.4*(arkansasfta - arkansasftm)) + (0.7 * arkansasoffrebounds) + (0.3 * arkansasdefrebounds) + arkansassteals + (0.7 * arkansasassists) + (0.7 * arkansasblocks) - (0.4 * arkansasfouls) - arkansasturnovers)/8)/arkansasgamesplayed;
        arkansasnetrating = 100 * ((arkansaspointsscored - arkansaspointsallowed) / arkansaspossessions);
        arkansasoffensiverating = 100 * (arkansaspointsscored / arkansaspossessions);
        arkansaspace = 40 * (arkansaspossessions / (0.2 * arkansasminutesplayed));
        arkansastrueshootingpercentage = (arkansaspointsscored / (2 * (arkansasfga + 0.475 * arkansasfta)))*100;
        System.out.println("\nArkansas:\n" + arkansaswinpercentage + "% Win Percentage\n" + arkansasppg +
                " Points Per Game\n"+arkansaspapg+ " Points Allowed Per Game\n"+arkansasfgptg+
                "% Field Goal Percentage\n"+arkansas2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +arkansas3ptfgptg+"% 3 Point Field Goal Percentage\n"+arkansasassistspergame+" Assists Per Game\n"+
                arkansasassistsperfgm+" Assists Per FGM\n"+ arkansasassiststoturnoverratio+" Assists : TO Ratio\n"+
                arkansasblockspergame+" Blocks Per Game\n"+arkansasstealspergame+" Steals Per Game\n"+
                arkansasturnoverspergame+" TO Per Game\n"+arkansasturnoverpercentage+" TO%\n"+ arkansasftpercentage+" FT%\n"+
                arkansasreboundspergame+" Rebounds Per Game\n"+arkansasoffreboundspergame+" Offensive Rebounds Per game\n"+
                arkansasdefreboundspergame+" Defensive Rebounds Per Game\n"+arkansaspossessions+" Possessions\n"+
                arkansasdefrating+" Defensive Rating\n"+arkansaseffectivefgpercentage+" EFG%\n"+arkansasteamgamescore+" Team Game Score\n"
                +arkansasnetrating+" Net Rating\n"+arkansasoffensiverating+" Offensive Rating\n"+arkansaspace+" Pace\n"+arkansastrueshootingpercentage+" True Shooting Percentage");

        double northwesternwins = 24;
        double northwesterngamesplayed = 36;
        double northwesternwinpercentage = 0;
        double northwesternpointsscored = 2558;
        double northwesternppg = 0;
        double northwesternpointsallowed = 2357;
        double northwesternpapg = 0;
        double northwesternfgm = 913;
        double northwesternfga = 2094;
        double northwesternfgptg = 0;
        double northwestern2ptfgm = 657;
        double northwestern2ptfga = 1347;
        double northwestern2ptfgptg = 0;
        double northwestern3ptfgm = 256;
        double northwestern3ptfga = 747;
        double northwestern3ptfgptg = 0;
        double northwesternassists = 540;
        double northwesternassistspergame = 0;
        double northwesternassistsperfgm = 0;
        double northwesternassiststoturnoverratio = 0;
        double northwesternturnovers = 384;
        double northwesternturnoverspergame = 0;
        double northwesternblocks = 175;
        double northwesternblockspergame = 0;
        double northwesternsteals = 190;
        double northwesternstealspergame = 0;
        double northwesternfta = 637;
        double northwesternftm = 476;
        double northwesternturnoverpercentage = 0;
        double northwesternftpercentage = 0;
        double northwesternrebounds = 1304;
        double northwesternoffrebounds = 383;
        double northwesterndefrebounds = 921;
        double northwesternreboundspergame = 0;
        double northwesternoffreboundspergame = 0;
        double northwesterndefreboundspergame = 0;
        double northwesternpossessions = 0;
        double northwesternoppfga = 2025;
        double northwesternoppfta = 732;
        double northwesternopporb = 404;
        double northwesterntoforced = 430;
        double northwesterndefrating = 0;
        double northwesterneffectivefgpercentage = 0;
        double northwesternteamgamescore = 0;
        double northwesternfouls = 691;
        double northwesternnetrating = 0;
        double northwesternoffensiverating = 0;
        double northwesternpace = 0;
        double northwesternminutesplayed = 7200;
        double northwesterntrueshootingpercentage = 0;
        northwesternwinpercentage = (northwesternwins/northwesterngamesplayed)*100;
        northwesternppg = (northwesternpointsscored/northwesterngamesplayed);
        northwesternpapg = (northwesternpointsallowed/northwesterngamesplayed);
        northwesternfgptg = (northwesternfgm/northwesternfga)*100;
        northwestern2ptfgptg = (northwestern2ptfgm/northwestern2ptfga)*100;
        northwestern3ptfgptg = (northwestern3ptfgm/northwestern3ptfga)*100;
        northwesternassistspergame = (northwesternassists/northwesterngamesplayed);
        northwesternassistsperfgm = (northwesternassists/northwesternfgm);
        northwesternassiststoturnoverratio = (northwesternassists/northwesternturnovers);
        northwesternblockspergame = (northwesternblocks/northwesterngamesplayed);
        northwesternstealspergame = (northwesternsteals/northwesterngamesplayed);
        northwesternturnoverspergame = (northwesternturnovers/northwesterngamesplayed);
        northwesternturnoverpercentage = (100*northwesternturnovers)/(northwesternfga+(0.475*northwesternfta)+northwesternturnovers);
        northwesternftpercentage = (northwesternftm/northwesternfta)*100;
        northwesternreboundspergame = (northwesternrebounds/northwesterngamesplayed);
        northwesternoffreboundspergame = (northwesternoffrebounds/northwesterngamesplayed);
        northwesterndefreboundspergame = (northwesterndefrebounds/northwesterngamesplayed);
        northwesternpossessions = (0.5 * (northwesternfga + (0.475 * northwesternfta) - northwesternoffrebounds + northwesternturnovers) + 0.5 * (northwesternoppfga + (0.475 * northwesternoppfta) - northwesternopporb + northwesterntoforced));
        northwesterndefrating = 100*(northwesternpointsallowed/northwesternpossessions);
        northwesterneffectivefgpercentage = ((northwesternfgm+(0.5*northwestern3ptfgm))/northwesternfga)*100;
        northwesternteamgamescore = ((northwesternpointsscored + (0.4 * northwesternfgm) - (0.7 * northwesternfga) - (0.4*(northwesternfta - northwesternftm)) + (0.7 * northwesternoffrebounds) + (0.3 * northwesterndefrebounds) + northwesternsteals + (0.7 * northwesternassists) + (0.7 * northwesternblocks) - (0.4 * northwesternfouls) - northwesternturnovers)/8)/northwesterngamesplayed;
        northwesternnetrating = 100 * ((northwesternpointsscored - northwesternpointsallowed) / northwesternpossessions);
        northwesternoffensiverating = 100 * (northwesternpointsscored / northwesternpossessions);
        northwesternpace = 40 * (northwesternpossessions / (0.2 * northwesternminutesplayed));
        northwesterntrueshootingpercentage = (northwesternpointsscored / (2 * (northwesternfga + 0.475 * northwesternfta)))*100;
        System.out.println("\nNorthwestern:\n" + northwesternwinpercentage + "% Win Percentage\n" + northwesternppg +
                " Points Per Game\n"+northwesternpapg+ " Points Allowed Per Game\n"+northwesternfgptg+
                "% Field Goal Percentage\n"+northwestern2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +northwestern3ptfgptg+"% 3 Point Field Goal Percentage\n"+northwesternassistspergame+" Assists Per Game\n"+
                northwesternassistsperfgm+" Assists Per FGM\n"+ northwesternassiststoturnoverratio+" Assists : TO Ratio\n"+
                northwesternblockspergame+" Blocks Per Game\n"+northwesternstealspergame+" Steals Per Game\n"+
                northwesternturnoverspergame+" TO Per Game\n"+northwesternturnoverpercentage+" TO%\n"+ northwesternftpercentage+" FT%\n"+
                northwesternreboundspergame+" Rebounds Per Game\n"+northwesternoffreboundspergame+" Offensive Rebounds Per game\n"+
                northwesterndefreboundspergame+" Defensive Rebounds Per Game\n"+northwesternpossessions+" Possessions\n"+
                northwesterndefrating+" Defensive Rating\n"+northwesterneffectivefgpercentage+" EFG%\n"+northwesternteamgamescore+" Team Game Score\n"
                +northwesternnetrating+" Net Rating\n"+northwesternoffensiverating+" Offensive Rating\n"+northwesternpace+" Pace\n"+northwesterntrueshootingpercentage+" True Shooting Percentage");

        double syracusewins = 19;
        double syracusegamesplayed = 34;
        double syracusewinpercentage = 0;
        double syracusepointsscored = 2594;
        double syracuseppg = 0;
        double syracusepointsallowed = 2416;
        double syracusepapg = 0;
        double syracusefgm = 894;
        double syracusefga = 1950;
        double syracusefgptg = 0;
        double syracuse2ptfgm = 594;
        double syracuse2ptfga = 1159;
        double syracuse2ptfgptg = 0;
        double syracuse3ptfgm = 300;
        double syracuse3ptfga = 791;
        double syracuse3ptfgptg = 0;
        double syracuseassists = 532;
        double syracuseassistspergame = 0;
        double syracuseassistsperfgm = 0;
        double syracuseassiststoturnoverratio = 0;
        double syracuseturnovers = 420;
        double syracuseturnoverspergame = 0;
        double syracuseblocks = 159;
        double syracuseblockspergame = 0;
        double syracusesteals = 275;
        double syracusestealspergame = 0;
        double syracusefta = 685;
        double syracuseftm = 506;
        double syracuseturnoverpercentage = 0;
        double syracuseftpercentage = 0;
        double syracuserebounds = 1183;
        double syracuseoffrebounds = 363;
        double syracusedefrebounds = 820;
        double syracusereboundspergame = 0;
        double syracuseoffreboundspergame = 0;
        double syracusedefreboundspergame = 0;
        double syracusepossessions = 0;
        double syracuseoppfga = 2014;
        double syracuseoppfta = 586;
        double syracuseopporb = 431;
        double syracusetoforced = 456;
        double syracusedefrating = 0;
        double syracuseeffectivefgpercentage = 0;
        double syracuseteamgamescore = 0;
        double syracusefouls = 542;
        double syracusenetrating = 0;
        double syracuseoffensiverating = 0;
        double syracusepace = 0;
        double syracuseminutesplayed = 6850;
        double syracusetrueshootingpercentage = 0;
        syracusewinpercentage = (syracusewins/syracusegamesplayed)*100;
        syracuseppg = (syracusepointsscored/syracusegamesplayed);
        syracusepapg = (syracusepointsallowed/syracusegamesplayed);
        syracusefgptg = (syracusefgm/syracusefga)*100;
        syracuse2ptfgptg = (syracuse2ptfgm/syracuse2ptfga)*100;
        syracuse3ptfgptg = (syracuse3ptfgm/syracuse3ptfga)*100;
        syracuseassistspergame = (syracuseassists/syracusegamesplayed);
        syracuseassistsperfgm = (syracuseassists/syracusefgm);
        syracuseassiststoturnoverratio = (syracuseassists/syracuseturnovers);
        syracuseblockspergame = (syracuseblocks/syracusegamesplayed);
        syracusestealspergame = (syracusesteals/syracusegamesplayed);
        syracuseturnoverspergame = (syracuseturnovers/syracusegamesplayed);
        syracuseturnoverpercentage = (100*syracuseturnovers)/(syracusefga+(0.475*syracusefta)+syracuseturnovers);
        syracuseftpercentage = (syracuseftm/syracusefta)*100;
        syracusereboundspergame = (syracuserebounds/syracusegamesplayed);
        syracuseoffreboundspergame = (syracuseoffrebounds/syracusegamesplayed);
        syracusedefreboundspergame = (syracusedefrebounds/syracusegamesplayed);
        syracusepossessions = (0.5 * (syracusefga + (0.475 * syracusefta) - syracuseoffrebounds + syracuseturnovers) + 0.5 * (syracuseoppfga + (0.475 * syracuseoppfta) - syracuseopporb + syracusetoforced));
        syracusedefrating = 100*(syracusepointsallowed/syracusepossessions);
        syracuseeffectivefgpercentage = ((syracusefgm+(0.5*syracuse3ptfgm))/syracusefga)*100;
        syracuseteamgamescore = ((syracusepointsscored + (0.4 * syracusefgm) - (0.7 * syracusefga) - (0.4*(syracusefta - syracuseftm)) + (0.7 * syracuseoffrebounds) + (0.3 * syracusedefrebounds) + syracusesteals + (0.7 * syracuseassists) + (0.7 * syracuseblocks) - (0.4 * syracusefouls) - syracuseturnovers)/8)/syracusegamesplayed;
        syracusenetrating = 100 * ((syracusepointsscored - syracusepointsallowed) / syracusepossessions);
        syracuseoffensiverating = 100 * (syracusepointsscored / syracusepossessions);
        syracusepace = 40 * (syracusepossessions / (0.2 * syracuseminutesplayed));
        syracusetrueshootingpercentage = (syracusepointsscored / (2 * (syracusefga + 0.475 * syracusefta)))*100;
        System.out.println("\nSyracuse:\n" + syracusewinpercentage + "% Win Percentage\n" + syracuseppg +
                " Points Per Game\n"+syracusepapg+ " Points Allowed Per Game\n"+syracusefgptg+
                "% Field Goal Percentage\n"+syracuse2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +syracuse3ptfgptg+"% 3 Point Field Goal Percentage\n"+syracuseassistspergame+" Assists Per Game\n"+
                syracuseassistsperfgm+" Assists Per FGM\n"+ syracuseassiststoturnoverratio+" Assists : TO Ratio\n"+
                syracuseblockspergame+" Blocks Per Game\n"+syracusestealspergame+" Steals Per Game\n"+
                syracuseturnoverspergame+" TO Per Game\n"+syracuseturnoverpercentage+" TO%\n"+ syracuseftpercentage+" FT%\n"+
                syracusereboundspergame+" Rebounds Per Game\n"+syracuseoffreboundspergame+" Offensive Rebounds Per game\n"+
                syracusedefreboundspergame+" Defensive Rebounds Per Game\n"+syracusepossessions+" Possessions\n"+
                syracusedefrating+" Defensive Rating\n"+syracuseeffectivefgpercentage+" EFG%\n"+syracuseteamgamescore+" Team Game Score\n"
                +syracusenetrating+" Net Rating\n"+syracuseoffensiverating+" Offensive Rating\n"+syracusepace+" Pace\n"+syracusetrueshootingpercentage+" True Shooting Percentage");

        double vanderbiltwins = 19;
        double vanderbiltgamesplayed = 35;
        double vanderbiltwinpercentage = 0;
        double vanderbiltpointsscored = 2489;
        double vanderbiltppg = 0;
        double vanderbiltpointsallowed = 2385;
        double vanderbiltpapg = 0;
        double vanderbiltfgm = 815;
        double vanderbiltfga = 1896;
        double vanderbiltfgptg = 0;
        double vanderbilt2ptfgm = 469;
        double vanderbilt2ptfga = 975;
        double vanderbilt2ptfgptg = 0;
        double vanderbilt3ptfgm = 346;
        double vanderbilt3ptfga = 921;
        double vanderbilt3ptfgptg = 0;
        double vanderbiltassists = 450;
        double vanderbiltassistspergame = 0;
        double vanderbiltassistsperfgm = 0;
        double vanderbiltassiststoturnoverratio = 0;
        double vanderbiltturnovers = 430;
        double vanderbiltturnoverspergame = 0;
        double vanderbiltblocks = 133;
        double vanderbiltblockspergame = 0;
        double vanderbiltsteals = 147;
        double vanderbiltstealspergame = 0;
        double vanderbiltfta = 660;
        double vanderbiltftm = 513;
        double vanderbiltturnoverpercentage = 0;
        double vanderbiltftpercentage = 0;
        double vanderbiltrebounds = 1208;
        double vanderbiltoffrebounds = 286;
        double vanderbiltdefrebounds = 922;
        double vanderbiltreboundspergame = 0;
        double vanderbiltoffreboundspergame = 0;
        double vanderbiltdefreboundspergame = 0;
        double vanderbiltpossessions = 0;
        double vanderbiltoppfga = 2028;
        double vanderbiltoppfta = 622;
        double vanderbiltopporb = 339;
        double vanderbilttoforced = 379;
        double vanderbiltdefrating = 0;
        double vanderbilteffectivefgpercentage = 0;
        double vanderbiltteamgamescore = 0;
        double vanderbiltfouls = 581;
        double vanderbiltnetrating = 0;
        double vanderbiltoffensiverating = 0;
        double vanderbiltpace = 0;
        double vanderbiltminutesplayed = 7025;
        double vanderbilttrueshootingpercentage = 0;
        vanderbiltwinpercentage = (vanderbiltwins/vanderbiltgamesplayed)*100;
        vanderbiltppg = (vanderbiltpointsscored/vanderbiltgamesplayed);
        vanderbiltpapg = (vanderbiltpointsallowed/vanderbiltgamesplayed);
        vanderbiltfgptg = (vanderbiltfgm/vanderbiltfga)*100;
        vanderbilt2ptfgptg = (vanderbilt2ptfgm/vanderbilt2ptfga)*100;
        vanderbilt3ptfgptg = (vanderbilt3ptfgm/vanderbilt3ptfga)*100;
        vanderbiltassistspergame = (vanderbiltassists/vanderbiltgamesplayed);
        vanderbiltassistsperfgm = (vanderbiltassists/vanderbiltfgm);
        vanderbiltassiststoturnoverratio = (vanderbiltassists/vanderbiltturnovers);
        vanderbiltblockspergame = (vanderbiltblocks/vanderbiltgamesplayed);
        vanderbiltstealspergame = (vanderbiltsteals/vanderbiltgamesplayed);
        vanderbiltturnoverspergame = (vanderbiltturnovers/vanderbiltgamesplayed);
        vanderbiltturnoverpercentage = (100*vanderbiltturnovers)/(vanderbiltfga+(0.475*vanderbiltfta)+vanderbiltturnovers);
        vanderbiltftpercentage = (vanderbiltftm/vanderbiltfta)*100;
        vanderbiltreboundspergame = (vanderbiltrebounds/vanderbiltgamesplayed);
        vanderbiltoffreboundspergame = (vanderbiltoffrebounds/vanderbiltgamesplayed);
        vanderbiltdefreboundspergame = (vanderbiltdefrebounds/vanderbiltgamesplayed);
        vanderbiltpossessions = (0.5 * (vanderbiltfga + (0.475 * vanderbiltfta) - vanderbiltoffrebounds + vanderbiltturnovers) + 0.5 * (vanderbiltoppfga + (0.475 * vanderbiltoppfta) - vanderbiltopporb + vanderbilttoforced));
        vanderbiltdefrating = 100*(vanderbiltpointsallowed/vanderbiltpossessions);
        vanderbilteffectivefgpercentage = ((vanderbiltfgm+(0.5*vanderbilt3ptfgm))/vanderbiltfga)*100;
        vanderbiltteamgamescore = ((vanderbiltpointsscored + (0.4 * vanderbiltfgm) - (0.7 * vanderbiltfga) - (0.4*(vanderbiltfta - vanderbiltftm)) + (0.7 * vanderbiltoffrebounds) + (0.3 * vanderbiltdefrebounds) + vanderbiltsteals + (0.7 * vanderbiltassists) + (0.7 * vanderbiltblocks) - (0.4 * vanderbiltfouls) - vanderbiltturnovers)/8)/vanderbiltgamesplayed;
        vanderbiltnetrating = 100 * ((vanderbiltpointsscored - vanderbiltpointsallowed) / vanderbiltpossessions);
        vanderbiltoffensiverating = 100 * (vanderbiltpointsscored / vanderbiltpossessions);
        vanderbiltpace = 40 * (vanderbiltpossessions / (0.2 * vanderbiltminutesplayed));
        vanderbilttrueshootingpercentage = (vanderbiltpointsscored / (2 * (vanderbiltfga + 0.475 * vanderbiltfta)))*100;
        System.out.println("\nVanderbilt:\n" + vanderbiltwinpercentage + "% Win Percentage\n" + vanderbiltppg +
                " Points Per Game\n"+vanderbiltpapg+ " Points Allowed Per Game\n"+vanderbiltfgptg+
                "% Field Goal Percentage\n"+vanderbilt2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +vanderbilt3ptfgptg+"% 3 Point Field Goal Percentage\n"+vanderbiltassistspergame+" Assists Per Game\n"+
                vanderbiltassistsperfgm+" Assists Per FGM\n"+ vanderbiltassiststoturnoverratio+" Assists : TO Ratio\n"+
                vanderbiltblockspergame+" Blocks Per Game\n"+vanderbiltstealspergame+" Steals Per Game\n"+
                vanderbiltturnoverspergame+" TO Per Game\n"+vanderbiltturnoverpercentage+" TO%\n"+ vanderbiltftpercentage+" FT%\n"+
                vanderbiltreboundspergame+" Rebounds Per Game\n"+vanderbiltoffreboundspergame+" Offensive Rebounds Per game\n"+
                vanderbiltdefreboundspergame+" Defensive Rebounds Per Game\n"+vanderbiltpossessions+" Possessions\n"+
                vanderbiltdefrating+" Defensive Rating\n"+vanderbilteffectivefgpercentage+" EFG%\n"+vanderbiltteamgamescore+" Team Game Score\n"
                +vanderbiltnetrating+" Net Rating\n"+vanderbiltoffensiverating+" Offensive Rating\n"+vanderbiltpace+" Pace\n"+vanderbilttrueshootingpercentage+" True Shooting Percentage");

        double michiganstatewins = 20;
        double michiganstategamesplayed = 35;
        double michiganstatewinpercentage = 0;
        double michiganstatepointsscored = 2515;
        double michiganstateppg = 0;
        double michiganstatepointsallowed = 2404;
        double michiganstatepapg = 0;
        double michiganstatefgm = 905;
        double michiganstatefga = 1927;
        double michiganstatefgptg = 0;
        double michiganstate2ptfgm = 632;
        double michiganstate2ptfga = 1195;
        double michiganstate2ptfgptg = 0;
        double michiganstate3ptfgm = 273;
        double michiganstate3ptfga = 732;
        double michiganstate3ptfgptg = 0;
        double michiganstateassists = 591;
        double michiganstateassistspergame = 0;
        double michiganstateassistsperfgm = 0;
        double michiganstateassiststoturnoverratio = 0;
        double michiganstateturnovers = 489;
        double michiganstateturnoverspergame = 0;
        double michiganstateblocks = 162;
        double michiganstateblockspergame = 0;
        double michiganstatesteals = 151;
        double michiganstatestealspergame = 0;
        double michiganstatefta = 646;
        double michiganstateftm = 432;
        double michiganstateturnoverpercentage = 0;
        double michiganstateftpercentage = 0;
        double michiganstaterebounds = 1275;
        double michiganstateoffrebounds = 326;
        double michiganstatedefrebounds = 949;
        double michiganstatereboundspergame = 0;
        double michiganstateoffreboundspergame = 0;
        double michiganstatedefreboundspergame = 0;
        double michiganstatepossessions = 0;
        double michiganstateoppfga = 2027;
        double michiganstateoppfta = 704;
        double michiganstateopporb = 349;
        double michiganstatetoforced = 380;
        double michiganstatedefrating = 0;
        double michiganstateeffectivefgpercentage = 0;
        double michiganstateteamgamescore = 0;
        double michiganstatefouls = 699;
        double michiganstatenetrating = 0;
        double michiganstateoffensiverating = 0;
        double michiganstatepace = 0;
        double michiganstateminutesplayed = 7025;
        double michiganstatetrueshootingpercentage = 0;
        michiganstatewinpercentage = (michiganstatewins/michiganstategamesplayed)*100;
        michiganstateppg = (michiganstatepointsscored/michiganstategamesplayed);
        michiganstatepapg = (michiganstatepointsallowed/michiganstategamesplayed);
        michiganstatefgptg = (michiganstatefgm/michiganstatefga)*100;
        michiganstate2ptfgptg = (michiganstate2ptfgm/michiganstate2ptfga)*100;
        michiganstate3ptfgptg = (michiganstate3ptfgm/michiganstate3ptfga)*100;
        michiganstateassistspergame = (michiganstateassists/michiganstategamesplayed);
        michiganstateassistsperfgm = (michiganstateassists/michiganstatefgm);
        michiganstateassiststoturnoverratio = (michiganstateassists/michiganstateturnovers);
        michiganstateblockspergame = (michiganstateblocks/michiganstategamesplayed);
        michiganstatestealspergame = (michiganstatesteals/michiganstategamesplayed);
        michiganstateturnoverspergame = (michiganstateturnovers/michiganstategamesplayed);
        michiganstateturnoverpercentage = (100*michiganstateturnovers)/(michiganstatefga+(0.475*michiganstatefta)+michiganstateturnovers);
        michiganstateftpercentage = (michiganstateftm/michiganstatefta)*100;
        michiganstatereboundspergame = (michiganstaterebounds/michiganstategamesplayed);
        michiganstateoffreboundspergame = (michiganstateoffrebounds/michiganstategamesplayed);
        michiganstatedefreboundspergame = (michiganstatedefrebounds/michiganstategamesplayed);
        michiganstatepossessions = (0.5 * (michiganstatefga + (0.475 * michiganstatefta) - michiganstateoffrebounds + michiganstateturnovers) + 0.5 * (michiganstateoppfga + (0.475 * michiganstateoppfta) - michiganstateopporb + michiganstatetoforced));
        michiganstatedefrating = 100*(michiganstatepointsallowed/michiganstatepossessions);
        michiganstateeffectivefgpercentage = ((michiganstatefgm+(0.5*michiganstate3ptfgm))/michiganstatefga)*100;
        michiganstateteamgamescore = ((michiganstatepointsscored + (0.4 * michiganstatefgm) - (0.7 * michiganstatefga) - (0.4*(michiganstatefta - michiganstateftm)) + (0.7 * michiganstateoffrebounds) + (0.3 * michiganstatedefrebounds) + michiganstatesteals + (0.7 * michiganstateassists) + (0.7 * michiganstateblocks) - (0.4 * michiganstatefouls) - michiganstateturnovers)/8)/michiganstategamesplayed;
        michiganstatenetrating = 100 * ((michiganstatepointsscored - michiganstatepointsallowed) / michiganstatepossessions);
        michiganstateoffensiverating = 100 * (michiganstatepointsscored / michiganstatepossessions);
        michiganstatepace = 40 * (michiganstatepossessions / (0.2 * michiganstateminutesplayed));
        michiganstatetrueshootingpercentage = (michiganstatepointsscored / (2 * (michiganstatefga + 0.475 * michiganstatefta)))*100;
        System.out.println("\nMichigan State:\n" + michiganstatewinpercentage + "% Win Percentage\n" + michiganstateppg +
                " Points Per Game\n"+michiganstatepapg+ " Points Allowed Per Game\n"+michiganstatefgptg+
                "% Field Goal Percentage\n"+michiganstate2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +michiganstate3ptfgptg+"% 3 Point Field Goal Percentage\n"+michiganstateassistspergame+" Assists Per Game\n"+
                michiganstateassistsperfgm+" Assists Per FGM\n"+ michiganstateassiststoturnoverratio+" Assists : TO Ratio\n"+
                michiganstateblockspergame+" Blocks Per Game\n"+michiganstatestealspergame+" Steals Per Game\n"+
                michiganstateturnoverspergame+" TO Per Game\n"+michiganstateturnoverpercentage+" TO%\n"+ michiganstateftpercentage+" FT%\n"+
                michiganstatereboundspergame+" Rebounds Per Game\n"+michiganstateoffreboundspergame+" Offensive Rebounds Per game\n"+
                michiganstatedefreboundspergame+" Defensive Rebounds Per Game\n"+michiganstatepossessions+" Possessions\n"+
                michiganstatedefrating+" Defensive Rating\n"+michiganstateeffectivefgpercentage+" EFG%\n"+michiganstateteamgamescore+" Team Game Score\n"
                +michiganstatenetrating+" Net Rating\n"+michiganstateoffensiverating+" Offensive Rating\n"+michiganstatepace+" Pace\n"+michiganstatetrueshootingpercentage+" True Shooting Percentage");

        double clemsonwins = 17;
        double clemsongamesplayed = 33;
        double clemsonwinpercentage = 0;
        double clemsonpointsscored = 2468;
        double clemsonppg = 0;
        double clemsonpointsallowed = 2361;
        double clemsonpapg = 0;
        double clemsonfgm = 871;
        double clemsonfga = 1939;
        double clemsonfgptg = 0;
        double clemson2ptfgm = 632;
        double clemson2ptfga = 1270;
        double clemson2ptfgptg = 0;
        double clemson3ptfgm = 239;
        double clemson3ptfga = 669;
        double clemson3ptfgptg = 0;
        double clemsonassists = 414;
        double clemsonassistspergame = 0;
        double clemsonassistsperfgm = 0;
        double clemsonassiststoturnoverratio = 0;
        double clemsonturnovers = 355;
        double clemsonturnoverspergame = 0;
        double clemsonblocks = 130;
        double clemsonblockspergame = 0;
        double clemsonsteals = 235;
        double clemsonstealspergame = 0;
        double clemsonfta = 666;
        double clemsonftm = 487;
        double clemsonturnoverpercentage = 0;
        double clemsonftpercentage = 0;
        double clemsonrebounds = 1124;
        double clemsonoffrebounds = 365;
        double clemsondefrebounds = 759;
        double clemsonreboundspergame = 0;
        double clemsonoffreboundspergame = 0;
        double clemsondefreboundspergame = 0;
        double clemsonpossessions = 0;
        double clemsonoppfga = 1930;
        double clemsonoppfta = 467;
        double clemsonopporb = 360;
        double clemsontoforced = 451;
        double clemsondefrating = 0;
        double clemsoneffectivefgpercentage = 0;
        double clemsonteamgamescore = 0;
        double clemsonfouls = 501;
        double clemsonnetrating = 0;
        double clemsonoffensiverating = 0;
        double clemsonpace = 0;
        double clemsonminutesplayed = 6625;
        double clemsontrueshootingpercentage = 0;
        clemsonwinpercentage = (clemsonwins/clemsongamesplayed)*100;
        clemsonppg = (clemsonpointsscored/clemsongamesplayed);
        clemsonpapg = (clemsonpointsallowed/clemsongamesplayed);
        clemsonfgptg = (clemsonfgm/clemsonfga)*100;
        clemson2ptfgptg = (clemson2ptfgm/clemson2ptfga)*100;
        clemson3ptfgptg = (clemson3ptfgm/clemson3ptfga)*100;
        clemsonassistspergame = (clemsonassists/clemsongamesplayed);
        clemsonassistsperfgm = (clemsonassists/clemsonfgm);
        clemsonassiststoturnoverratio = (clemsonassists/clemsonturnovers);
        clemsonblockspergame = (clemsonblocks/clemsongamesplayed);
        clemsonstealspergame = (clemsonsteals/clemsongamesplayed);
        clemsonturnoverspergame = (clemsonturnovers/clemsongamesplayed);
        clemsonturnoverpercentage = (100*clemsonturnovers)/(clemsonfga+(0.475*clemsonfta)+clemsonturnovers);
        clemsonftpercentage = (clemsonftm/clemsonfta)*100;
        clemsonreboundspergame = (clemsonrebounds/clemsongamesplayed);
        clemsonoffreboundspergame = (clemsonoffrebounds/clemsongamesplayed);
        clemsondefreboundspergame = (clemsondefrebounds/clemsongamesplayed);
        clemsonpossessions = (0.5 * (clemsonfga + (0.475 * clemsonfta) - clemsonoffrebounds + clemsonturnovers) + 0.5 * (clemsonoppfga + (0.475 * clemsonoppfta) - clemsonopporb + clemsontoforced));
        clemsondefrating = 100*(clemsonpointsallowed/clemsonpossessions);
        clemsoneffectivefgpercentage = ((clemsonfgm+(0.5*clemson3ptfgm))/clemsonfga)*100;
        clemsonteamgamescore = ((clemsonpointsscored + (0.4 * clemsonfgm) - (0.7 * clemsonfga) - (0.4*(clemsonfta - clemsonftm)) + (0.7 * clemsonoffrebounds) + (0.3 * clemsondefrebounds) + clemsonsteals + (0.7 * clemsonassists) + (0.7 * clemsonblocks) - (0.4 * clemsonfouls) - clemsonturnovers)/8)/clemsongamesplayed;
        clemsonnetrating = 100 * ((clemsonpointsscored - clemsonpointsallowed) / clemsonpossessions);
        clemsonoffensiverating = 100 * (clemsonpointsscored / clemsonpossessions);
        clemsonpace = 40 * (clemsonpossessions / (0.2 * clemsonminutesplayed));
        clemsontrueshootingpercentage = (clemsonpointsscored / (2 * (clemsonfga + 0.475 * clemsonfta)))*100;
        System.out.println("\nClemson:\n" + clemsonwinpercentage + "% Win Percentage\n" + clemsonppg +
                " Points Per Game\n"+clemsonpapg+ " Points Allowed Per Game\n"+clemsonfgptg+
                "% Field Goal Percentage\n"+clemson2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +clemson3ptfgptg+"% 3 Point Field Goal Percentage\n"+clemsonassistspergame+" Assists Per Game\n"+
                clemsonassistsperfgm+" Assists Per FGM\n"+ clemsonassiststoturnoverratio+" Assists : TO Ratio\n"+
                clemsonblockspergame+" Blocks Per Game\n"+clemsonstealspergame+" Steals Per Game\n"+
                clemsonturnoverspergame+" TO Per Game\n"+clemsonturnoverpercentage+" TO%\n"+ clemsonftpercentage+" FT%\n"+
                clemsonreboundspergame+" Rebounds Per Game\n"+clemsonoffreboundspergame+" Offensive Rebounds Per game\n"+
                clemsondefreboundspergame+" Defensive Rebounds Per Game\n"+clemsonpossessions+" Possessions\n"+
                clemsondefrating+" Defensive Rating\n"+clemsoneffectivefgpercentage+" EFG%\n"+clemsonteamgamescore+" Team Game Score\n"
                +clemsonnetrating+" Net Rating\n"+clemsonoffensiverating+" Offensive Rating\n"+clemsonpace+" Pace\n"+clemsontrueshootingpercentage+" True Shooting Percentage");

        double daytonwins = 24;
        double daytongamesplayed = 32;
        double daytonwinpercentage = 0;
        double daytonpointsscored = 2428;
        double daytonppg = 0;
        double daytonpointsallowed = 2126;
        double daytonpapg = 0;
        double daytonfgm = 820;
        double daytonfga = 1763;
        double daytonfgptg = 0;
        double dayton2ptfgm = 562;
        double dayton2ptfga = 1092;
        double dayton2ptfgptg = 0;
        double dayton3ptfgm = 258;
        double dayton3ptfga = 671;
        double dayton3ptfgptg = 0;
        double daytonassists = 500;
        double daytonassistspergame = 0;
        double daytonassistsperfgm = 0;
        double daytonassiststoturnoverratio = 0;
        double daytonturnovers = 376;
        double daytonturnoverspergame = 0;
        double daytonblocks = 128;
        double daytonblockspergame = 0;
        double daytonsteals = 249;
        double daytonstealspergame = 0;
        double daytonfta = 768;
        double daytonftm = 530;
        double daytonturnoverpercentage = 0;
        double daytonftpercentage = 0;
        double daytonrebounds = 1097;
        double daytonoffrebounds = 275;
        double daytondefrebounds = 822;
        double daytonreboundspergame = 0;
        double daytonoffreboundspergame = 0;
        double daytondefreboundspergame = 0;
        double daytonpossessions = 0;
        double daytonoppfga = 1772;
        double daytonoppfta = 618;
        double daytonopporb = 312;
        double daytontoforced = 479;
        double daytondefrating = 0;
        double daytoneffectivefgpercentage = 0;
        double daytonteamgamescore = 0;
        double daytonfouls = 601;
        double daytonnetrating = 0;
        double daytonoffensiverating = 0;
        double daytonpace = 0;
        double daytonminutesplayed = 6425;
        double daytontrueshootingpercentage = 0;
        daytonwinpercentage = (daytonwins/daytongamesplayed)*100;
        daytonppg = (daytonpointsscored/daytongamesplayed);
        daytonpapg = (daytonpointsallowed/daytongamesplayed);
        daytonfgptg = (daytonfgm/daytonfga)*100;
        dayton2ptfgptg = (dayton2ptfgm/dayton2ptfga)*100;
        dayton3ptfgptg = (dayton3ptfgm/dayton3ptfga)*100;
        daytonassistspergame = (daytonassists/daytongamesplayed);
        daytonassistsperfgm = (daytonassists/daytonfgm);
        daytonassiststoturnoverratio = (daytonassists/daytonturnovers);
        daytonblockspergame = (daytonblocks/daytongamesplayed);
        daytonstealspergame = (daytonsteals/daytongamesplayed);
        daytonturnoverspergame = (daytonturnovers/daytongamesplayed);
        daytonturnoverpercentage = (100*daytonturnovers)/(daytonfga+(0.475*daytonfta)+daytonturnovers);
        daytonftpercentage = (daytonftm/daytonfta)*100;
        daytonreboundspergame = (daytonrebounds/daytongamesplayed);
        daytonoffreboundspergame = (daytonoffrebounds/daytongamesplayed);
        daytondefreboundspergame = (daytondefrebounds/daytongamesplayed);
        daytonpossessions = (0.5 * (daytonfga + (0.475 * daytonfta) - daytonoffrebounds + daytonturnovers) + 0.5 * (daytonoppfga + (0.475 * daytonoppfta) - daytonopporb + daytontoforced));
        daytondefrating = 100*(daytonpointsallowed/daytonpossessions);
        daytoneffectivefgpercentage = ((daytonfgm+(0.5*dayton3ptfgm))/daytonfga)*100;
        daytonteamgamescore = ((daytonpointsscored + (0.4 * daytonfgm) - (0.7 * daytonfga) - (0.4*(daytonfta - daytonftm)) + (0.7 * daytonoffrebounds) + (0.3 * daytondefrebounds) + daytonsteals + (0.7 * daytonassists) + (0.7 * daytonblocks) - (0.4 * daytonfouls) - daytonturnovers)/8)/daytongamesplayed;
        daytonnetrating = 100 * ((daytonpointsscored - daytonpointsallowed) / daytonpossessions);
        daytonoffensiverating = 100 * (daytonpointsscored / daytonpossessions);
        daytonpace = 40 * (daytonpossessions / (0.2 * daytonminutesplayed));
        daytontrueshootingpercentage = (daytonpointsscored / (2 * (daytonfga + 0.475 * daytonfta)))*100;
        System.out.println("\nDayton:\n" + daytonwinpercentage + "% Win Percentage\n" + daytonppg +
                " Points Per Game\n"+daytonpapg+ " Points Allowed Per Game\n"+daytonfgptg+
                "% Field Goal Percentage\n"+dayton2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +dayton3ptfgptg+"% 3 Point Field Goal Percentage\n"+daytonassistspergame+" Assists Per Game\n"+
                daytonassistsperfgm+" Assists Per FGM\n"+ daytonassiststoturnoverratio+" Assists : TO Ratio\n"+
                daytonblockspergame+" Blocks Per Game\n"+daytonstealspergame+" Steals Per Game\n"+
                daytonturnoverspergame+" TO Per Game\n"+daytonturnoverpercentage+" TO%\n"+ daytonftpercentage+" FT%\n"+
                daytonreboundspergame+" Rebounds Per Game\n"+daytonoffreboundspergame+" Offensive Rebounds Per game\n"+
                daytondefreboundspergame+" Defensive Rebounds Per Game\n"+daytonpossessions+" Possessions\n"+
                daytondefrating+" Defensive Rating\n"+daytoneffectivefgpercentage+" EFG%\n"+daytonteamgamescore+" Team Game Score\n"
                +daytonnetrating+" Net Rating\n"+daytonoffensiverating+" Offensive Rating\n"+daytonpace+" Pace\n"+daytontrueshootingpercentage+" True Shooting Percentage");

        double rhodeislandwins = 25;
        double rhodeislandgamesplayed = 35;
        double rhodeislandwinpercentage = 0;
        double rhodeislandpointsscored = 2577;
        double rhodeislandppg = 0;
        double rhodeislandpointsallowed = 2288;
        double rhodeislandpapg = 0;
        double rhodeislandfgm = 916;
        double rhodeislandfga = 2019;
        double rhodeislandfgptg = 0;
        double rhodeisland2ptfgm = 699;
        double rhodeisland2ptfga = 1366;
        double rhodeisland2ptfgptg = 0;
        double rhodeisland3ptfgm = 217;
        double rhodeisland3ptfga = 653;
        double rhodeisland3ptfgptg = 0;
        double rhodeislandassists = 467;
        double rhodeislandassistspergame = 0;
        double rhodeislandassistsperfgm = 0;
        double rhodeislandassiststoturnoverratio = 0;
        double rhodeislandturnovers = 391;
        double rhodeislandturnoverspergame = 0;
        double rhodeislandblocks = 206;
        double rhodeislandblockspergame = 0;
        double rhodeislandsteals = 227;
        double rhodeislandstealspergame = 0;
        double rhodeislandfta = 791;
        double rhodeislandftm = 528;
        double rhodeislandturnoverpercentage = 0;
        double rhodeislandftpercentage = 0;
        double rhodeislandrebounds = 1301;
        double rhodeislandoffrebounds = 407;
        double rhodeislanddefrebounds = 894;
        double rhodeislandreboundspergame = 0;
        double rhodeislandoffreboundspergame = 0;
        double rhodeislanddefreboundspergame = 0;
        double rhodeislandpossessions = 0;
        double rhodeislandoppfga = 1875;
        double rhodeislandoppfta = 845;
        double rhodeislandopporb = 373;
        double rhodeislandtoforced = 459;
        double rhodeislanddefrating = 0;
        double rhodeislandeffectivefgpercentage = 0;
        double rhodeislandteamgamescore = 0;
        double rhodeislandfouls = 725;
        double rhodeislandnetrating = 0;
        double rhodeislandoffensiverating = 0;
        double rhodeislandpace = 0;
        double rhodeislandminutesplayed = 7025;
        double rhodeislandtrueshootingpercentage = 0;
        rhodeislandwinpercentage = (rhodeislandwins/rhodeislandgamesplayed)*100;
        rhodeislandppg = (rhodeislandpointsscored/rhodeislandgamesplayed);
        rhodeislandpapg = (rhodeislandpointsallowed/rhodeislandgamesplayed);
        rhodeislandfgptg = (rhodeislandfgm/rhodeislandfga)*100;
        rhodeisland2ptfgptg = (rhodeisland2ptfgm/rhodeisland2ptfga)*100;
        rhodeisland3ptfgptg = (rhodeisland3ptfgm/rhodeisland3ptfga)*100;
        rhodeislandassistspergame = (rhodeislandassists/rhodeislandgamesplayed);
        rhodeislandassistsperfgm = (rhodeislandassists/rhodeislandfgm);
        rhodeislandassiststoturnoverratio = (rhodeislandassists/rhodeislandturnovers);
        rhodeislandblockspergame = (rhodeislandblocks/rhodeislandgamesplayed);
        rhodeislandstealspergame = (rhodeislandsteals/rhodeislandgamesplayed);
        rhodeislandturnoverspergame = (rhodeislandturnovers/rhodeislandgamesplayed);
        rhodeislandturnoverpercentage = (100*rhodeislandturnovers)/(rhodeislandfga+(0.475*rhodeislandfta)+rhodeislandturnovers);
        rhodeislandftpercentage = (rhodeislandftm/rhodeislandfta)*100;
        rhodeislandreboundspergame = (rhodeislandrebounds/rhodeislandgamesplayed);
        rhodeislandoffreboundspergame = (rhodeislandoffrebounds/rhodeislandgamesplayed);
        rhodeislanddefreboundspergame = (rhodeislanddefrebounds/rhodeislandgamesplayed);
        rhodeislandpossessions = (0.5 * (rhodeislandfga + (0.475 * rhodeislandfta) - rhodeislandoffrebounds + rhodeislandturnovers) + 0.5 * (rhodeislandoppfga + (0.475 * rhodeislandoppfta) - rhodeislandopporb + rhodeislandtoforced));
        rhodeislanddefrating = 100*(rhodeislandpointsallowed/rhodeislandpossessions);
        rhodeislandeffectivefgpercentage = ((rhodeislandfgm+(0.5*rhodeisland3ptfgm))/rhodeislandfga)*100;
        rhodeislandteamgamescore = ((rhodeislandpointsscored + (0.4 * rhodeislandfgm) - (0.7 * rhodeislandfga) - (0.4*(rhodeislandfta - rhodeislandftm)) + (0.7 * rhodeislandoffrebounds) + (0.3 * rhodeislanddefrebounds) + rhodeislandsteals + (0.7 * rhodeislandassists) + (0.7 * rhodeislandblocks) - (0.4 * rhodeislandfouls) - rhodeislandturnovers)/8)/rhodeislandgamesplayed;
        rhodeislandnetrating = 100 * ((rhodeislandpointsscored - rhodeislandpointsallowed) / rhodeislandpossessions);
        rhodeislandoffensiverating = 100 * (rhodeislandpointsscored / rhodeislandpossessions);
        rhodeislandpace = 40 * (rhodeislandpossessions / (0.2 * rhodeislandminutesplayed));
        rhodeislandtrueshootingpercentage = (rhodeislandpointsscored / (2 * (rhodeislandfga + 0.475 * rhodeislandfta)))*100;
        System.out.println("\nRhode Island:\n" + rhodeislandwinpercentage + "% Win Percentage\n" + rhodeislandppg +
                " Points Per Game\n"+rhodeislandpapg+ " Points Allowed Per Game\n"+rhodeislandfgptg+
                "% Field Goal Percentage\n"+rhodeisland2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +rhodeisland3ptfgptg+"% 3 Point Field Goal Percentage\n"+rhodeislandassistspergame+" Assists Per Game\n"+
                rhodeislandassistsperfgm+" Assists Per FGM\n"+ rhodeislandassiststoturnoverratio+" Assists : TO Ratio\n"+
                rhodeislandblockspergame+" Blocks Per Game\n"+rhodeislandstealspergame+" Steals Per Game\n"+
                rhodeislandturnoverspergame+" TO Per Game\n"+rhodeislandturnoverpercentage+" TO%\n"+ rhodeislandftpercentage+" FT%\n"+
                rhodeislandreboundspergame+" Rebounds Per Game\n"+rhodeislandoffreboundspergame+" Offensive Rebounds Per game\n"+
                rhodeislanddefreboundspergame+" Defensive Rebounds Per Game\n"+rhodeislandpossessions+" Possessions\n"+
                rhodeislanddefrating+" Defensive Rating\n"+rhodeislandeffectivefgpercentage+" EFG%\n"+rhodeislandteamgamescore+" Team Game Score\n"
                +rhodeislandnetrating+" Net Rating\n"+rhodeislandoffensiverating+" Offensive Rating\n"+rhodeislandpace+" Pace\n"+rhodeislandtrueshootingpercentage+" True Shooting Percentage");

        double marylandwins = 24;
        double marylandgamesplayed = 33;
        double marylandwinpercentage = 0;
        double marylandpointsscored = 2438;
        double marylandppg = 0;
        double marylandpointsallowed = 2246;
        double marylandpapg = 0;
        double marylandfgm = 827;
        double marylandfga = 1840;
        double marylandfgptg = 0;
        double maryland2ptfgm = 555;
        double maryland2ptfga = 1083;
        double maryland2ptfgptg = 0;
        double maryland3ptfgm = 272;
        double maryland3ptfga = 757;
        double maryland3ptfgptg = 0;
        double marylandassists = 472;
        double marylandassistspergame = 0;
        double marylandassistsperfgm = 0;
        double marylandassiststoturnoverratio = 0;
        double marylandturnovers = 427;
        double marylandturnoverspergame = 0;
        double marylandblocks = 154;
        double marylandblockspergame = 0;
        double marylandsteals = 180;
        double marylandstealspergame = 0;
        double marylandfta = 732;
        double marylandftm = 512;
        double marylandturnoverpercentage = 0;
        double marylandftpercentage = 0;
        double marylandrebounds = 1173;
        double marylandoffrebounds = 350;
        double marylanddefrebounds = 823;
        double marylandreboundspergame = 0;
        double marylandoffreboundspergame = 0;
        double marylanddefreboundspergame = 0;
        double marylandpossessions = 0;
        double marylandoppfga = 1917;
        double marylandoppfta = 626;
        double marylandopporb = 383;
        double marylandtoforced = 418;
        double marylanddefrating = 0;
        double marylandeffectivefgpercentage = 0;
        double marylandteamgamescore = 0;
        double marylandfouls = 613;
        double marylandnetrating = 0;
        double marylandoffensiverating = 0;
        double marylandpace = 0;
        double marylandminutesplayed = 6625;
        double marylandtrueshootingpercentage = 0;
        marylandwinpercentage = (marylandwins/marylandgamesplayed)*100;
        marylandppg = (marylandpointsscored/marylandgamesplayed);
        marylandpapg = (marylandpointsallowed/marylandgamesplayed);
        marylandfgptg = (marylandfgm/marylandfga)*100;
        maryland2ptfgptg = (maryland2ptfgm/maryland2ptfga)*100;
        maryland3ptfgptg = (maryland3ptfgm/maryland3ptfga)*100;
        marylandassistspergame = (marylandassists/marylandgamesplayed);
        marylandassistsperfgm = (marylandassists/marylandfgm);
        marylandassiststoturnoverratio = (marylandassists/marylandturnovers);
        marylandblockspergame = (marylandblocks/marylandgamesplayed);
        marylandstealspergame = (marylandsteals/marylandgamesplayed);
        marylandturnoverspergame = (marylandturnovers/marylandgamesplayed);
        marylandturnoverpercentage = (100*marylandturnovers)/(marylandfga+(0.475*marylandfta)+marylandturnovers);
        marylandftpercentage = (marylandftm/marylandfta)*100;
        marylandreboundspergame = (marylandrebounds/marylandgamesplayed);
        marylandoffreboundspergame = (marylandoffrebounds/marylandgamesplayed);
        marylanddefreboundspergame = (marylanddefrebounds/marylandgamesplayed);
        marylandpossessions = (0.5 * (marylandfga + (0.475 * marylandfta) - marylandoffrebounds + marylandturnovers) + 0.5 * (marylandoppfga + (0.475 * marylandoppfta) - marylandopporb + marylandtoforced));
        marylanddefrating = 100*(marylandpointsallowed/marylandpossessions);
        marylandeffectivefgpercentage = ((marylandfgm+(0.5*maryland3ptfgm))/marylandfga)*100;
        marylandteamgamescore = ((marylandpointsscored + (0.4 * marylandfgm) - (0.7 * marylandfga) - (0.4*(marylandfta - marylandftm)) + (0.7 * marylandoffrebounds) + (0.3 * marylanddefrebounds) + marylandsteals + (0.7 * marylandassists) + (0.7 * marylandblocks) - (0.4 * marylandfouls) - marylandturnovers)/8)/marylandgamesplayed;
        marylandnetrating = 100 * ((marylandpointsscored - marylandpointsallowed) / marylandpossessions);
        marylandoffensiverating = 100 * (marylandpointsscored / marylandpossessions);
        marylandpace = 40 * (marylandpossessions / (0.2 * marylandminutesplayed));
        marylandtrueshootingpercentage = (marylandpointsscored / (2 * (marylandfga + 0.475 * marylandfta)))*100;
        System.out.println("\nMaryland:\n" + marylandwinpercentage + "% Win Percentage\n" + marylandppg +
                " Points Per Game\n"+marylandpapg+ " Points Allowed Per Game\n"+marylandfgptg+
                "% Field Goal Percentage\n"+maryland2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +maryland3ptfgptg+"% 3 Point Field Goal Percentage\n"+marylandassistspergame+" Assists Per Game\n"+
                marylandassistsperfgm+" Assists Per FGM\n"+ marylandassiststoturnoverratio+" Assists : TO Ratio\n"+
                marylandblockspergame+" Blocks Per Game\n"+marylandstealspergame+" Steals Per Game\n"+
                marylandturnoverspergame+" TO Per Game\n"+marylandturnoverpercentage+" TO%\n"+ marylandftpercentage+" FT%\n"+
                marylandreboundspergame+" Rebounds Per Game\n"+marylandoffreboundspergame+" Offensive Rebounds Per game\n"+
                marylanddefreboundspergame+" Defensive Rebounds Per Game\n"+marylandpossessions+" Possessions\n"+
                marylanddefrating+" Defensive Rating\n"+marylandeffectivefgpercentage+" EFG%\n"+marylandteamgamescore+" Team Game Score\n"
                +marylandnetrating+" Net Rating\n"+marylandoffensiverating+" Offensive Rating\n"+marylandpace+" Pace\n"+marylandtrueshootingpercentage+" True Shooting Percentage");

        double virginiatechwins = 22;
        double virginiatechgamesplayed = 33;
        double virginiatechwinpercentage = 0;
        double virginiatechpointsscored = 2610;
        double virginiatechppg = 0;
        double virginiatechpointsallowed = 2465;
        double virginiatechpapg = 0;
        double virginiatechfgm = 887;
        double virginiatechfga = 1813;
        double virginiatechfgptg = 0;
        double virginiatech2ptfgm = 597;
        double virginiatech2ptfga = 1093;
        double virginiatech2ptfgptg = 0;
        double virginiatech3ptfgm = 290;
        double virginiatech3ptfga = 720;
        double virginiatech3ptfgptg = 0;
        double virginiatechassists = 497;
        double virginiatechassistspergame = 0;
        double virginiatechassistsperfgm = 0;
        double virginiatechassiststoturnoverratio = 0;
        double virginiatechturnovers = 398;
        double virginiatechturnoverspergame = 0;
        double virginiatechblocks = 91;
        double virginiatechblockspergame = 0;
        double virginiatechsteals = 131;
        double virginiatechstealspergame = 0;
        double virginiatechfta = 741;
        double virginiatechftm = 546;
        double virginiatechturnoverpercentage = 0;
        double virginiatechftpercentage = 0;
        double virginiatechrebounds = 1068;
        double virginiatechoffrebounds = 238;
        double virginiatechdefrebounds = 830;
        double virginiatechreboundspergame = 0;
        double virginiatechoffreboundspergame = 0;
        double virginiatechdefreboundspergame = 0;
        double virginiatechpossessions = 0;
        double virginiatechoppfga = 2029;
        double virginiatechoppfta = 554;
        double virginiatechopporb = 359;
        double virginiatechtoforced = 383;
        double virginiatechdefrating = 0;
        double virginiatecheffectivefgpercentage = 0;
        double virginiatechteamgamescore = 0;
        double virginiatechfouls = 543;
        double virginiatechnetrating = 0;
        double virginiatechoffensiverating = 0;
        double virginiatechpace = 0;
        double virginiatechminutesplayed = 6650;
        double virginiatechtrueshootingpercentage = 0;
        virginiatechwinpercentage = (virginiatechwins/virginiatechgamesplayed)*100;
        virginiatechppg = (virginiatechpointsscored/virginiatechgamesplayed);
        virginiatechpapg = (virginiatechpointsallowed/virginiatechgamesplayed);
        virginiatechfgptg = (virginiatechfgm/virginiatechfga)*100;
        virginiatech2ptfgptg = (virginiatech2ptfgm/virginiatech2ptfga)*100;
        virginiatech3ptfgptg = (virginiatech3ptfgm/virginiatech3ptfga)*100;
        virginiatechassistspergame = (virginiatechassists/virginiatechgamesplayed);
        virginiatechassistsperfgm = (virginiatechassists/virginiatechfgm);
        virginiatechassiststoturnoverratio = (virginiatechassists/virginiatechturnovers);
        virginiatechblockspergame = (virginiatechblocks/virginiatechgamesplayed);
        virginiatechstealspergame = (virginiatechsteals/virginiatechgamesplayed);
        virginiatechturnoverspergame = (virginiatechturnovers/virginiatechgamesplayed);
        virginiatechturnoverpercentage = (100*virginiatechturnovers)/(virginiatechfga+(0.475*virginiatechfta)+virginiatechturnovers);
        virginiatechftpercentage = (virginiatechftm/virginiatechfta)*100;
        virginiatechreboundspergame = (virginiatechrebounds/virginiatechgamesplayed);
        virginiatechoffreboundspergame = (virginiatechoffrebounds/virginiatechgamesplayed);
        virginiatechdefreboundspergame = (virginiatechdefrebounds/virginiatechgamesplayed);
        virginiatechpossessions = (0.5 * (virginiatechfga + (0.475 * virginiatechfta) - virginiatechoffrebounds + virginiatechturnovers) + 0.5 * (virginiatechoppfga + (0.475 * virginiatechoppfta) - virginiatechopporb + virginiatechtoforced));
        virginiatechdefrating = 100*(virginiatechpointsallowed/virginiatechpossessions);
        virginiatecheffectivefgpercentage = ((virginiatechfgm+(0.5*virginiatech3ptfgm))/virginiatechfga)*100;
        virginiatechteamgamescore = ((virginiatechpointsscored + (0.4 * virginiatechfgm) - (0.7 * virginiatechfga) - (0.4*(virginiatechfta - virginiatechftm)) + (0.7 * virginiatechoffrebounds) + (0.3 * virginiatechdefrebounds) + virginiatechsteals + (0.7 * virginiatechassists) + (0.7 * virginiatechblocks) - (0.4 * virginiatechfouls) - virginiatechturnovers)/8)/virginiatechgamesplayed;
        virginiatechnetrating = 100 * ((virginiatechpointsscored - virginiatechpointsallowed) / virginiatechpossessions);
        virginiatechoffensiverating = 100 * (virginiatechpointsscored / virginiatechpossessions);
        virginiatechpace = 40 * (virginiatechpossessions / (0.2 * virginiatechminutesplayed));
        virginiatechtrueshootingpercentage = (virginiatechpointsscored / (2 * (virginiatechfga + 0.475 * virginiatechfta)))*100;
        System.out.println("\nVirginia Tech:\n" + virginiatechwinpercentage + "% Win Percentage\n" + virginiatechppg +
                " Points Per Game\n"+virginiatechpapg+ " Points Allowed Per Game\n"+virginiatechfgptg+
                "% Field Goal Percentage\n"+virginiatech2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +virginiatech3ptfgptg+"% 3 Point Field Goal Percentage\n"+virginiatechassistspergame+" Assists Per Game\n"+
                virginiatechassistsperfgm+" Assists Per FGM\n"+ virginiatechassiststoturnoverratio+" Assists : TO Ratio\n"+
                virginiatechblockspergame+" Blocks Per Game\n"+virginiatechstealspergame+" Steals Per Game\n"+
                virginiatechturnoverspergame+" TO Per Game\n"+virginiatechturnoverpercentage+" TO%\n"+ virginiatechftpercentage+" FT%\n"+
                virginiatechreboundspergame+" Rebounds Per Game\n"+virginiatechoffreboundspergame+" Offensive Rebounds Per game\n"+
                virginiatechdefreboundspergame+" Defensive Rebounds Per Game\n"+virginiatechpossessions+" Possessions\n"+
                virginiatechdefrating+" Defensive Rating\n"+virginiatecheffectivefgpercentage+" EFG%\n"+virginiatechteamgamescore+" Team Game Score\n"
                +virginiatechnetrating+" Net Rating\n"+virginiatechoffensiverating+" Offensive Rating\n"+virginiatechpace+" Pace\n"+virginiatechtrueshootingpercentage+" True Shooting Percentage");

        double utahwins = 20;
        double utahgamesplayed = 32;
        double utahwinpercentage = 0;
        double utahpointsscored = 2511;
        double utahppg = 0;
        double utahpointsallowed = 2180;
        double utahpapg = 0;
        double utahfgm = 936;
        double utahfga = 1856;
        double utahfgptg = 0;
        double utah2ptfgm = 721;
        double utah2ptfga = 1247;
        double utah2ptfgptg = 0;
        double utah3ptfgm = 215;
        double utah3ptfga = 609;
        double utah3ptfgptg = 0;
        double utahassists = 476;
        double utahassistspergame = 0;
        double utahassistsperfgm = 0;
        double utahassiststoturnoverratio = 0;
        double utahturnovers = 431;
        double utahturnoverspergame = 0;
        double utahblocks = 113;
        double utahblockspergame = 0;
        double utahsteals = 195;
        double utahstealspergame = 0;
        double utahfta = 622;
        double utahftm = 424;
        double utahturnoverpercentage = 0;
        double utahftpercentage = 0;
        double utahrebounds = 1217;
        double utahoffrebounds = 321;
        double utahdefrebounds = 896;
        double utahreboundspergame = 0;
        double utahoffreboundspergame = 0;
        double utahdefreboundspergame = 0;
        double utahpossessions = 0;
        double utahoppfga = 1887;
        double utahoppfta = 573;
        double utahopporb = 281;
        double utahtoforced = 385;
        double utahdefrating = 0;
        double utaheffectivefgpercentage = 0;
        double utahteamgamescore = 0;
        double utahfouls = 539;
        double utahnetrating = 0;
        double utahoffensiverating = 0;
        double utahpace = 0;
        double utahminutesplayed = 6450;
        double utahtrueshootingpercentage = 0;
        utahwinpercentage = (utahwins/utahgamesplayed)*100;
        utahppg = (utahpointsscored/utahgamesplayed);
        utahpapg = (utahpointsallowed/utahgamesplayed);
        utahfgptg = (utahfgm/utahfga)*100;
        utah2ptfgptg = (utah2ptfgm/utah2ptfga)*100;
        utah3ptfgptg = (utah3ptfgm/utah3ptfga)*100;
        utahassistspergame = (utahassists/utahgamesplayed);
        utahassistsperfgm = (utahassists/utahfgm);
        utahassiststoturnoverratio = (utahassists/utahturnovers);
        utahblockspergame = (utahblocks/utahgamesplayed);
        utahstealspergame = (utahsteals/utahgamesplayed);
        utahturnoverspergame = (utahturnovers/utahgamesplayed);
        utahturnoverpercentage = (100*utahturnovers)/(utahfga+(0.475*utahfta)+utahturnovers);
        utahftpercentage = (utahftm/utahfta)*100;
        utahreboundspergame = (utahrebounds/utahgamesplayed);
        utahoffreboundspergame = (utahoffrebounds/utahgamesplayed);
        utahdefreboundspergame = (utahdefrebounds/utahgamesplayed);
        utahpossessions = (0.5 * (utahfga + (0.475 * utahfta) - utahoffrebounds + utahturnovers) + 0.5 * (utahoppfga + (0.475 * utahoppfta) - utahopporb + utahtoforced));
        utahdefrating = 100*(utahpointsallowed/utahpossessions);
        utaheffectivefgpercentage = ((utahfgm+(0.5*utah3ptfgm))/utahfga)*100;
        utahteamgamescore = ((utahpointsscored + (0.4 * utahfgm) - (0.7 * utahfga) - (0.4*(utahfta - utahftm)) + (0.7 * utahoffrebounds) + (0.3 * utahdefrebounds) + utahsteals + (0.7 * utahassists) + (0.7 * utahblocks) - (0.4 * utahfouls) - utahturnovers)/8)/utahgamesplayed;
        utahnetrating = 100 * ((utahpointsscored - utahpointsallowed) / utahpossessions);
        utahoffensiverating = 100 * (utahpointsscored / utahpossessions);
        utahpace = 40 * (utahpossessions / (0.2 * utahminutesplayed));
        utahtrueshootingpercentage = (utahpointsscored / (2 * (utahfga + 0.475 * utahfta)))*100;
        System.out.println("\nUtah:\n" + utahwinpercentage + "% Win Percentage\n" + utahppg +
                " Points Per Game\n"+utahpapg+ " Points Allowed Per Game\n"+utahfgptg+
                "% Field Goal Percentage\n"+utah2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +utah3ptfgptg+"% 3 Point Field Goal Percentage\n"+utahassistspergame+" Assists Per Game\n"+
                utahassistsperfgm+" Assists Per FGM\n"+ utahassiststoturnoverratio+" Assists : TO Ratio\n"+
                utahblockspergame+" Blocks Per Game\n"+utahstealspergame+" Steals Per Game\n"+
                utahturnoverspergame+" TO Per Game\n"+utahturnoverpercentage+" TO%\n"+ utahftpercentage+" FT%\n"+
                utahreboundspergame+" Rebounds Per Game\n"+utahoffreboundspergame+" Offensive Rebounds Per game\n"+
                utahdefreboundspergame+" Defensive Rebounds Per Game\n"+utahpossessions+" Possessions\n"+
                utahdefrating+" Defensive Rating\n"+utaheffectivefgpercentage+" EFG%\n"+utahteamgamescore+" Team Game Score\n"
                +utahnetrating+" Net Rating\n"+utahoffensiverating+" Offensive Rating\n"+utahpace+" Pace\n"+utahtrueshootingpercentage+" True Shooting Percentage");

        double houstonwins = 21;
        double houstongamesplayed = 32;
        double houstonwinpercentage = 0;
        double houstonpointsscored = 2358;
        double houstonppg = 0;
        double houstonpointsallowed = 2077;
        double houstonpapg = 0;
        double houstonfgm = 850;
        double houstonfga = 1902;
        double houstonfgptg = 0;
        double houston2ptfgm = 582;
        double houston2ptfga = 1221;
        double houston2ptfgptg = 0;
        double houston3ptfgm = 268;
        double houston3ptfga = 681;
        double houston3ptfgptg = 0;
        double houstonassists = 406;
        double houstonassistspergame = 0;
        double houstonassistsperfgm = 0;
        double houstonassiststoturnoverratio = 0;
        double houstonturnovers = 315;
        double houstonturnoverspergame = 0;
        double houstonblocks = 113;
        double houstonblockspergame = 0;
        double houstonsteals = 170;
        double houstonstealspergame = 0;
        double houstonfta = 544;
        double houstonftm = 390;
        double houstonturnoverpercentage = 0;
        double houstonftpercentage = 0;
        double houstonrebounds = 1138;
        double houstonoffrebounds = 362;
        double houstondefrebounds = 776;
        double houstonreboundspergame = 0;
        double houstonoffreboundspergame = 0;
        double houstondefreboundspergame = 0;
        double houstonpossessions = 0;
        double houstonoppfga = 1717;
        double houstonoppfta = 633;
        double houstonopporb = 342;
        double houstontoforced = 437;
        double houstondefrating = 0;
        double houstoneffectivefgpercentage = 0;
        double houstonteamgamescore = 0;
        double houstonfouls = 601;
        double houstonnetrating = 0;
        double houstonoffensiverating = 0;
        double houstonpace = 0;
        double houstonminutesplayed = 6425;
        double houstontrueshootingpercentage = 0;
        houstonwinpercentage = (houstonwins/houstongamesplayed)*100;
        houstonppg = (houstonpointsscored/houstongamesplayed);
        houstonpapg = (houstonpointsallowed/houstongamesplayed);
        houstonfgptg = (houstonfgm/houstonfga)*100;
        houston2ptfgptg = (houston2ptfgm/houston2ptfga)*100;
        houston3ptfgptg = (houston3ptfgm/houston3ptfga)*100;
        houstonassistspergame = (houstonassists/houstongamesplayed);
        houstonassistsperfgm = (houstonassists/houstonfgm);
        houstonassiststoturnoverratio = (houstonassists/houstonturnovers);
        houstonblockspergame = (houstonblocks/houstongamesplayed);
        houstonstealspergame = (houstonsteals/houstongamesplayed);
        houstonturnoverspergame = (houstonturnovers/houstongamesplayed);
        houstonturnoverpercentage = (100*houstonturnovers)/(houstonfga+(0.475*houstonfta)+houstonturnovers);
        houstonftpercentage = (houstonftm/houstonfta)*100;
        houstonreboundspergame = (houstonrebounds/houstongamesplayed);
        houstonoffreboundspergame = (houstonoffrebounds/houstongamesplayed);
        houstondefreboundspergame = (houstondefrebounds/houstongamesplayed);
        houstonpossessions = (0.5 * (houstonfga + (0.475 * houstonfta) - houstonoffrebounds + houstonturnovers) + 0.5 * (houstonoppfga + (0.475 * houstonoppfta) - houstonopporb + houstontoforced));
        houstondefrating = 100*(houstonpointsallowed/houstonpossessions);
        houstoneffectivefgpercentage = ((houstonfgm+(0.5*houston3ptfgm))/houstonfga)*100;
        houstonteamgamescore = ((houstonpointsscored + (0.4 * houstonfgm) - (0.7 * houstonfga) - (0.4*(houstonfta - houstonftm)) + (0.7 * houstonoffrebounds) + (0.3 * houstondefrebounds) + houstonsteals + (0.7 * houstonassists) + (0.7 * houstonblocks) - (0.4 * houstonfouls) - houstonturnovers)/8)/houstongamesplayed;
        houstonnetrating = 100 * ((houstonpointsscored - houstonpointsallowed) / houstonpossessions);
        houstonoffensiverating = 100 * (houstonpointsscored / houstonpossessions);
        houstonpace = 40 * (houstonpossessions / (0.2 * houstonminutesplayed));
        houstontrueshootingpercentage = (houstonpointsscored / (2 * (houstonfga + 0.475 * houstonfta)))*100;
        System.out.println("\nHouston:\n" + houstonwinpercentage + "% Win Percentage\n" + houstonppg +
                " Points Per Game\n"+houstonpapg+ " Points Allowed Per Game\n"+houstonfgptg+
                "% Field Goal Percentage\n"+houston2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +houston3ptfgptg+"% 3 Point Field Goal Percentage\n"+houstonassistspergame+" Assists Per Game\n"+
                houstonassistsperfgm+" Assists Per FGM\n"+ houstonassiststoturnoverratio+" Assists : TO Ratio\n"+
                houstonblockspergame+" Blocks Per Game\n"+houstonstealspergame+" Steals Per Game\n"+
                houstonturnoverspergame+" TO Per Game\n"+houstonturnoverpercentage+" TO%\n"+ houstonftpercentage+" FT%\n"+
                houstonreboundspergame+" Rebounds Per Game\n"+houstonoffreboundspergame+" Offensive Rebounds Per game\n"+
                houstondefreboundspergame+" Defensive Rebounds Per Game\n"+houstonpossessions+" Possessions\n"+
                houstondefrating+" Defensive Rating\n"+houstoneffectivefgpercentage+" EFG%\n"+houstonteamgamescore+" Team Game Score\n"
                +houstonnetrating+" Net Rating\n"+houstonoffensiverating+" Offensive Rating\n"+houstonpace+" Pace\n"+houstontrueshootingpercentage+" True Shooting Percentage");

        double setonhallwins = 21;
        double setonhallgamesplayed = 33;
        double setonhallwinpercentage = 0;
        double setonhallpointsscored = 2417;
        double setonhallppg = 0;
        double setonhallpointsallowed = 2323;
        double setonhallpapg = 0;
        double setonhallfgm = 872;
        double setonhallfga = 1949;
        double setonhallfgptg = 0;
        double setonhall2ptfgm = 670;
        double setonhall2ptfga = 1351;
        double setonhall2ptfgptg = 0;
        double setonhall3ptfgm = 202;
        double setonhall3ptfga = 598;
        double setonhall3ptfgptg = 0;
        double setonhallassists = 405;
        double setonhallassistspergame = 0;
        double setonhallassistsperfgm = 0;
        double setonhallassiststoturnoverratio = 0;
        double setonhallturnovers = 449;
        double setonhallturnoverspergame = 0;
        double setonhallblocks = 82;
        double setonhallblockspergame = 0;
        double setonhallsteals = 228;
        double setonhallstealspergame = 0;
        double setonhallfta = 733;
        double setonhallftm = 471;
        double setonhallturnoverpercentage = 0;
        double setonhallftpercentage = 0;
        double setonhallrebounds = 1311;
        double setonhalloffrebounds = 437;
        double setonhalldefrebounds = 874;
        double setonhallreboundspergame = 0;
        double setonhalloffreboundspergame = 0;
        double setonhalldefreboundspergame = 0;
        double setonhallpossessions = 0;
        double setonhalloppfga = 1872;
        double setonhalloppfta = 677;
        double setonhallopporb = 295;
        double setonhalltoforced = 403;
        double setonhalldefrating = 0;
        double setonhalleffectivefgpercentage = 0;
        double setonhallteamgamescore = 0;
        double setonhallfouls = 613;
        double setonhallnetrating = 0;
        double setonhalloffensiverating = 0;
        double setonhallpace = 0;
        double setonhallminutesplayed = 6675;
        double setonhalltrueshootingpercentage = 0;
        setonhallwinpercentage = (setonhallwins/setonhallgamesplayed)*100;
        setonhallppg = (setonhallpointsscored/setonhallgamesplayed);
        setonhallpapg = (setonhallpointsallowed/setonhallgamesplayed);
        setonhallfgptg = (setonhallfgm/setonhallfga)*100;
        setonhall2ptfgptg = (setonhall2ptfgm/setonhall2ptfga)*100;
        setonhall3ptfgptg = (setonhall3ptfgm/setonhall3ptfga)*100;
        setonhallassistspergame = (setonhallassists/setonhallgamesplayed);
        setonhallassistsperfgm = (setonhallassists/setonhallfgm);
        setonhallassiststoturnoverratio = (setonhallassists/setonhallturnovers);
        setonhallblockspergame = (setonhallblocks/setonhallgamesplayed);
        setonhallstealspergame = (setonhallsteals/setonhallgamesplayed);
        setonhallturnoverspergame = (setonhallturnovers/setonhallgamesplayed);
        setonhallturnoverpercentage = (100*setonhallturnovers)/(setonhallfga+(0.475*setonhallfta)+setonhallturnovers);
        setonhallftpercentage = (setonhallftm/setonhallfta)*100;
        setonhallreboundspergame = (setonhallrebounds/setonhallgamesplayed);
        setonhalloffreboundspergame = (setonhalloffrebounds/setonhallgamesplayed);
        setonhalldefreboundspergame = (setonhalldefrebounds/setonhallgamesplayed);
        setonhallpossessions = (0.5 * (setonhallfga + (0.475 * setonhallfta) - setonhalloffrebounds + setonhallturnovers) + 0.5 * (setonhalloppfga + (0.475 * setonhalloppfta) - setonhallopporb + setonhalltoforced));
        setonhalldefrating = 100*(setonhallpointsallowed/setonhallpossessions);
        setonhalleffectivefgpercentage = ((setonhallfgm+(0.5*setonhall3ptfgm))/setonhallfga)*100;
        setonhallteamgamescore = ((setonhallpointsscored + (0.4 * setonhallfgm) - (0.7 * setonhallfga) - (0.4*(setonhallfta - setonhallftm)) + (0.7 * setonhalloffrebounds) + (0.3 * setonhalldefrebounds) + setonhallsteals + (0.7 * setonhallassists) + (0.7 * setonhallblocks) - (0.4 * setonhallfouls) - setonhallturnovers)/8)/setonhallgamesplayed;
        setonhallnetrating = 100 * ((setonhallpointsscored - setonhallpointsallowed) / setonhallpossessions);
        setonhalloffensiverating = 100 * (setonhallpointsscored / setonhallpossessions);
        setonhallpace = 40 * (setonhallpossessions / (0.2 * setonhallminutesplayed));
        setonhalltrueshootingpercentage = (setonhallpointsscored / (2 * (setonhallfga + 0.475 * setonhallfta)))*100;
        System.out.println("\nSeton Hall:\n" + setonhallwinpercentage + "% Win Percentage\n" + setonhallppg +
                " Points Per Game\n"+setonhallpapg+ " Points Allowed Per Game\n"+setonhallfgptg+
                "% Field Goal Percentage\n"+setonhall2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +setonhall3ptfgptg+"% 3 Point Field Goal Percentage\n"+setonhallassistspergame+" Assists Per Game\n"+
                setonhallassistsperfgm+" Assists Per FGM\n"+ setonhallassiststoturnoverratio+" Assists : TO Ratio\n"+
                setonhallblockspergame+" Blocks Per Game\n"+setonhallstealspergame+" Steals Per Game\n"+
                setonhallturnoverspergame+" TO Per Game\n"+setonhallturnoverpercentage+" TO%\n"+ setonhallftpercentage+" FT%\n"+
                setonhallreboundspergame+" Rebounds Per Game\n"+setonhalloffreboundspergame+" Offensive Rebounds Per game\n"+
                setonhalldefreboundspergame+" Defensive Rebounds Per Game\n"+setonhallpossessions+" Possessions\n"+
                setonhalldefrating+" Defensive Rating\n"+setonhalleffectivefgpercentage+" EFG%\n"+setonhallteamgamescore+" Team Game Score\n"
                +setonhallnetrating+" Net Rating\n"+setonhalloffensiverating+" Offensive Rating\n"+setonhallpace+" Pace\n"+setonhalltrueshootingpercentage+" True Shooting Percentage");

        double vcuwins = 26;
        double vcugamesplayed = 35;
        double vcuwinpercentage = 0;
        double vcupointsscored = 2616;
        double vcuppg = 0;
        double vcupointsallowed = 2343;
        double vcupapg = 0;
        double vcufgm = 945;
        double vcufga = 2050;
        double vcufgptg = 0;
        double vcu2ptfgm = 746;
        double vcu2ptfga = 1448;
        double vcu2ptfgptg = 0;
        double vcu3ptfgm = 199;
        double vcu3ptfga = 602;
        double vcu3ptfgptg = 0;
        double vcuassists = 525;
        double vcuassistspergame = 0;
        double vcuassistsperfgm = 0;
        double vcuassiststoturnoverratio = 0;
        double vcuturnovers = 435;
        double vcuturnoverspergame = 0;
        double vcublocks = 138;
        double vcublockspergame = 0;
        double vcusteals = 263;
        double vcustealspergame = 0;
        double vcufta = 747;
        double vcuftm = 527;
        double vcuturnoverpercentage = 0;
        double vcuftpercentage = 0;
        double vcurebounds = 1275;
        double vcuoffrebounds = 334;
        double vcudefrebounds = 890;
        double vcureboundspergame = 0;
        double vcuoffreboundspergame = 0;
        double vcudefreboundspergame = 0;
        double vcupossessions = 0;
        double vcuoppfga = 1897;
        double vcuoppfta = 776;
        double vcuopporb = 334;
        double vcutoforced = 515;
        double vcudefrating = 0;
        double vcueffectivefgpercentage = 0;
        double vcuteamgamescore = 0;
        double vcufouls = 728;
        double vcunetrating = 0;
        double vcuoffensiverating = 0;
        double vcupace = 0;
        double vcuminutesplayed = 7100;
        double vcutrueshootingpercentage = 0;
        vcuwinpercentage = (vcuwins/vcugamesplayed)*100;
        vcuppg = (vcupointsscored/vcugamesplayed);
        vcupapg = (vcupointsallowed/vcugamesplayed);
        vcufgptg = (vcufgm/vcufga)*100;
        vcu2ptfgptg = (vcu2ptfgm/vcu2ptfga)*100;
        vcu3ptfgptg = (vcu3ptfgm/vcu3ptfga)*100;
        vcuassistspergame = (vcuassists/vcugamesplayed);
        vcuassistsperfgm = (vcuassists/vcufgm);
        vcuassiststoturnoverratio = (vcuassists/vcuturnovers);
        vcublockspergame = (vcublocks/vcugamesplayed);
        vcustealspergame = (vcusteals/vcugamesplayed);
        vcuturnoverspergame = (vcuturnovers/vcugamesplayed);
        vcuturnoverpercentage = (100*vcuturnovers)/(vcufga+(0.475*vcufta)+vcuturnovers);
        vcuftpercentage = (vcuftm/vcufta)*100;
        vcureboundspergame = (vcurebounds/vcugamesplayed);
        vcuoffreboundspergame = (vcuoffrebounds/vcugamesplayed);
        vcudefreboundspergame = (vcudefrebounds/vcugamesplayed);
        vcupossessions = (0.5 * (vcufga + (0.475 * vcufta) - vcuoffrebounds + vcuturnovers) + 0.5 * (vcuoppfga + (0.475 * vcuoppfta) - vcuopporb + vcutoforced));
        vcudefrating = 100*(vcupointsallowed/vcupossessions);
        vcueffectivefgpercentage = ((vcufgm+(0.5*vcu3ptfgm))/vcufga)*100;
        vcuteamgamescore = ((vcupointsscored + (0.4 * vcufgm) - (0.7 * vcufga) - (0.4*(vcufta - vcuftm)) + (0.7 * vcuoffrebounds) + (0.3 * vcudefrebounds) + vcusteals + (0.7 * vcuassists) + (0.7 * vcublocks) - (0.4 * vcufouls) - vcuturnovers)/8)/vcugamesplayed;
        vcunetrating = 100 * ((vcupointsscored - vcupointsallowed) / vcupossessions);
        vcuoffensiverating = 100 * (vcupointsscored / vcupossessions);
        vcupace = 40 * (vcupossessions / (0.2 * vcuminutesplayed));
        vcutrueshootingpercentage = (vcupointsscored / (2 * (vcufga + 0.475 * vcufta)))*100;
        System.out.println("\nVCU:\n" + vcuwinpercentage + "% Win Percentage\n" + vcuppg +
                " Points Per Game\n"+vcupapg+ " Points Allowed Per Game\n"+vcufgptg+
                "% Field Goal Percentage\n"+vcu2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +vcu3ptfgptg+"% 3 Point Field Goal Percentage\n"+vcuassistspergame+" Assists Per Game\n"+
                vcuassistsperfgm+" Assists Per FGM\n"+ vcuassiststoturnoverratio+" Assists : TO Ratio\n"+
                vcublockspergame+" Blocks Per Game\n"+vcustealspergame+" Steals Per Game\n"+
                vcuturnoverspergame+" TO Per Game\n"+vcuturnoverpercentage+" TO%\n"+ vcuftpercentage+" FT%\n"+
                vcureboundspergame+" Rebounds Per Game\n"+vcuoffreboundspergame+" Offensive Rebounds Per game\n"+
                vcudefreboundspergame+" Defensive Rebounds Per Game\n"+vcupossessions+" Possessions\n"+
                vcudefrating+" Defensive Rating\n"+vcueffectivefgpercentage+" EFG%\n"+vcuteamgamescore+" Team Game Score\n"
                +vcunetrating+" Net Rating\n"+vcuoffensiverating+" Offensive Rating\n"+vcupace+" Pace\n"+vcutrueshootingpercentage+" True Shooting Percentage");

        double uscwins = 26;
        double uscgamesplayed = 36;
        double uscwinpercentage = 0;
        double uscpointsscored = 2816;
        double uscppg = 0;
        double uscpointsallowed = 2633;
        double uscpapg = 0;
        double uscfgm = 975;
        double uscfga = 2139;
        double uscfgptg = 0;
        double usc2ptfgm = 692;
        double usc2ptfga = 1357;
        double usc2ptfgptg = 0;
        double usc3ptfgm = 283;
        double usc3ptfga = 782;
        double usc3ptfgptg = 0;
        double uscassists = 550;
        double uscassistspergame = 0;
        double uscassistsperfgm = 0;
        double uscassiststoturnoverratio = 0;
        double uscturnovers = 397;
        double uscturnoverspergame = 0;
        double uscblocks = 190;
        double uscblockspergame = 0;
        double uscsteals = 252;
        double uscstealspergame = 0;
        double uscfta = 787;
        double uscftm = 583;
        double uscturnoverpercentage = 0;
        double uscftpercentage = 0;
        double uscrebounds = 1286;
        double uscoffrebounds = 385;
        double uscdefrebounds = 901;
        double uscreboundspergame = 0;
        double uscoffreboundspergame = 0;
        double uscdefreboundspergame = 0;
        double uscpossessions = 0;
        double uscoppfga = 2243;
        double uscoppfta = 538;
        double uscopporb = 408;
        double usctoforced = 452;
        double uscdefrating = 0;
        double usceffectivefgpercentage = 0;
        double uscteamgamescore = 0;
        double uscfouls = 571;
        double uscnetrating = 0;
        double uscoffensiverating = 0;
        double uscpace = 0;
        double uscminutesplayed = 7225;
        double usctrueshootingpercentage = 0;
        uscwinpercentage = (uscwins/uscgamesplayed)*100;
        uscppg = (uscpointsscored/uscgamesplayed);
        uscpapg = (uscpointsallowed/uscgamesplayed);
        uscfgptg = (uscfgm/uscfga)*100;
        usc2ptfgptg = (usc2ptfgm/usc2ptfga)*100;
        usc3ptfgptg = (usc3ptfgm/usc3ptfga)*100;
        uscassistspergame = (uscassists/uscgamesplayed);
        uscassistsperfgm = (uscassists/uscfgm);
        uscassiststoturnoverratio = (uscassists/uscturnovers);
        uscblockspergame = (uscblocks/uscgamesplayed);
        uscstealspergame = (uscsteals/uscgamesplayed);
        uscturnoverspergame = (uscturnovers/uscgamesplayed);
        uscturnoverpercentage = (100*uscturnovers)/(uscfga+(0.475*uscfta)+uscturnovers);
        uscftpercentage = (uscftm/uscfta)*100;
        uscreboundspergame = (uscrebounds/uscgamesplayed);
        uscoffreboundspergame = (uscoffrebounds/uscgamesplayed);
        uscdefreboundspergame = (uscdefrebounds/uscgamesplayed);
        uscpossessions = (0.5 * (uscfga + (0.475 * uscfta) - uscoffrebounds + uscturnovers) + 0.5 * (uscoppfga + (0.475 * uscoppfta) - uscopporb + usctoforced));
        uscdefrating = 100*(uscpointsallowed/uscpossessions);
        usceffectivefgpercentage = ((uscfgm+(0.5*usc3ptfgm))/uscfga)*100;
        uscteamgamescore = ((uscpointsscored + (0.4 * uscfgm) - (0.7 * uscfga) - (0.4*(uscfta - uscftm)) + (0.7 * uscoffrebounds) + (0.3 * uscdefrebounds) + uscsteals + (0.7 * uscassists) + (0.7 * uscblocks) - (0.4 * uscfouls) - uscturnovers)/8)/uscgamesplayed;
        uscnetrating = 100 * ((uscpointsscored - uscpointsallowed) / uscpossessions);
        uscoffensiverating = 100 * (uscpointsscored / uscpossessions);
        uscpace = 40 * (uscpossessions / (0.2 * uscminutesplayed));
        usctrueshootingpercentage = (uscpointsscored / (2 * (uscfga + 0.475 * uscfta)))*100;
        System.out.println("\nUSC:\n" + uscwinpercentage + "% Win Percentage\n" + uscppg +
                " Points Per Game\n"+uscpapg+ " Points Allowed Per Game\n"+uscfgptg+
                "% Field Goal Percentage\n"+usc2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +usc3ptfgptg+"% 3 Point Field Goal Percentage\n"+uscassistspergame+" Assists Per Game\n"+
                uscassistsperfgm+" Assists Per FGM\n"+ uscassiststoturnoverratio+" Assists : TO Ratio\n"+
                uscblockspergame+" Blocks Per Game\n"+uscstealspergame+" Steals Per Game\n"+
                uscturnoverspergame+" TO Per Game\n"+uscturnoverpercentage+" TO%\n"+ uscftpercentage+" FT%\n"+
                uscreboundspergame+" Rebounds Per Game\n"+uscoffreboundspergame+" Offensive Rebounds Per game\n"+
                uscdefreboundspergame+" Defensive Rebounds Per Game\n"+uscpossessions+" Possessions\n"+
                uscdefrating+" Defensive Rating\n"+usceffectivefgpercentage+" EFG%\n"+uscteamgamescore+" Team Game Score\n"
                +uscnetrating+" Net Rating\n"+uscoffensiverating+" Offensive Rating\n"+uscpace+" Pace\n"+usctrueshootingpercentage+" True Shooting Percentage");

        double oklahomawins = 11;
        double oklahomagamesplayed = 31;
        double oklahomawinpercentage = 0;
        double oklahomapointsscored = 2262;
        double oklahomappg = 0;
        double oklahomapointsallowed = 2299;
        double oklahomapapg = 0;
        double oklahomafgm = 788;
        double oklahomafga = 1863;
        double oklahomafgptg = 0;
        double oklahoma2ptfgm = 596;
        double oklahoma2ptfga = 1305;
        double oklahoma2ptfgptg = 0;
        double oklahoma3ptfgm = 192;
        double oklahoma3ptfga = 558;
        double oklahoma3ptfgptg = 0;
        double oklahomaassists = 328;
        double oklahomaassistspergame = 0;
        double oklahomaassistsperfgm = 0;
        double oklahomaassiststoturnoverratio = 0;
        double oklahomaturnovers = 428;
        double oklahomaturnoverspergame = 0;
        double oklahomablocks = 147;
        double oklahomablockspergame = 0;
        double oklahomasteals = 213;
        double oklahomastealspergame = 0;
        double oklahomafta = 685;
        double oklahomaftm = 494;
        double oklahomaturnoverpercentage = 0;
        double oklahomaftpercentage = 0;
        double oklahomarebounds = 1173;
        double oklahomaoffrebounds = 361;
        double oklahomadefrebounds = 812;
        double oklahomareboundspergame = 0;
        double oklahomaoffreboundspergame = 0;
        double oklahomadefreboundspergame = 0;
        double oklahomapossessions = 0;
        double oklahomaoppfga = 1871;
        double oklahomaoppfta = 627;
        double oklahomaopporb = 344;
        double oklahomatoforced = 415;
        double oklahomadefrating = 0;
        double oklahomaeffectivefgpercentage = 0;
        double oklahomateamgamescore = 0;
        double oklahomafouls = 602;
        double oklahomanetrating = 0;
        double oklahomaoffensiverating = 0;
        double oklahomapace = 0;
        double oklahomaminutesplayed = 6325;
        double oklahomatrueshootingpercentage = 0;
        oklahomawinpercentage = (oklahomawins/oklahomagamesplayed)*100;
        oklahomappg = (oklahomapointsscored/oklahomagamesplayed);
        oklahomapapg = (oklahomapointsallowed/oklahomagamesplayed);
        oklahomafgptg = (oklahomafgm/oklahomafga)*100;
        oklahoma2ptfgptg = (oklahoma2ptfgm/oklahoma2ptfga)*100;
        oklahoma3ptfgptg = (oklahoma3ptfgm/oklahoma3ptfga)*100;
        oklahomaassistspergame = (oklahomaassists/oklahomagamesplayed);
        oklahomaassistsperfgm = (oklahomaassists/oklahomafgm);
        oklahomaassiststoturnoverratio = (oklahomaassists/oklahomaturnovers);
        oklahomablockspergame = (oklahomablocks/oklahomagamesplayed);
        oklahomastealspergame = (oklahomasteals/oklahomagamesplayed);
        oklahomaturnoverspergame = (oklahomaturnovers/oklahomagamesplayed);
        oklahomaturnoverpercentage = (100*oklahomaturnovers)/(oklahomafga+(0.475*oklahomafta)+oklahomaturnovers);
        oklahomaftpercentage = (oklahomaftm/oklahomafta)*100;
        oklahomareboundspergame = (oklahomarebounds/oklahomagamesplayed);
        oklahomaoffreboundspergame = (oklahomaoffrebounds/oklahomagamesplayed);
        oklahomadefreboundspergame = (oklahomadefrebounds/oklahomagamesplayed);
        oklahomapossessions = (0.5 * (oklahomafga + (0.475 * oklahomafta) - oklahomaoffrebounds + oklahomaturnovers) + 0.5 * (oklahomaoppfga + (0.475 * oklahomaoppfta) - oklahomaopporb + oklahomatoforced));
        oklahomadefrating = 100*(oklahomapointsallowed/oklahomapossessions);
        oklahomaeffectivefgpercentage = ((oklahomafgm+(0.5*oklahoma3ptfgm))/oklahomafga)*100;
        oklahomateamgamescore = ((oklahomapointsscored + (0.4 * oklahomafgm) - (0.7 * oklahomafga) - (0.4*(oklahomafta - oklahomaftm)) + (0.7 * oklahomaoffrebounds) + (0.3 * oklahomadefrebounds) + oklahomasteals + (0.7 * oklahomaassists) + (0.7 * oklahomablocks) - (0.4 * oklahomafouls) - oklahomaturnovers)/8)/oklahomagamesplayed;
        oklahomanetrating = 100 * ((oklahomapointsscored - oklahomapointsallowed) / oklahomapossessions);
        oklahomaoffensiverating = 100 * (oklahomapointsscored / oklahomapossessions);
        oklahomapace = 40 * (oklahomapossessions / (0.2 * oklahomaminutesplayed));
        oklahomatrueshootingpercentage = (oklahomapointsscored / (2 * (oklahomafga + 0.475 * oklahomafta)))*100;
        System.out.println("\nOklahoma:\n" + oklahomawinpercentage + "% Win Percentage\n" + oklahomappg +
                " Points Per Game\n"+oklahomapapg+ " Points Allowed Per Game\n"+oklahomafgptg+
                "% Field Goal Percentage\n"+oklahoma2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +oklahoma3ptfgptg+"% 3 Point Field Goal Percentage\n"+oklahomaassistspergame+" Assists Per Game\n"+
                oklahomaassistsperfgm+" Assists Per FGM\n"+ oklahomaassiststoturnoverratio+" Assists : TO Ratio\n"+
                oklahomablockspergame+" Blocks Per Game\n"+oklahomastealspergame+" Steals Per Game\n"+
                oklahomaturnoverspergame+" TO Per Game\n"+oklahomaturnoverpercentage+" TO%\n"+ oklahomaftpercentage+" FT%\n"+
                oklahomareboundspergame+" Rebounds Per Game\n"+oklahomaoffreboundspergame+" Offensive Rebounds Per game\n"+
                oklahomadefreboundspergame+" Defensive Rebounds Per Game\n"+oklahomapossessions+" Possessions\n"+
                oklahomadefrating+" Defensive Rating\n"+oklahomaeffectivefgpercentage+" EFG%\n"+oklahomateamgamescore+" Team Game Score\n"
                +oklahomanetrating+" Net Rating\n"+oklahomaoffensiverating+" Offensive Rating\n"+oklahomapace+" Pace\n"+oklahomatrueshootingpercentage+" True Shooting Percentage");

        double alabamawins = 19;
        double alabamagamesplayed = 34;
        double alabamawinpercentage = 0;
        double alabamapointsscored = 2330;
        double alabamappg = 0;
        double alabamapointsallowed = 2200;
        double alabamapapg = 0;
        double alabamafgm = 809;
        double alabamafga = 1909;
        double alabamafgptg = 0;
        double alabama2ptfgm = 584;
        double alabama2ptfga = 1199;
        double alabama2ptfgptg = 0;
        double alabama3ptfgm = 225;
        double alabama3ptfga = 710;
        double alabama3ptfgptg = 0;
        double alabamaassists = 390;
        double alabamaassistspergame = 0;
        double alabamaassistsperfgm = 0;
        double alabamaassiststoturnoverratio = 0;
        double alabamaturnovers = 473;
        double alabamaturnoverspergame = 0;
        double alabamablocks = 141;
        double alabamablockspergame = 0;
        double alabamasteals = 200;
        double alabamastealspergame = 0;
        double alabamafta = 746;
        double alabamaftm = 487;
        double alabamaturnoverpercentage = 0;
        double alabamaftpercentage = 0;
        double alabamarebounds = 1327;
        double alabamaoffrebounds = 418;
        double alabamadefrebounds = 909;
        double alabamareboundspergame = 0;
        double alabamaoffreboundspergame = 0;
        double alabamadefreboundspergame = 0;
        double alabamapossessions = 0;
        double alabamaoppfga = 1848;
        double alabamaoppfta = 738;
        double alabamaopporb = 329;
        double alabamatoforced = 460;
        double alabamadefrating = 0;
        double alabamaeffectivefgpercentage = 0;
        double alabamateamgamescore = 0;
        double alabamafouls = 664;
        double alabamanetrating = 0;
        double alabamaoffensiverating = 0;
        double alabamapace = 0;
        double alabamaminutesplayed = 6900;
        double alabamatrueshootingpercentage = 0;
        alabamawinpercentage = (alabamawins/alabamagamesplayed)*100;
        alabamappg = (alabamapointsscored/alabamagamesplayed);
        alabamapapg = (alabamapointsallowed/alabamagamesplayed);
        alabamafgptg = (alabamafgm/alabamafga)*100;
        alabama2ptfgptg = (alabama2ptfgm/alabama2ptfga)*100;
        alabama3ptfgptg = (alabama3ptfgm/alabama3ptfga)*100;
        alabamaassistspergame = (alabamaassists/alabamagamesplayed);
        alabamaassistsperfgm = (alabamaassists/alabamafgm);
        alabamaassiststoturnoverratio = (alabamaassists/alabamaturnovers);
        alabamablockspergame = (alabamablocks/alabamagamesplayed);
        alabamastealspergame = (alabamasteals/alabamagamesplayed);
        alabamaturnoverspergame = (alabamaturnovers/alabamagamesplayed);
        alabamaturnoverpercentage = (100*alabamaturnovers)/(alabamafga+(0.475*alabamafta)+alabamaturnovers);
        alabamaftpercentage = (alabamaftm/alabamafta)*100;
        alabamareboundspergame = (alabamarebounds/alabamagamesplayed);
        alabamaoffreboundspergame = (alabamaoffrebounds/alabamagamesplayed);
        alabamadefreboundspergame = (alabamadefrebounds/alabamagamesplayed);
        alabamapossessions = (0.5 * (alabamafga + (0.475 * alabamafta) - alabamaoffrebounds + alabamaturnovers) + 0.5 * (alabamaoppfga + (0.475 * alabamaoppfta) - alabamaopporb + alabamatoforced));
        alabamadefrating = 100*(alabamapointsallowed/alabamapossessions);
        alabamaeffectivefgpercentage = ((alabamafgm+(0.5*alabama3ptfgm))/alabamafga)*100;
        alabamateamgamescore = ((alabamapointsscored + (0.4 * alabamafgm) - (0.7 * alabamafga) - (0.4*(alabamafta - alabamaftm)) + (0.7 * alabamaoffrebounds) + (0.3 * alabamadefrebounds) + alabamasteals + (0.7 * alabamaassists) + (0.7 * alabamablocks) - (0.4 * alabamafouls) - alabamaturnovers)/8)/alabamagamesplayed;
        alabamanetrating = 100 * ((alabamapointsscored - alabamapointsallowed) / alabamapossessions);
        alabamaoffensiverating = 100 * (alabamapointsscored / alabamapossessions);
        alabamapace = 40 * (alabamapossessions / (0.2 * alabamaminutesplayed));
        alabamatrueshootingpercentage = (alabamapointsscored / (2 * (alabamafga + 0.475 * alabamafta)))*100;
        System.out.println("\nAlabama:\n" + alabamawinpercentage + "% Win Percentage\n" + alabamappg +
                " Points Per Game\n"+alabamapapg+ " Points Allowed Per Game\n"+alabamafgptg+
                "% Field Goal Percentage\n"+alabama2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +alabama3ptfgptg+"% 3 Point Field Goal Percentage\n"+alabamaassistspergame+" Assists Per Game\n"+
                alabamaassistsperfgm+" Assists Per FGM\n"+ alabamaassiststoturnoverratio+" Assists : TO Ratio\n"+
                alabamablockspergame+" Blocks Per Game\n"+alabamastealspergame+" Steals Per Game\n"+
                alabamaturnoverspergame+" TO Per Game\n"+alabamaturnoverpercentage+" TO%\n"+ alabamaftpercentage+" FT%\n"+
                alabamareboundspergame+" Rebounds Per Game\n"+alabamaoffreboundspergame+" Offensive Rebounds Per game\n"+
                alabamadefreboundspergame+" Defensive Rebounds Per Game\n"+alabamapossessions+" Possessions\n"+
                alabamadefrating+" Defensive Rating\n"+alabamaeffectivefgpercentage+" EFG%\n"+alabamateamgamescore+" Team Game Score\n"
                +alabamanetrating+" Net Rating\n"+alabamaoffensiverating+" Offensive Rating\n"+alabamapace+" Pace\n"+alabamatrueshootingpercentage+" True Shooting Percentage");

        double tennesseewins = 16;
        double tennesseegamesplayed = 32;
        double tennesseewinpercentage = 0;
        double tennesseepointsscored = 2383;
        double tennesseeppg = 0;
        double tennesseepointsallowed = 2335;
        double tennesseepapg = 0;
        double tennesseefgm = 803;
        double tennesseefga = 1903;
        double tennesseefgptg = 0;
        double tennessee2ptfgm = 614;
        double tennessee2ptfga = 1324;
        double tennessee2ptfgptg = 0;
        double tennessee3ptfgm = 189;
        double tennessee3ptfga = 579;
        double tennessee3ptfgptg = 0;
        double tennesseeassists = 441;
        double tennesseeassistspergame = 0;
        double tennesseeassistsperfgm = 0;
        double tennesseeassiststoturnoverratio = 0;
        double tennesseeturnovers = 400;
        double tennesseeturnoverspergame = 0;
        double tennesseeblocks = 146;
        double tennesseeblockspergame = 0;
        double tennesseesteals = 175;
        double tennesseestealspergame = 0;
        double tennesseefta = 807;
        double tennesseeftm = 588;
        double tennesseeturnoverpercentage = 0;
        double tennesseeftpercentage = 0;
        double tennesseerebounds = 1206;
        double tennesseeoffrebounds = 388;
        double tennesseedefrebounds = 818;
        double tennesseereboundspergame = 0;
        double tennesseeoffreboundspergame = 0;
        double tennesseedefreboundspergame = 0;
        double tennesseepossessions = 0;
        double tennesseeoppfga = 1832;
        double tennesseeoppfta = 787;
        double tennesseeopporb = 355;
        double tennesseetoforced = 447;
        double tennesseedefrating = 0;
        double tennesseeeffectivefgpercentage = 0;
        double tennesseeteamgamescore = 0;
        double tennesseefouls = 670;
        double tennesseenetrating = 0;
        double tennesseeoffensiverating = 0;
        double tennesseepace = 0;
        double tennesseeminutesplayed = 6425;
        double tennesseetrueshootingpercentage = 0;
        tennesseewinpercentage = (tennesseewins/tennesseegamesplayed)*100;
        tennesseeppg = (tennesseepointsscored/tennesseegamesplayed);
        tennesseepapg = (tennesseepointsallowed/tennesseegamesplayed);
        tennesseefgptg = (tennesseefgm/tennesseefga)*100;
        tennessee2ptfgptg = (tennessee2ptfgm/tennessee2ptfga)*100;
        tennessee3ptfgptg = (tennessee3ptfgm/tennessee3ptfga)*100;
        tennesseeassistspergame = (tennesseeassists/tennesseegamesplayed);
        tennesseeassistsperfgm = (tennesseeassists/tennesseefgm);
        tennesseeassiststoturnoverratio = (tennesseeassists/tennesseeturnovers);
        tennesseeblockspergame = (tennesseeblocks/tennesseegamesplayed);
        tennesseestealspergame = (tennesseesteals/tennesseegamesplayed);
        tennesseeturnoverspergame = (tennesseeturnovers/tennesseegamesplayed);
        tennesseeturnoverpercentage = (100*tennesseeturnovers)/(tennesseefga+(0.475*tennesseefta)+tennesseeturnovers);
        tennesseeftpercentage = (tennesseeftm/tennesseefta)*100;
        tennesseereboundspergame = (tennesseerebounds/tennesseegamesplayed);
        tennesseeoffreboundspergame = (tennesseeoffrebounds/tennesseegamesplayed);
        tennesseedefreboundspergame = (tennesseedefrebounds/tennesseegamesplayed);
        tennesseepossessions = (0.5 * (tennesseefga + (0.475 * tennesseefta) - tennesseeoffrebounds + tennesseeturnovers) + 0.5 * (tennesseeoppfga + (0.475 * tennesseeoppfta) - tennesseeopporb + tennesseetoforced));
        tennesseedefrating = 100*(tennesseepointsallowed/tennesseepossessions);
        tennesseeeffectivefgpercentage = ((tennesseefgm+(0.5*tennessee3ptfgm))/tennesseefga)*100;
        tennesseeteamgamescore = ((tennesseepointsscored + (0.4 * tennesseefgm) - (0.7 * tennesseefga) - (0.4*(tennesseefta - tennesseeftm)) + (0.7 * tennesseeoffrebounds) + (0.3 * tennesseedefrebounds) + tennesseesteals + (0.7 * tennesseeassists) + (0.7 * tennesseeblocks) - (0.4 * tennesseefouls) - tennesseeturnovers)/8)/tennesseegamesplayed;
        tennesseenetrating = 100 * ((tennesseepointsscored - tennesseepointsallowed) / tennesseepossessions);
        tennesseeoffensiverating = 100 * (tennesseepointsscored / tennesseepossessions);
        tennesseepace = 40 * (tennesseepossessions / (0.2 * tennesseeminutesplayed));
        tennesseetrueshootingpercentage = (tennesseepointsscored / (2 * (tennesseefga + 0.475 * tennesseefta)))*100;
        System.out.println("\nTennessee:\n" + tennesseewinpercentage + "% Win Percentage\n" + tennesseeppg +
                " Points Per Game\n"+tennesseepapg+ " Points Allowed Per Game\n"+tennesseefgptg+
                "% Field Goal Percentage\n"+tennessee2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +tennessee3ptfgptg+"% 3 Point Field Goal Percentage\n"+tennesseeassistspergame+" Assists Per Game\n"+
                tennesseeassistsperfgm+" Assists Per FGM\n"+ tennesseeassiststoturnoverratio+" Assists : TO Ratio\n"+
                tennesseeblockspergame+" Blocks Per Game\n"+tennesseestealspergame+" Steals Per Game\n"+
                tennesseeturnoverspergame+" TO Per Game\n"+tennesseeturnoverpercentage+" TO%\n"+ tennesseeftpercentage+" FT%\n"+
                tennesseereboundspergame+" Rebounds Per Game\n"+tennesseeoffreboundspergame+" Offensive Rebounds Per game\n"+
                tennesseedefreboundspergame+" Defensive Rebounds Per Game\n"+tennesseepossessions+" Possessions\n"+
                tennesseedefrating+" Defensive Rating\n"+tennesseeeffectivefgpercentage+" EFG%\n"+tennesseeteamgamescore+" Team Game Score\n"
                +tennesseenetrating+" Net Rating\n"+tennesseeoffensiverating+" Offensive Rating\n"+tennesseepace+" Pace\n"+tennesseetrueshootingpercentage+" True Shooting Percentage");

        double providencewins = 20;
        double providencegamesplayed = 33;
        double providencewinpercentage = 0;
        double providencepointsscored = 2319;
        double providenceppg = 0;
        double providencepointsallowed = 2207;
        double providencepapg = 0;
        double providencefgm = 804;
        double providencefga = 1795;
        double providencefgptg = 0;
        double providence2ptfgm = 565;
        double providence2ptfga = 1150;
        double providence2ptfgptg = 0;
        double providence3ptfgm = 239;
        double providence3ptfga = 645;
        double providence3ptfgptg = 0;
        double providenceassists = 471;
        double providenceassistspergame = 0;
        double providenceassistsperfgm = 0;
        double providenceassiststoturnoverratio = 0;
        double providenceturnovers = 412;
        double providenceturnoverspergame = 0;
        double providenceblocks = 98;
        double providenceblockspergame = 0;
        double providencesteals = 218;
        double providencestealspergame = 0;
        double providencefta = 683;
        double providenceftm = 472;
        double providenceturnoverpercentage = 0;
        double providenceftpercentage = 0;
        double providencerebounds = 1101;
        double providenceoffrebounds = 293;
        double providencedefrebounds = 808;
        double providencereboundspergame = 0;
        double providenceoffreboundspergame = 0;
        double providencedefreboundspergame = 0;
        double providencepossessions = 0;
        double providenceoppfga = 1840;
        double providenceoppfta = 562;
        double providenceopporb = 322;
        double providencetoforced = 454;
        double providencedefrating = 0;
        double providenceeffectivefgpercentage = 0;
        double providenceteamgamescore = 0;
        double providencefouls = 569;
        double providencenetrating = 0;
        double providenceoffensiverating = 0;
        double providencepace = 0;
        double providenceminutesplayed = 6625;
        double providencetrueshootingpercentage = 0;
        providencewinpercentage = (providencewins/providencegamesplayed)*100;
        providenceppg = (providencepointsscored/providencegamesplayed);
        providencepapg = (providencepointsallowed/providencegamesplayed);
        providencefgptg = (providencefgm/providencefga)*100;
        providence2ptfgptg = (providence2ptfgm/providence2ptfga)*100;
        providence3ptfgptg = (providence3ptfgm/providence3ptfga)*100;
        providenceassistspergame = (providenceassists/providencegamesplayed);
        providenceassistsperfgm = (providenceassists/providencefgm);
        providenceassiststoturnoverratio = (providenceassists/providenceturnovers);
        providenceblockspergame = (providenceblocks/providencegamesplayed);
        providencestealspergame = (providencesteals/providencegamesplayed);
        providenceturnoverspergame = (providenceturnovers/providencegamesplayed);
        providenceturnoverpercentage = (100*providenceturnovers)/(providencefga+(0.475*providencefta)+providenceturnovers);
        providenceftpercentage = (providenceftm/providencefta)*100;
        providencereboundspergame = (providencerebounds/providencegamesplayed);
        providenceoffreboundspergame = (providenceoffrebounds/providencegamesplayed);
        providencedefreboundspergame = (providencedefrebounds/providencegamesplayed);
        providencepossessions = (0.5 * (providencefga + (0.475 * providencefta) - providenceoffrebounds + providenceturnovers) + 0.5 * (providenceoppfga + (0.475 * providenceoppfta) - providenceopporb + providencetoforced));
        providencedefrating = 100*(providencepointsallowed/providencepossessions);
        providenceeffectivefgpercentage = ((providencefgm+(0.5*providence3ptfgm))/providencefga)*100;
        providenceteamgamescore = ((providencepointsscored + (0.4 * providencefgm) - (0.7 * providencefga) - (0.4*(providencefta - providenceftm)) + (0.7 * providenceoffrebounds) + (0.3 * providencedefrebounds) + providencesteals + (0.7 * providenceassists) + (0.7 * providenceblocks) - (0.4 * providencefouls) - providenceturnovers)/8)/providencegamesplayed;
        providencenetrating = 100 * ((providencepointsscored - providencepointsallowed) / providencepossessions);
        providenceoffensiverating = 100 * (providencepointsscored / providencepossessions);
        providencepace = 40 * (providencepossessions / (0.2 * providenceminutesplayed));
        providencetrueshootingpercentage = (providencepointsscored / (2 * (providencefga + 0.475 * providencefta)))*100;
        System.out.println("\nProvidence:\n" + providencewinpercentage + "% Win Percentage\n" + providenceppg +
                " Points Per Game\n"+providencepapg+ " Points Allowed Per Game\n"+providencefgptg+
                "% Field Goal Percentage\n"+providence2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +providence3ptfgptg+"% 3 Point Field Goal Percentage\n"+providenceassistspergame+" Assists Per Game\n"+
                providenceassistsperfgm+" Assists Per FGM\n"+ providenceassiststoturnoverratio+" Assists : TO Ratio\n"+
                providenceblockspergame+" Blocks Per Game\n"+providencestealspergame+" Steals Per Game\n"+
                providenceturnoverspergame+" TO Per Game\n"+providenceturnoverpercentage+" TO%\n"+ providenceftpercentage+" FT%\n"+
                providencereboundspergame+" Rebounds Per Game\n"+providenceoffreboundspergame+" Offensive Rebounds Per game\n"+
                providencedefreboundspergame+" Defensive Rebounds Per Game\n"+providencepossessions+" Possessions\n"+
                providencedefrating+" Defensive Rating\n"+providenceeffectivefgpercentage+" EFG%\n"+providenceteamgamescore+" Team Game Score\n"
                +providencenetrating+" Net Rating\n"+providenceoffensiverating+" Offensive Rating\n"+providencepace+" Pace\n"+providencetrueshootingpercentage+" True Shooting Percentage");

        double georgetownwins = 14;
        double georgetowngamesplayed = 32;
        double georgetownwinpercentage = 0;
        double georgetownpointsscored = 2369;
        double georgetownppg = 0;
        double georgetownpointsallowed = 2309;
        double georgetownpapg = 0;
        double georgetownfgm = 808;
        double georgetownfga = 1752;
        double georgetownfgptg = 0;
        double georgetown2ptfgm = 602;
        double georgetown2ptfga = 1162;
        double georgetown2ptfgptg = 0;
        double georgetown3ptfgm = 206;
        double georgetown3ptfga = 590;
        double georgetown3ptfgptg = 0;
        double georgetownassists = 480;
        double georgetownassistspergame = 0;
        double georgetownassistsperfgm = 0;
        double georgetownassiststoturnoverratio = 0;
        double georgetownturnovers = 456;
        double georgetownturnoverspergame = 0;
        double georgetownblocks = 147;
        double georgetownblockspergame = 0;
        double georgetownsteals = 175;
        double georgetownstealspergame = 0;
        double georgetownfta = 746;
        double georgetownftm = 547;
        double georgetownturnoverpercentage = 0;
        double georgetownftpercentage = 0;
        double georgetownrebounds = 1142;
        double georgetownoffrebounds = 304;
        double georgetowndefrebounds = 838;
        double georgetownreboundspergame = 0;
        double georgetownoffreboundspergame = 0;
        double georgetowndefreboundspergame = 0;
        double georgetownpossessions = 0;
        double georgetownoppfga = 1893;
        double georgetownoppfta = 735;
        double georgetownopporb = 364;
        double georgetowntoforced = 393;
        double georgetowndefrating = 0;
        double georgetowneffectivefgpercentage = 0;
        double georgetownteamgamescore = 0;
        double georgetownfouls = 672;
        double georgetownnetrating = 0;
        double georgetownoffensiverating = 0;
        double georgetownpace = 0;
        double georgetownminutesplayed = 6450;
        double georgetowntrueshootingpercentage = 0;
        georgetownwinpercentage = (georgetownwins/georgetowngamesplayed)*100;
        georgetownppg = (georgetownpointsscored/georgetowngamesplayed);
        georgetownpapg = (georgetownpointsallowed/georgetowngamesplayed);
        georgetownfgptg = (georgetownfgm/georgetownfga)*100;
        georgetown2ptfgptg = (georgetown2ptfgm/georgetown2ptfga)*100;
        georgetown3ptfgptg = (georgetown3ptfgm/georgetown3ptfga)*100;
        georgetownassistspergame = (georgetownassists/georgetowngamesplayed);
        georgetownassistsperfgm = (georgetownassists/georgetownfgm);
        georgetownassiststoturnoverratio = (georgetownassists/georgetownturnovers);
        georgetownblockspergame = (georgetownblocks/georgetowngamesplayed);
        georgetownstealspergame = (georgetownsteals/georgetowngamesplayed);
        georgetownturnoverspergame = (georgetownturnovers/georgetowngamesplayed);
        georgetownturnoverpercentage = (100*georgetownturnovers)/(georgetownfga+(0.475*georgetownfta)+georgetownturnovers);
        georgetownftpercentage = (georgetownftm/georgetownfta)*100;
        georgetownreboundspergame = (georgetownrebounds/georgetowngamesplayed);
        georgetownoffreboundspergame = (georgetownoffrebounds/georgetowngamesplayed);
        georgetowndefreboundspergame = (georgetowndefrebounds/georgetowngamesplayed);
        georgetownpossessions = (0.5 * (georgetownfga + (0.475 * georgetownfta) - georgetownoffrebounds + georgetownturnovers) + 0.5 * (georgetownoppfga + (0.475 * georgetownoppfta) - georgetownopporb + georgetowntoforced));
        georgetowndefrating = 100*(georgetownpointsallowed/georgetownpossessions);
        georgetowneffectivefgpercentage = ((georgetownfgm+(0.5*georgetown3ptfgm))/georgetownfga)*100;
        georgetownteamgamescore = ((georgetownpointsscored + (0.4 * georgetownfgm) - (0.7 * georgetownfga) - (0.4*(georgetownfta - georgetownftm)) + (0.7 * georgetownoffrebounds) + (0.3 * georgetowndefrebounds) + georgetownsteals + (0.7 * georgetownassists) + (0.7 * georgetownblocks) - (0.4 * georgetownfouls) - georgetownturnovers)/8)/georgetowngamesplayed;
        georgetownnetrating = 100 * ((georgetownpointsscored - georgetownpointsallowed) / georgetownpossessions);
        georgetownoffensiverating = 100 * (georgetownpointsscored / georgetownpossessions);
        georgetownpace = 40 * (georgetownpossessions / (0.2 * georgetownminutesplayed));
        georgetowntrueshootingpercentage = (georgetownpointsscored / (2 * (georgetownfga + 0.475 * georgetownfta)))*100;
        System.out.println("\nGeorgetown:\n" + georgetownwinpercentage + "% Win Percentage\n" + georgetownppg +
                " Points Per Game\n"+georgetownpapg+ " Points Allowed Per Game\n"+georgetownfgptg+
                "% Field Goal Percentage\n"+georgetown2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +georgetown3ptfgptg+"% 3 Point Field Goal Percentage\n"+georgetownassistspergame+" Assists Per Game\n"+
                georgetownassistsperfgm+" Assists Per FGM\n"+ georgetownassiststoturnoverratio+" Assists : TO Ratio\n"+
                georgetownblockspergame+" Blocks Per Game\n"+georgetownstealspergame+" Steals Per Game\n"+
                georgetownturnoverspergame+" TO Per Game\n"+georgetownturnoverpercentage+" TO%\n"+ georgetownftpercentage+" FT%\n"+
                georgetownreboundspergame+" Rebounds Per Game\n"+georgetownoffreboundspergame+" Offensive Rebounds Per game\n"+
                georgetowndefreboundspergame+" Defensive Rebounds Per Game\n"+georgetownpossessions+" Possessions\n"+
                georgetowndefrating+" Defensive Rating\n"+georgetowneffectivefgpercentage+" EFG%\n"+georgetownteamgamescore+" Team Game Score\n"
                +georgetownnetrating+" Net Rating\n"+georgetownoffensiverating+" Offensive Rating\n"+georgetownpace+" Pace\n"+georgetowntrueshootingpercentage+" True Shooting Percentage");

        double georgiawins = 19;
        double georgiagamesplayed = 34;
        double georgiawinpercentage = 0;
        double georgiapointsscored = 2435;
        double georgiappg = 0;
        double georgiapointsallowed = 2393;
        double georgiapapg = 0;
        double georgiafgm = 836;
        double georgiafga = 1903;
        double georgiafgptg = 0;
        double georgia2ptfgm = 661;
        double georgia2ptfga = 1365;
        double georgia2ptfgptg = 0;
        double georgia3ptfgm = 175;
        double georgia3ptfga = 538;
        double georgia3ptfgptg = 0;
        double georgiaassists = 429;
        double georgiaassistspergame = 0;
        double georgiaassistsperfgm = 0;
        double georgiaassiststoturnoverratio = 0;
        double georgiaturnovers = 444;
        double georgiaturnoverspergame = 0;
        double georgiablocks = 126;
        double georgiablockspergame = 0;
        double georgiasteals = 182;
        double georgiastealspergame = 0;
        double georgiafta = 777;
        double georgiaftm = 588;
        double georgiaturnoverpercentage = 0;
        double georgiaftpercentage = 0;
        double georgiarebounds = 1259;
        double georgiaoffrebounds = 330;
        double georgiadefrebounds = 929;
        double georgiareboundspergame = 0;
        double georgiaoffreboundspergame = 0;
        double georgiadefreboundspergame = 0;
        double georgiapossessions = 0;
        double georgiaoppfga = 2024;
        double georgiaoppfta = 692;
        double georgiaopporb = 365;
        double georgiatoforced = 402;
        double georgiadefrating = 0;
        double georgiaeffectivefgpercentage = 0;
        double georgiateamgamescore = 0;
        double georgiafouls = 632;
        double georgianetrating = 0;
        double georgiaoffensiverating = 0;
        double georgiapace = 0;
        double georgiaminutesplayed = 6850;
        double georgiatrueshootingpercentage = 0;
        georgiawinpercentage = (georgiawins/georgiagamesplayed)*100;
        georgiappg = (georgiapointsscored/georgiagamesplayed);
        georgiapapg = (georgiapointsallowed/georgiagamesplayed);
        georgiafgptg = (georgiafgm/georgiafga)*100;
        georgia2ptfgptg = (georgia2ptfgm/georgia2ptfga)*100;
        georgia3ptfgptg = (georgia3ptfgm/georgia3ptfga)*100;
        georgiaassistspergame = (georgiaassists/georgiagamesplayed);
        georgiaassistsperfgm = (georgiaassists/georgiafgm);
        georgiaassiststoturnoverratio = (georgiaassists/georgiaturnovers);
        georgiablockspergame = (georgiablocks/georgiagamesplayed);
        georgiastealspergame = (georgiasteals/georgiagamesplayed);
        georgiaturnoverspergame = (georgiaturnovers/georgiagamesplayed);
        georgiaturnoverpercentage = (100*georgiaturnovers)/(georgiafga+(0.475*georgiafta)+georgiaturnovers);
        georgiaftpercentage = (georgiaftm/georgiafta)*100;
        georgiareboundspergame = (georgiarebounds/georgiagamesplayed);
        georgiaoffreboundspergame = (georgiaoffrebounds/georgiagamesplayed);
        georgiadefreboundspergame = (georgiadefrebounds/georgiagamesplayed);
        georgiapossessions = (0.5 * (georgiafga + (0.475 * georgiafta) - georgiaoffrebounds + georgiaturnovers) + 0.5 * (georgiaoppfga + (0.475 * georgiaoppfta) - georgiaopporb + georgiatoforced));
        georgiadefrating = 100*(georgiapointsallowed/georgiapossessions);
        georgiaeffectivefgpercentage = ((georgiafgm+(0.5*georgia3ptfgm))/georgiafga)*100;
        georgiateamgamescore = ((georgiapointsscored + (0.4 * georgiafgm) - (0.7 * georgiafga) - (0.4*(georgiafta - georgiaftm)) + (0.7 * georgiaoffrebounds) + (0.3 * georgiadefrebounds) + georgiasteals + (0.7 * georgiaassists) + (0.7 * georgiablocks) - (0.4 * georgiafouls) - georgiaturnovers)/8)/georgiagamesplayed;
        georgianetrating = 100 * ((georgiapointsscored - georgiapointsallowed) / georgiapossessions);
        georgiaoffensiverating = 100 * (georgiapointsscored / georgiapossessions);
        georgiapace = 40 * (georgiapossessions / (0.2 * georgiaminutesplayed));
        georgiatrueshootingpercentage = (georgiapointsscored / (2 * (georgiafga + 0.475 * georgiafta)))*100;
        System.out.println("\nGeorgia:\n" + georgiawinpercentage + "% Win Percentage\n" + georgiappg +
                " Points Per Game\n"+georgiapapg+ " Points Allowed Per Game\n"+georgiafgptg+
                "% Field Goal Percentage\n"+georgia2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +georgia3ptfgptg+"% 3 Point Field Goal Percentage\n"+georgiaassistspergame+" Assists Per Game\n"+
                georgiaassistsperfgm+" Assists Per FGM\n"+ georgiaassiststoturnoverratio+" Assists : TO Ratio\n"+
                georgiablockspergame+" Blocks Per Game\n"+georgiastealspergame+" Steals Per Game\n"+
                georgiaturnoverspergame+" TO Per Game\n"+georgiaturnoverpercentage+" TO%\n"+ georgiaftpercentage+" FT%\n"+
                georgiareboundspergame+" Rebounds Per Game\n"+georgiaoffreboundspergame+" Offensive Rebounds Per game\n"+
                georgiadefreboundspergame+" Defensive Rebounds Per Game\n"+georgiapossessions+" Possessions\n"+
                georgiadefrating+" Defensive Rating\n"+georgiaeffectivefgpercentage+" EFG%\n"+georgiateamgamescore+" Team Game Score\n"
                +georgianetrating+" Net Rating\n"+georgiaoffensiverating+" Offensive Rating\n"+georgiapace+" Pace\n"+georgiatrueshootingpercentage+" True Shooting Percentage");

        double calwins = 21;
        double calgamesplayed = 34;
        double calwinpercentage = 0;
        double calpointsscored = 2316;
        double calppg = 0;
        double calpointsallowed = 2154;
        double calpapg = 0;
        double calfgm = 807;
        double calfga = 1911;
        double calfgptg = 0;
        double cal2ptfgm = 581;
        double cal2ptfga = 1247;
        double cal2ptfgptg = 0;
        double cal3ptfgm = 226;
        double cal3ptfga = 664;
        double cal3ptfgptg = 0;
        double calassists = 409;
        double calassistspergame = 0;
        double calassistsperfgm = 0;
        double calassiststoturnoverratio = 0;
        double calturnovers = 428;
        double calturnoverspergame = 0;
        double calblocks = 155;
        double calblockspergame = 0;
        double calsteals = 165;
        double calstealspergame = 0;
        double calfta = 720;
        double calftm = 476;
        double calturnoverpercentage = 0;
        double calftpercentage = 0;
        double calrebounds = 1323;
        double caloffrebounds = 394;
        double caldefrebounds = 929;
        double calreboundspergame = 0;
        double caloffreboundspergame = 0;
        double caldefreboundspergame = 0;
        double calpossessions = 0;
        double caloppfga = 1893;
        double caloppfta = 647;
        double calopporb = 292;
        double caltoforced = 379;
        double caldefrating = 0;
        double caleffectivefgpercentage = 0;
        double calteamgamescore = 0;
        double calfouls = 656;
        double calnetrating = 0;
        double caloffensiverating = 0;
        double calpace = 0;
        double calminutesplayed = 6900;
        double caltrueshootingpercentage = 0;
        calwinpercentage = (calwins/calgamesplayed)*100;
        calppg = (calpointsscored/calgamesplayed);
        calpapg = (calpointsallowed/calgamesplayed);
        calfgptg = (calfgm/calfga)*100;
        cal2ptfgptg = (cal2ptfgm/cal2ptfga)*100;
        cal3ptfgptg = (cal3ptfgm/cal3ptfga)*100;
        calassistspergame = (calassists/calgamesplayed);
        calassistsperfgm = (calassists/calfgm);
        calassiststoturnoverratio = (calassists/calturnovers);
        calblockspergame = (calblocks/calgamesplayed);
        calstealspergame = (calsteals/calgamesplayed);
        calturnoverspergame = (calturnovers/calgamesplayed);
        calturnoverpercentage = (100*calturnovers)/(calfga+(0.475*calfta)+calturnovers);
        calftpercentage = (calftm/calfta)*100;
        calreboundspergame = (calrebounds/calgamesplayed);
        caloffreboundspergame = (caloffrebounds/calgamesplayed);
        caldefreboundspergame = (caldefrebounds/calgamesplayed);
        calpossessions = (0.5 * (calfga + (0.475 * calfta) - caloffrebounds + calturnovers) + 0.5 * (caloppfga + (0.475 * caloppfta) - calopporb + caltoforced));
        caldefrating = 100*(calpointsallowed/calpossessions);
        caleffectivefgpercentage = ((calfgm+(0.5*cal3ptfgm))/calfga)*100;
        calteamgamescore = ((calpointsscored + (0.4 * calfgm) - (0.7 * calfga) - (0.4*(calfta - calftm)) + (0.7 * caloffrebounds) + (0.3 * caldefrebounds) + calsteals + (0.7 * calassists) + (0.7 * calblocks) - (0.4 * calfouls) - calturnovers)/8)/calgamesplayed;
        calnetrating = 100 * ((calpointsscored - calpointsallowed) / calpossessions);
        caloffensiverating = 100 * (calpointsscored / calpossessions);
        calpace = 40 * (calpossessions / (0.2 * calminutesplayed));
        caltrueshootingpercentage = (calpointsscored / (2 * (calfga + 0.475 * calfta)))*100;
        System.out.println("\nCal:\n" + calwinpercentage + "% Win Percentage\n" + calppg +
                " Points Per Game\n"+calpapg+ " Points Allowed Per Game\n"+calfgptg+
                "% Field Goal Percentage\n"+cal2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +cal3ptfgptg+"% 3 Point Field Goal Percentage\n"+calassistspergame+" Assists Per Game\n"+
                calassistsperfgm+" Assists Per FGM\n"+ calassiststoturnoverratio+" Assists : TO Ratio\n"+
                calblockspergame+" Blocks Per Game\n"+calstealspergame+" Steals Per Game\n"+
                calturnoverspergame+" TO Per Game\n"+calturnoverpercentage+" TO%\n"+ calftpercentage+" FT%\n"+
                calreboundspergame+" Rebounds Per Game\n"+caloffreboundspergame+" Offensive Rebounds Per game\n"+
                caldefreboundspergame+" Defensive Rebounds Per Game\n"+calpossessions+" Possessions\n"+
                caldefrating+" Defensive Rating\n"+caleffectivefgpercentage+" EFG%\n"+calteamgamescore+" Team Game Score\n"
                +calnetrating+" Net Rating\n"+caloffensiverating+" Offensive Rating\n"+calpace+" Pace\n"+caltrueshootingpercentage+" True Shooting Percentage");

        double texaswins = 11;
        double texasgamesplayed = 33;
        double texaswinpercentage = 0;
        double texaspointsscored = 2215;
        double texasppg = 0;
        double texaspointsallowed = 2273;
        double texaspapg = 0;
        double texasfgm = 810;
        double texasfga = 1846;
        double texasfgptg = 0;
        double texas2ptfgm = 629;
        double texas2ptfga = 1227;
        double texas2ptfgptg = 0;
        double texas3ptfgm = 181;
        double texas3ptfga = 619;
        double texas3ptfgptg = 0;
        double texasassists = 376;
        double texasassistspergame = 0;
        double texasassistsperfgm = 0;
        double texasassiststoturnoverratio = 0;
        double texasturnovers = 443;
        double texasturnoverspergame = 0;
        double texasblocks = 149;
        double texasblockspergame = 0;
        double texassteals = 190;
        double texasstealspergame = 0;
        double texasfta = 637;
        double texasftm = 414;
        double texasturnoverpercentage = 0;
        double texasftpercentage = 0;
        double texasrebounds = 1133;
        double texasoffrebounds = 323;
        double texasdefrebounds = 810;
        double texasreboundspergame = 0;
        double texasoffreboundspergame = 0;
        double texasdefreboundspergame = 0;
        double texaspossessions = 0;
        double texasoppfga = 1932;
        double texasoppfta = 580;
        double texasopporb = 367;
        double texastoforced = 414;
        double texasdefrating = 0;
        double texaseffectivefgpercentage = 0;
        double texasteamgamescore = 0;
        double texasfouls = 588;
        double texasnetrating = 0;
        double texasoffensiverating = 0;
        double texaspace = 0;
        double texasminutesplayed = 6600;
        double texastrueshootingpercentage = 0;
        texaswinpercentage = (texaswins/texasgamesplayed)*100;
        texasppg = (texaspointsscored/texasgamesplayed);
        texaspapg = (texaspointsallowed/texasgamesplayed);
        texasfgptg = (texasfgm/texasfga)*100;
        texas2ptfgptg = (texas2ptfgm/texas2ptfga)*100;
        texas3ptfgptg = (texas3ptfgm/texas3ptfga)*100;
        texasassistspergame = (texasassists/texasgamesplayed);
        texasassistsperfgm = (texasassists/texasfgm);
        texasassiststoturnoverratio = (texasassists/texasturnovers);
        texasblockspergame = (texasblocks/texasgamesplayed);
        texasstealspergame = (texassteals/texasgamesplayed);
        texasturnoverspergame = (texasturnovers/texasgamesplayed);
        texasturnoverpercentage = (100*texasturnovers)/(texasfga+(0.475*texasfta)+texasturnovers);
        texasftpercentage = (texasftm/texasfta)*100;
        texasreboundspergame = (texasrebounds/texasgamesplayed);
        texasoffreboundspergame = (texasoffrebounds/texasgamesplayed);
        texasdefreboundspergame = (texasdefrebounds/texasgamesplayed);
        texaspossessions = (0.5 * (texasfga + (0.475 * texasfta) - texasoffrebounds + texasturnovers) + 0.5 * (texasoppfga + (0.475 * texasoppfta) - texasopporb + texastoforced));
        texasdefrating = 100*(texaspointsallowed/texaspossessions);
        texaseffectivefgpercentage = ((texasfgm+(0.5*texas3ptfgm))/texasfga)*100;
        texasteamgamescore = ((texaspointsscored + (0.4 * texasfgm) - (0.7 * texasfga) - (0.4*(texasfta - texasftm)) + (0.7 * texasoffrebounds) + (0.3 * texasdefrebounds) + texassteals + (0.7 * texasassists) + (0.7 * texasblocks) - (0.4 * texasfouls) - texasturnovers)/8)/texasgamesplayed;
        texasnetrating = 100 * ((texaspointsscored - texaspointsallowed) / texaspossessions);
        texasoffensiverating = 100 * (texaspointsscored / texaspossessions);
        texaspace = 40 * (texaspossessions / (0.2 * texasminutesplayed));
        texastrueshootingpercentage = (texaspointsscored / (2 * (texasfga + 0.475 * texasfta)))*100;
        System.out.println("\nTexas:\n" + texaswinpercentage + "% Win Percentage\n" + texasppg +
                " Points Per Game\n"+texaspapg+ " Points Allowed Per Game\n"+texasfgptg+
                "% Field Goal Percentage\n"+texas2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +texas3ptfgptg+"% 3 Point Field Goal Percentage\n"+texasassistspergame+" Assists Per Game\n"+
                texasassistsperfgm+" Assists Per FGM\n"+ texasassiststoturnoverratio+" Assists : TO Ratio\n"+
                texasblockspergame+" Blocks Per Game\n"+texasstealspergame+" Steals Per Game\n"+
                texasturnoverspergame+" TO Per Game\n"+texasturnoverpercentage+" TO%\n"+ texasftpercentage+" FT%\n"+
                texasreboundspergame+" Rebounds Per Game\n"+texasoffreboundspergame+" Offensive Rebounds Per game\n"+
                texasdefreboundspergame+" Defensive Rebounds Per Game\n"+texaspossessions+" Possessions\n"+
                texasdefrating+" Defensive Rating\n"+texaseffectivefgpercentage+" EFG%\n"+texasteamgamescore+" Team Game Score\n"
                +texasnetrating+" Net Rating\n"+texasoffensiverating+" Offensive Rating\n"+texaspace+" Pace\n"+texastrueshootingpercentage+" True Shooting Percentage");

        double illinoiswins = 20;
        double illinoisgamesplayed = 35;
        double illinoiswinpercentage = 0;
        double illinoispointsscored = 2508;
        double illinoisppg = 0;
        double illinoispointsallowed = 2417;
        double illinoispapg = 0;
        double illinoisfgm = 898;
        double illinoisfga = 2019;
        double illinoisfgptg = 0;
        double illinois2ptfgm = 628;
        double illinois2ptfga = 1288;
        double illinois2ptfgptg = 0;
        double illinois3ptfgm = 270;
        double illinois3ptfga = 731;
        double illinois3ptfgptg = 0;
        double illinoisassists = 472;
        double illinoisassistspergame = 0;
        double illinoisassistsperfgm = 0;
        double illinoisassiststoturnoverratio = 0;
        double illinoisturnovers = 433;
        double illinoisturnoverspergame = 0;
        double illinoisblocks = 83;
        double illinoisblockspergame = 0;
        double illinoissteals = 197;
        double illinoisstealspergame = 0;
        double illinoisfta = 643;
        double illinoisftm = 442;
        double illinoisturnoverpercentage = 0;
        double illinoisftpercentage = 0;
        double illinoisrebounds = 1217;
        double illinoisoffrebounds = 342;
        double illinoisdefrebounds = 875;
        double illinoisreboundspergame = 0;
        double illinoisoffreboundspergame = 0;
        double illinoisdefreboundspergame = 0;
        double illinoispossessions = 0;
        double illinoisoppfga = 2002;
        double illinoisoppfta = 597;
        double illinoisopporb = 311;
        double illinoistoforced = 448;
        double illinoisdefrating = 0;
        double illinoiseffectivefgpercentage = 0;
        double illinoisteamgamescore = 0;
        double illinoisfouls = 641;
        double illinoisnetrating = 0;
        double illinoisoffensiverating = 0;
        double illinoispace = 0;
        double illinoisminutesplayed = 7025;
        double illinoistrueshootingpercentage = 0;
        illinoiswinpercentage = (illinoiswins/illinoisgamesplayed)*100;
        illinoisppg = (illinoispointsscored/illinoisgamesplayed);
        illinoispapg = (illinoispointsallowed/illinoisgamesplayed);
        illinoisfgptg = (illinoisfgm/illinoisfga)*100;
        illinois2ptfgptg = (illinois2ptfgm/illinois2ptfga)*100;
        illinois3ptfgptg = (illinois3ptfgm/illinois3ptfga)*100;
        illinoisassistspergame = (illinoisassists/illinoisgamesplayed);
        illinoisassistsperfgm = (illinoisassists/illinoisfgm);
        illinoisassiststoturnoverratio = (illinoisassists/illinoisturnovers);
        illinoisblockspergame = (illinoisblocks/illinoisgamesplayed);
        illinoisstealspergame = (illinoissteals/illinoisgamesplayed);
        illinoisturnoverspergame = (illinoisturnovers/illinoisgamesplayed);
        illinoisturnoverpercentage = (100*illinoisturnovers)/(illinoisfga+(0.475*illinoisfta)+illinoisturnovers);
        illinoisftpercentage = (illinoisftm/illinoisfta)*100;
        illinoisreboundspergame = (illinoisrebounds/illinoisgamesplayed);
        illinoisoffreboundspergame = (illinoisoffrebounds/illinoisgamesplayed);
        illinoisdefreboundspergame = (illinoisdefrebounds/illinoisgamesplayed);
        illinoispossessions = (0.5 * (illinoisfga + (0.475 * illinoisfta) - illinoisoffrebounds + illinoisturnovers) + 0.5 * (illinoisoppfga + (0.475 * illinoisoppfta) - illinoisopporb + illinoistoforced));
        illinoisdefrating = 100*(illinoispointsallowed/illinoispossessions);
        illinoiseffectivefgpercentage = ((illinoisfgm+(0.5*illinois3ptfgm))/illinoisfga)*100;
        illinoisteamgamescore = ((illinoispointsscored + (0.4 * illinoisfgm) - (0.7 * illinoisfga) - (0.4*(illinoisfta - illinoisftm)) + (0.7 * illinoisoffrebounds) + (0.3 * illinoisdefrebounds) + illinoissteals + (0.7 * illinoisassists) + (0.7 * illinoisblocks) - (0.4 * illinoisfouls) - illinoisturnovers)/8)/illinoisgamesplayed;
        illinoisnetrating = 100 * ((illinoispointsscored - illinoispointsallowed) / illinoispossessions);
        illinoisoffensiverating = 100 * (illinoispointsscored / illinoispossessions);
        illinoispace = 40 * (illinoispossessions / (0.2 * illinoisminutesplayed));
        illinoistrueshootingpercentage = (illinoispointsscored / (2 * (illinoisfga + 0.475 * illinoisfta)))*100;
        System.out.println("\nIllinois:\n" + illinoiswinpercentage + "% Win Percentage\n" + illinoisppg +
                " Points Per Game\n"+illinoispapg+ " Points Allowed Per Game\n"+illinoisfgptg+
                "% Field Goal Percentage\n"+illinois2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +illinois3ptfgptg+"% 3 Point Field Goal Percentage\n"+illinoisassistspergame+" Assists Per Game\n"+
                illinoisassistsperfgm+" Assists Per FGM\n"+ illinoisassiststoturnoverratio+" Assists : TO Ratio\n"+
                illinoisblockspergame+" Blocks Per Game\n"+illinoisstealspergame+" Steals Per Game\n"+
                illinoisturnoverspergame+" TO Per Game\n"+illinoisturnoverpercentage+" TO%\n"+ illinoisftpercentage+" FT%\n"+
                illinoisreboundspergame+" Rebounds Per Game\n"+illinoisoffreboundspergame+" Offensive Rebounds Per game\n"+
                illinoisdefreboundspergame+" Defensive Rebounds Per Game\n"+illinoispossessions+" Possessions\n"+
                illinoisdefrating+" Defensive Rating\n"+illinoiseffectivefgpercentage+" EFG%\n"+illinoisteamgamescore+" Team Game Score\n"
                +illinoisnetrating+" Net Rating\n"+illinoisoffensiverating+" Offensive Rating\n"+illinoispace+" Pace\n"+illinoistrueshootingpercentage+" True Shooting Percentage");

        double nevadawins = 28;
        double nevadagamesplayed = 35;
        double nevadawinpercentage = 0;
        double nevadapointsscored = 2792;
        double nevadappg = 0;
        double nevadapointsallowed = 2496;
        double nevadapapg = 0;
        double nevadafgm = 933;
        double nevadafga = 2082;
        double nevadafgptg = 0;
        double nevada2ptfgm = 613;
        double nevada2ptfga = 1245;
        double nevada2ptfgptg = 0;
        double nevada3ptfgm = 320;
        double nevada3ptfga = 837;
        double nevada3ptfgptg = 0;
        double nevadaassists = 559;
        double nevadaassistspergame = 0;
        double nevadaassistsperfgm = 0;
        double nevadaassiststoturnoverratio = 0;
        double nevadaturnovers = 386;
        double nevadaturnoverspergame = 0;
        double nevadablocks = 152;
        double nevadablockspergame = 0;
        double nevadasteals = 189;
        double nevadastealspergame = 0;
        double nevadafta = 859;
        double nevadaftm = 606;
        double nevadaturnoverpercentage = 0;
        double nevadaftpercentage = 0;
        double nevadarebounds = 1351;
        double nevadaoffrebounds = 384;
        double nevadadefrebounds = 967;
        double nevadareboundspergame = 0;
        double nevadaoffreboundspergame = 0;
        double nevadadefreboundspergame = 0;
        double nevadapossessions = 0;
        double nevadaoppfga = 2149;
        double nevadaoppfta = 607;
        double nevadaopporb = 341;
        double nevadatoforced = 397;
        double nevadadefrating = 0;
        double nevadaeffectivefgpercentage = 0;
        double nevadateamgamescore = 0;
        double nevadafouls = 581;
        double nevadanetrating = 0;
        double nevadaoffensiverating = 0;
        double nevadapace = 0;
        double nevadaminutesplayed = 7025;
        double nevadatrueshootingpercentage = 0;
        nevadawinpercentage = (nevadawins/nevadagamesplayed)*100;
        nevadappg = (nevadapointsscored/nevadagamesplayed);
        nevadapapg = (nevadapointsallowed/nevadagamesplayed);
        nevadafgptg = (nevadafgm/nevadafga)*100;
        nevada2ptfgptg = (nevada2ptfgm/nevada2ptfga)*100;
        nevada3ptfgptg = (nevada3ptfgm/nevada3ptfga)*100;
        nevadaassistspergame = (nevadaassists/nevadagamesplayed);
        nevadaassistsperfgm = (nevadaassists/nevadafgm);
        nevadaassiststoturnoverratio = (nevadaassists/nevadaturnovers);
        nevadablockspergame = (nevadablocks/nevadagamesplayed);
        nevadastealspergame = (nevadasteals/nevadagamesplayed);
        nevadaturnoverspergame = (nevadaturnovers/nevadagamesplayed);
        nevadaturnoverpercentage = (100*nevadaturnovers)/(nevadafga+(0.475*nevadafta)+nevadaturnovers);
        nevadaftpercentage = (nevadaftm/nevadafta)*100;
        nevadareboundspergame = (nevadarebounds/nevadagamesplayed);
        nevadaoffreboundspergame = (nevadaoffrebounds/nevadagamesplayed);
        nevadadefreboundspergame = (nevadadefrebounds/nevadagamesplayed);
        nevadapossessions = (0.5 * (nevadafga + (0.475 * nevadafta) - nevadaoffrebounds + nevadaturnovers) + 0.5 * (nevadaoppfga + (0.475 * nevadaoppfta) - nevadaopporb + nevadatoforced));
        nevadadefrating = 100*(nevadapointsallowed/nevadapossessions);
        nevadaeffectivefgpercentage = ((nevadafgm+(0.5*nevada3ptfgm))/nevadafga)*100;
        nevadateamgamescore = ((nevadapointsscored + (0.4 * nevadafgm) - (0.7 * nevadafga) - (0.4*(nevadafta - nevadaftm)) + (0.7 * nevadaoffrebounds) + (0.3 * nevadadefrebounds) + nevadasteals + (0.7 * nevadaassists) + (0.7 * nevadablocks) - (0.4 * nevadafouls) - nevadaturnovers)/8)/nevadagamesplayed;
        nevadanetrating = 100 * ((nevadapointsscored - nevadapointsallowed) / nevadapossessions);
        nevadaoffensiverating = 100 * (nevadapointsscored / nevadapossessions);
        nevadapace = 40 * (nevadapossessions / (0.2 * nevadaminutesplayed));
        nevadatrueshootingpercentage = (nevadapointsscored / (2 * (nevadafga + 0.475 * nevadafta)))*100;
        System.out.println("\nNevada:\n" + nevadawinpercentage + "% Win Percentage\n" + nevadappg +
                " Points Per Game\n"+nevadapapg+ " Points Allowed Per Game\n"+nevadafgptg+
                "% Field Goal Percentage\n"+nevada2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +nevada3ptfgptg+"% 3 Point Field Goal Percentage\n"+nevadaassistspergame+" Assists Per Game\n"+
                nevadaassistsperfgm+" Assists Per FGM\n"+ nevadaassiststoturnoverratio+" Assists : TO Ratio\n"+
                nevadablockspergame+" Blocks Per Game\n"+nevadastealspergame+" Steals Per Game\n"+
                nevadaturnoverspergame+" TO Per Game\n"+nevadaturnoverpercentage+" TO%\n"+ nevadaftpercentage+" FT%\n"+
                nevadareboundspergame+" Rebounds Per Game\n"+nevadaoffreboundspergame+" Offensive Rebounds Per game\n"+
                nevadadefreboundspergame+" Defensive Rebounds Per Game\n"+nevadapossessions+" Possessions\n"+
                nevadadefrating+" Defensive Rating\n"+nevadaeffectivefgpercentage+" EFG%\n"+nevadateamgamescore+" Team Game Score\n"
                +nevadanetrating+" Net Rating\n"+nevadaoffensiverating+" Offensive Rating\n"+nevadapace+" Pace\n"+nevadatrueshootingpercentage+" True Shooting Percentage");

        double texasamwins = 16;
        double texasamgamesplayed = 31;
        double texasamwinpercentage = 0;
        double texasampointsscored = 2176;
        double texasamppg = 0;
        double texasampointsallowed = 2102;
        double texasampapg = 0;
        double texasamfgm = 804;
        double texasamfga = 1754;
        double texasamfgptg = 0;
        double texasam2ptfgm = 615;
        double texasam2ptfga = 1180;
        double texasam2ptfgptg = 0;
        double texasam3ptfgm = 189;
        double texasam3ptfga = 574;
        double texasam3ptfgptg = 0;
        double texasamassists = 489;
        double texasamassistspergame = 0;
        double texasamassistsperfgm = 0;
        double texasamassiststoturnoverratio = 0;
        double texasamturnovers = 438;
        double texasamturnoverspergame = 0;
        double texasamblocks = 173;
        double texasamblockspergame = 0;
        double texasamsteals = 186;
        double texasamstealspergame = 0;
        double texasamfta = 584;
        double texasamftm = 379;
        double texasamturnoverpercentage = 0;
        double texasamftpercentage = 0;
        double texasamrebounds = 1193;
        double texasamoffrebounds = 401;
        double texasamdefrebounds = 792;
        double texasamreboundspergame = 0;
        double texasamoffreboundspergame = 0;
        double texasamdefreboundspergame = 0;
        double texasampossessions = 0;
        double texasamoppfga = 1829;
        double texasamoppfta = 514;
        double texasamopporb = 361;
        double texasamtoforced = 360;
        double texasamdefrating = 0;
        double texasameffectivefgpercentage = 0;
        double texasamteamgamescore = 0;
        double texasamfouls = 511;
        double texasamnetrating = 0;
        double texasamoffensiverating = 0;
        double texasampace = 0;
        double texasamminutesplayed = 6200;
        double texasamtrueshootingpercentage = 0;
        texasamwinpercentage = (texasamwins/texasamgamesplayed)*100;
        texasamppg = (texasampointsscored/texasamgamesplayed);
        texasampapg = (texasampointsallowed/texasamgamesplayed);
        texasamfgptg = (texasamfgm/texasamfga)*100;
        texasam2ptfgptg = (texasam2ptfgm/texasam2ptfga)*100;
        texasam3ptfgptg = (texasam3ptfgm/texasam3ptfga)*100;
        texasamassistspergame = (texasamassists/texasamgamesplayed);
        texasamassistsperfgm = (texasamassists/texasamfgm);
        texasamassiststoturnoverratio = (texasamassists/texasamturnovers);
        texasamblockspergame = (texasamblocks/texasamgamesplayed);
        texasamstealspergame = (texasamsteals/texasamgamesplayed);
        texasamturnoverspergame = (texasamturnovers/texasamgamesplayed);
        texasamturnoverpercentage = (100*texasamturnovers)/(texasamfga+(0.475*texasamfta)+texasamturnovers);
        texasamftpercentage = (texasamftm/texasamfta)*100;
        texasamreboundspergame = (texasamrebounds/texasamgamesplayed);
        texasamoffreboundspergame = (texasamoffrebounds/texasamgamesplayed);
        texasamdefreboundspergame = (texasamdefrebounds/texasamgamesplayed);
        texasampossessions = (0.5 * (texasamfga + (0.475 * texasamfta) - texasamoffrebounds + texasamturnovers) + 0.5 * (texasamoppfga + (0.475 * texasamoppfta) - texasamopporb + texasamtoforced));
        texasamdefrating = 100*(texasampointsallowed/texasampossessions);
        texasameffectivefgpercentage = ((texasamfgm+(0.5*texasam3ptfgm))/texasamfga)*100;
        texasamteamgamescore = ((texasampointsscored + (0.4 * texasamfgm) - (0.7 * texasamfga) - (0.4*(texasamfta - texasamftm)) + (0.7 * texasamoffrebounds) + (0.3 * texasamdefrebounds) + texasamsteals + (0.7 * texasamassists) + (0.7 * texasamblocks) - (0.4 * texasamfouls) - texasamturnovers)/8)/texasamgamesplayed;
        texasamnetrating = 100 * ((texasampointsscored - texasampointsallowed) / texasampossessions);
        texasamoffensiverating = 100 * (texasampointsscored / texasampossessions);
        texasampace = 40 * (texasampossessions / (0.2 * texasamminutesplayed));
        texasamtrueshootingpercentage = (texasampointsscored / (2 * (texasamfga + 0.475 * texasamfta)))*100;
        System.out.println("\nTexas A&M:\n" + texasamwinpercentage + "% Win Percentage\n" + texasamppg +
                " Points Per Game\n"+texasampapg+ " Points Allowed Per Game\n"+texasamfgptg+
                "% Field Goal Percentage\n"+texasam2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +texasam3ptfgptg+"% 3 Point Field Goal Percentage\n"+texasamassistspergame+" Assists Per Game\n"+
                texasamassistsperfgm+" Assists Per FGM\n"+ texasamassiststoturnoverratio+" Assists : TO Ratio\n"+
                texasamblockspergame+" Blocks Per Game\n"+texasamstealspergame+" Steals Per Game\n"+
                texasamturnoverspergame+" TO Per Game\n"+texasamturnoverpercentage+" TO%\n"+ texasamftpercentage+" FT%\n"+
                texasamreboundspergame+" Rebounds Per Game\n"+texasamoffreboundspergame+" Offensive Rebounds Per game\n"+
                texasamdefreboundspergame+" Defensive Rebounds Per Game\n"+texasampossessions+" Possessions\n"+
                texasamdefrating+" Defensive Rating\n"+texasameffectivefgpercentage+" EFG%\n"+texasamteamgamescore+" Team Game Score\n"
                +texasamnetrating+" Net Rating\n"+texasamoffensiverating+" Offensive Rating\n"+texasampace+" Pace\n"+texasamtrueshootingpercentage+" True Shooting Percentage");

        double ohiostatewins = 17;
        double ohiostategamesplayed = 32;
        double ohiostatewinpercentage = 0;
        double ohiostatepointsscored = 2329;
        double ohiostateppg = 0;
        double ohiostatepointsallowed = 2232;
        double ohiostatepapg = 0;
        double ohiostatefgm = 827;
        double ohiostatefga = 1786;
        double ohiostatefgptg = 0;
        double ohiostate2ptfgm = 616;
        double ohiostate2ptfga = 1194;
        double ohiostate2ptfgptg = 0;
        double ohiostate3ptfgm = 211;
        double ohiostate3ptfga = 592;
        double ohiostate3ptfgptg = 0;
        double ohiostateassists = 434;
        double ohiostateassistspergame = 0;
        double ohiostateassistsperfgm = 0;
        double ohiostateassiststoturnoverratio = 0;
        double ohiostateturnovers = 424;
        double ohiostateturnoverspergame = 0;
        double ohiostateblocks = 121;
        double ohiostateblockspergame = 0;
        double ohiostatesteals = 166;
        double ohiostatestealspergame = 0;
        double ohiostatefta = 680;
        double ohiostateftm = 464;
        double ohiostateturnoverpercentage = 0;
        double ohiostateftpercentage = 0;
        double ohiostaterebounds = 1191;
        double ohiostateoffrebounds = 324;
        double ohiostatedefrebounds = 867;
        double ohiostatereboundspergame = 0;
        double ohiostateoffreboundspergame = 0;
        double ohiostatedefreboundspergame = 0;
        double ohiostatepossessions = 0;
        double ohiostateoppfga = 1902;
        double ohiostateoppfta = 560;
        double ohiostateopporb = 351;
        double ohiostatetoforced = 387;
        double ohiostatedefrating = 0;
        double ohiostateeffectivefgpercentage = 0;
        double ohiostateteamgamescore = 0;
        double ohiostatefouls = 562;
        double ohiostatenetrating = 0;
        double ohiostateoffensiverating = 0;
        double ohiostatepace = 0;
        double ohiostateminutesplayed = 6425;
        double ohiostatetrueshootingpercentage = 0;
        ohiostatewinpercentage = (ohiostatewins/ohiostategamesplayed)*100;
        ohiostateppg = (ohiostatepointsscored/ohiostategamesplayed);
        ohiostatepapg = (ohiostatepointsallowed/ohiostategamesplayed);
        ohiostatefgptg = (ohiostatefgm/ohiostatefga)*100;
        ohiostate2ptfgptg = (ohiostate2ptfgm/ohiostate2ptfga)*100;
        ohiostate3ptfgptg = (ohiostate3ptfgm/ohiostate3ptfga)*100;
        ohiostateassistspergame = (ohiostateassists/ohiostategamesplayed);
        ohiostateassistsperfgm = (ohiostateassists/ohiostatefgm);
        ohiostateassiststoturnoverratio = (ohiostateassists/ohiostateturnovers);
        ohiostateblockspergame = (ohiostateblocks/ohiostategamesplayed);
        ohiostatestealspergame = (ohiostatesteals/ohiostategamesplayed);
        ohiostateturnoverspergame = (ohiostateturnovers/ohiostategamesplayed);
        ohiostateturnoverpercentage = (100*ohiostateturnovers)/(ohiostatefga+(0.475*ohiostatefta)+ohiostateturnovers);
        ohiostateftpercentage = (ohiostateftm/ohiostatefta)*100;
        ohiostatereboundspergame = (ohiostaterebounds/ohiostategamesplayed);
        ohiostateoffreboundspergame = (ohiostateoffrebounds/ohiostategamesplayed);
        ohiostatedefreboundspergame = (ohiostatedefrebounds/ohiostategamesplayed);
        ohiostatepossessions = (0.5 * (ohiostatefga + (0.475 * ohiostatefta) - ohiostateoffrebounds + ohiostateturnovers) + 0.5 * (ohiostateoppfga + (0.475 * ohiostateoppfta) - ohiostateopporb + ohiostatetoforced));
        ohiostatedefrating = 100*(ohiostatepointsallowed/ohiostatepossessions);
        ohiostateeffectivefgpercentage = ((ohiostatefgm+(0.5*ohiostate3ptfgm))/ohiostatefga)*100;
        ohiostateteamgamescore = ((ohiostatepointsscored + (0.4 * ohiostatefgm) - (0.7 * ohiostatefga) - (0.4*(ohiostatefta - ohiostateftm)) + (0.7 * ohiostateoffrebounds) + (0.3 * ohiostatedefrebounds) + ohiostatesteals + (0.7 * ohiostateassists) + (0.7 * ohiostateblocks) - (0.4 * ohiostatefouls) - ohiostateturnovers)/8)/ohiostategamesplayed;
        ohiostatenetrating = 100 * ((ohiostatepointsscored - ohiostatepointsallowed) / ohiostatepossessions);
        ohiostateoffensiverating = 100 * (ohiostatepointsscored / ohiostatepossessions);
        ohiostatepace = 40 * (ohiostatepossessions / (0.2 * ohiostateminutesplayed));
        ohiostatetrueshootingpercentage = (ohiostatepointsscored / (2 * (ohiostatefga + 0.475 * ohiostatefta)))*100;
        System.out.println("\nOhio State:\n" + ohiostatewinpercentage + "% Win Percentage\n" + ohiostateppg +
                " Points Per Game\n"+ohiostatepapg+ " Points Allowed Per Game\n"+ohiostatefgptg+
                "% Field Goal Percentage\n"+ohiostate2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +ohiostate3ptfgptg+"% 3 Point Field Goal Percentage\n"+ohiostateassistspergame+" Assists Per Game\n"+
                ohiostateassistsperfgm+" Assists Per FGM\n"+ ohiostateassiststoturnoverratio+" Assists : TO Ratio\n"+
                ohiostateblockspergame+" Blocks Per Game\n"+ohiostatestealspergame+" Steals Per Game\n"+
                ohiostateturnoverspergame+" TO Per Game\n"+ohiostateturnoverpercentage+" TO%\n"+ ohiostateftpercentage+" FT%\n"+
                ohiostatereboundspergame+" Rebounds Per Game\n"+ohiostateoffreboundspergame+" Offensive Rebounds Per game\n"+
                ohiostatedefreboundspergame+" Defensive Rebounds Per Game\n"+ohiostatepossessions+" Possessions\n"+
                ohiostatedefrating+" Defensive Rating\n"+ohiostateeffectivefgpercentage+" EFG%\n"+ohiostateteamgamescore+" Team Game Score\n"
                +ohiostatenetrating+" Net Rating\n"+ohiostateoffensiverating+" Offensive Rating\n"+ohiostatepace+" Pace\n"+ohiostatetrueshootingpercentage+" True Shooting Percentage");

        double illinoisstatewins = 28;
        double illinoisstategamesplayed = 35;
        double illinoisstatewinpercentage = 0;
        double illinoisstatepointsscored = 2418;
        double illinoisstateppg = 0;
        double illinoisstatepointsallowed = 2146;
        double illinoisstatepapg = 0;
        double illinoisstatefgm = 865;
        double illinoisstatefga = 1972;
        double illinoisstatefgptg = 0;
        double illinoisstate2ptfgm = 571;
        double illinoisstate2ptfga = 1175;
        double illinoisstate2ptfgptg = 0;
        double illinoisstate3ptfgm = 294;
        double illinoisstate3ptfga = 797;
        double illinoisstate3ptfgptg = 0;
        double illinoisstateassists = 483;
        double illinoisstateassistspergame = 0;
        double illinoisstateassistsperfgm = 0;
        double illinoisstateassiststoturnoverratio = 0;
        double illinoisstateturnovers = 427;
        double illinoisstateturnoverspergame = 0;
        double illinoisstateblocks = 170;
        double illinoisstateblockspergame = 0;
        double illinoisstatesteals = 250;
        double illinoisstatestealspergame = 0;
        double illinoisstatefta = 593;
        double illinoisstateftm = 394;
        double illinoisstateturnoverpercentage = 0;
        double illinoisstateftpercentage = 0;
        double illinoisstaterebounds = 1293;
        double illinoisstateoffrebounds = 369;
        double illinoisstatedefrebounds = 924;
        double illinoisstatereboundspergame = 0;
        double illinoisstateoffreboundspergame = 0;
        double illinoisstatedefreboundspergame = 0;
        double illinoisstatepossessions = 0;
        double illinoisstateoppfga = 1934;
        double illinoisstateoppfta = 627;
        double illinoisstateopporb = 369;
        double illinoisstatetoforced = 448;
        double illinoisstatedefrating = 0;
        double illinoisstateeffectivefgpercentage = 0;
        double illinoisstateteamgamescore = 0;
        double illinoisstatefouls = 620;
        double illinoisstatenetrating = 0;
        double illinoisstateoffensiverating = 0;
        double illinoisstatepace = 0;
        double illinoisstateminutesplayed = 7025;
        double illinoisstatetrueshootingpercentage = 0;
        illinoisstatewinpercentage = (illinoisstatewins/illinoisstategamesplayed)*100;
        illinoisstateppg = (illinoisstatepointsscored/illinoisstategamesplayed);
        illinoisstatepapg = (illinoisstatepointsallowed/illinoisstategamesplayed);
        illinoisstatefgptg = (illinoisstatefgm/illinoisstatefga)*100;
        illinoisstate2ptfgptg = (illinoisstate2ptfgm/illinoisstate2ptfga)*100;
        illinoisstate3ptfgptg = (illinoisstate3ptfgm/illinoisstate3ptfga)*100;
        illinoisstateassistspergame = (illinoisstateassists/illinoisstategamesplayed);
        illinoisstateassistsperfgm = (illinoisstateassists/illinoisstatefgm);
        illinoisstateassiststoturnoverratio = (illinoisstateassists/illinoisstateturnovers);
        illinoisstateblockspergame = (illinoisstateblocks/illinoisstategamesplayed);
        illinoisstatestealspergame = (illinoisstatesteals/illinoisstategamesplayed);
        illinoisstateturnoverspergame = (illinoisstateturnovers/illinoisstategamesplayed);
        illinoisstateturnoverpercentage = (100*illinoisstateturnovers)/(illinoisstatefga+(0.475*illinoisstatefta)+illinoisstateturnovers);
        illinoisstateftpercentage = (illinoisstateftm/illinoisstatefta)*100;
        illinoisstatereboundspergame = (illinoisstaterebounds/illinoisstategamesplayed);
        illinoisstateoffreboundspergame = (illinoisstateoffrebounds/illinoisstategamesplayed);
        illinoisstatedefreboundspergame = (illinoisstatedefrebounds/illinoisstategamesplayed);
        illinoisstatepossessions = (0.5 * (illinoisstatefga + (0.475 * illinoisstatefta) - illinoisstateoffrebounds + illinoisstateturnovers) + 0.5 * (illinoisstateoppfga + (0.475 * illinoisstateoppfta) - illinoisstateopporb + illinoisstatetoforced));
        illinoisstatedefrating = 100*(illinoisstatepointsallowed/illinoisstatepossessions);
        illinoisstateeffectivefgpercentage = ((illinoisstatefgm+(0.5*illinoisstate3ptfgm))/illinoisstatefga)*100;
        illinoisstateteamgamescore = ((illinoisstatepointsscored + (0.4 * illinoisstatefgm) - (0.7 * illinoisstatefga) - (0.4*(illinoisstatefta - illinoisstateftm)) + (0.7 * illinoisstateoffrebounds) + (0.3 * illinoisstatedefrebounds) + illinoisstatesteals + (0.7 * illinoisstateassists) + (0.7 * illinoisstateblocks) - (0.4 * illinoisstatefouls) - illinoisstateturnovers)/8)/illinoisstategamesplayed;
        illinoisstatenetrating = 100 * ((illinoisstatepointsscored - illinoisstatepointsallowed) / illinoisstatepossessions);
        illinoisstateoffensiverating = 100 * (illinoisstatepointsscored / illinoisstatepossessions);
        illinoisstatepace = 40 * (illinoisstatepossessions / (0.2 * illinoisstateminutesplayed));
        illinoisstatetrueshootingpercentage = (illinoisstatepointsscored / (2 * (illinoisstatefga + 0.475 * illinoisstatefta)))*100;
        System.out.println("\nIllinois State:\n" + illinoisstatewinpercentage + "% Win Percentage\n" + illinoisstateppg +
                " Points Per Game\n"+illinoisstatepapg+ " Points Allowed Per Game\n"+illinoisstatefgptg+
                "% Field Goal Percentage\n"+illinoisstate2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +illinoisstate3ptfgptg+"% 3 Point Field Goal Percentage\n"+illinoisstateassistspergame+" Assists Per Game\n"+
                illinoisstateassistsperfgm+" Assists Per FGM\n"+ illinoisstateassiststoturnoverratio+" Assists : TO Ratio\n"+
                illinoisstateblockspergame+" Blocks Per Game\n"+illinoisstatestealspergame+" Steals Per Game\n"+
                illinoisstateturnoverspergame+" TO Per Game\n"+illinoisstateturnoverpercentage+" TO%\n"+ illinoisstateftpercentage+" FT%\n"+
                illinoisstatereboundspergame+" Rebounds Per Game\n"+illinoisstateoffreboundspergame+" Offensive Rebounds Per game\n"+
                illinoisstatedefreboundspergame+" Defensive Rebounds Per Game\n"+illinoisstatepossessions+" Possessions\n"+
                illinoisstatedefrating+" Defensive Rating\n"+illinoisstateeffectivefgpercentage+" EFG%\n"+illinoisstateteamgamescore+" Team Game Score\n"
                +illinoisstatenetrating+" Net Rating\n"+illinoisstateoffensiverating+" Offensive Rating\n"+illinoisstatepace+" Pace\n"+illinoisstatetrueshootingpercentage+" True Shooting Percentage");

        double iowawins = 19;
        double iowagamesplayed = 34;
        double iowawinpercentage = 0;
        double iowapointsscored = 2738;
        double iowappg = 0;
        double iowapointsallowed = 2654;
        double iowapapg = 0;
        double iowafgm = 964;
        double iowafga = 2121;
        double iowafgptg = 0;
        double iowa2ptfgm = 664;
        double iowa2ptfga = 1330;
        double iowa2ptfgptg = 0;
        double iowa3ptfgm = 300;
        double iowa3ptfga = 791;
        double iowa3ptfgptg = 0;
        double iowaassists = 602;
        double iowaassistspergame = 0;
        double iowaassistsperfgm = 0;
        double iowaassiststoturnoverratio = 0;
        double iowaturnovers = 473;
        double iowaturnoverspergame = 0;
        double iowablocks = 130;
        double iowablockspergame = 0;
        double iowasteals = 252;
        double iowastealspergame = 0;
        double iowafta = 741;
        double iowaftm = 510;
        double iowaturnoverpercentage = 0;
        double iowaftpercentage = 0;
        double iowarebounds = 1306;
        double iowaoffrebounds = 408;
        double iowadefrebounds = 898;
        double iowareboundspergame = 0;
        double iowaoffreboundspergame = 0;
        double iowadefreboundspergame = 0;
        double iowapossessions = 0;
        double iowaoppfga = 2195;
        double iowaoppfta = 603;
        double iowaopporb = 427;
        double iowatoforced = 486;
        double iowadefrating = 0;
        double iowaeffectivefgpercentage = 0;
        double iowateamgamescore = 0;
        double iowafouls = 608;
        double iowanetrating = 0;
        double iowaoffensiverating = 0;
        double iowapace = 0;
        double iowaminutesplayed = 6975;
        double iowatrueshootingpercentage = 0;
        iowawinpercentage = (iowawins/iowagamesplayed)*100;
        iowappg = (iowapointsscored/iowagamesplayed);
        iowapapg = (iowapointsallowed/iowagamesplayed);
        iowafgptg = (iowafgm/iowafga)*100;
        iowa2ptfgptg = (iowa2ptfgm/iowa2ptfga)*100;
        iowa3ptfgptg = (iowa3ptfgm/iowa3ptfga)*100;
        iowaassistspergame = (iowaassists/iowagamesplayed);
        iowaassistsperfgm = (iowaassists/iowafgm);
        iowaassiststoturnoverratio = (iowaassists/iowaturnovers);
        iowablockspergame = (iowablocks/iowagamesplayed);
        iowastealspergame = (iowasteals/iowagamesplayed);
        iowaturnoverspergame = (iowaturnovers/iowagamesplayed);
        iowaturnoverpercentage = (100*iowaturnovers)/(iowafga+(0.475*iowafta)+iowaturnovers);
        iowaftpercentage = (iowaftm/iowafta)*100;
        iowareboundspergame = (iowarebounds/iowagamesplayed);
        iowaoffreboundspergame = (iowaoffrebounds/iowagamesplayed);
        iowadefreboundspergame = (iowadefrebounds/iowagamesplayed);
        iowapossessions = (0.5 * (iowafga + (0.475 * iowafta) - iowaoffrebounds + iowaturnovers) + 0.5 * (iowaoppfga + (0.475 * iowaoppfta) - iowaopporb + iowatoforced));
        iowadefrating = 100*(iowapointsallowed/iowapossessions);
        iowaeffectivefgpercentage = ((iowafgm+(0.5*iowa3ptfgm))/iowafga)*100;
        iowateamgamescore = ((iowapointsscored + (0.4 * iowafgm) - (0.7 * iowafga) - (0.4*(iowafta - iowaftm)) + (0.7 * iowaoffrebounds) + (0.3 * iowadefrebounds) + iowasteals + (0.7 * iowaassists) + (0.7 * iowablocks) - (0.4 * iowafouls) - iowaturnovers)/8)/iowagamesplayed;
        iowanetrating = 100 * ((iowapointsscored - iowapointsallowed) / iowapossessions);
        iowaoffensiverating = 100 * (iowapointsscored / iowapossessions);
        iowapace = 40 * (iowapossessions / (0.2 * iowaminutesplayed));
        iowatrueshootingpercentage = (iowapointsscored / (2 * (iowafga + 0.475 * iowafta)))*100;
        System.out.println("\nIowa:\n" + iowawinpercentage + "% Win Percentage\n" + iowappg +
                " Points Per Game\n"+iowapapg+ " Points Allowed Per Game\n"+iowafgptg+
                "% Field Goal Percentage\n"+iowa2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +iowa3ptfgptg+"% 3 Point Field Goal Percentage\n"+iowaassistspergame+" Assists Per Game\n"+
                iowaassistsperfgm+" Assists Per FGM\n"+ iowaassiststoturnoverratio+" Assists : TO Ratio\n"+
                iowablockspergame+" Blocks Per Game\n"+iowastealspergame+" Steals Per Game\n"+
                iowaturnoverspergame+" TO Per Game\n"+iowaturnoverpercentage+" TO%\n"+ iowaftpercentage+" FT%\n"+
                iowareboundspergame+" Rebounds Per Game\n"+iowaoffreboundspergame+" Offensive Rebounds Per game\n"+
                iowadefreboundspergame+" Defensive Rebounds Per Game\n"+iowapossessions+" Possessions\n"+
                iowadefrating+" Defensive Rating\n"+iowaeffectivefgpercentage+" EFG%\n"+iowateamgamescore+" Team Game Score\n"
                +iowanetrating+" Net Rating\n"+iowaoffensiverating+" Offensive Rating\n"+iowapace+" Pace\n"+iowatrueshootingpercentage+" True Shooting Percentage");

        double middletenwins = 31;
        double middletengamesplayed = 36;
        double middletenwinpercentage = 0;
        double middletenpointsscored = 2697;
        double middletenppg = 0;
        double middletenpointsallowed = 2299;
        double middletenpapg = 0;
        double middletenfgm = 1014;
        double middletenfga = 2077;
        double middletenfgptg = 0;
        double middleten2ptfgm = 786;
        double middleten2ptfga = 1455;
        double middleten2ptfgptg = 0;
        double middleten3ptfgm = 228;
        double middleten3ptfga = 622;
        double middleten3ptfgptg = 0;
        double middletenassists = 552;
        double middletenassistspergame = 0;
        double middletenassistsperfgm = 0;
        double middletenassiststoturnoverratio = 0;
        double middletenturnovers = 375;
        double middletenturnoverspergame = 0;
        double middletenblocks = 100;
        double middletenblockspergame = 0;
        double middletensteals = 242;
        double middletenstealspergame = 0;
        double middletenfta = 631;
        double middletenftm = 441;
        double middletenturnoverpercentage = 0;
        double middletenftpercentage = 0;
        double middletenrebounds = 1273;
        double middletenoffrebounds = 349;
        double middletendefrebounds = 924;
        double middletenreboundspergame = 0;
        double middletenoffreboundspergame = 0;
        double middletendefreboundspergame = 0;
        double middletenpossessions = 0;
        double middletenoppfga = 1882;
        double middletenoppfta = 700;
        double middletenopporb = 286;
        double middletentoforced = 476;
        double middletendefrating = 0;
        double middleteneffectivefgpercentage = 0;
        double middletenteamgamescore = 0;
        double middletenfouls = 655;
        double middletennetrating = 0;
        double middletenoffensiverating = 0;
        double middletenpace = 0;
        double middletenminutesplayed = 7225;
        double middletentrueshootingpercentage = 0;
        middletenwinpercentage = (middletenwins/middletengamesplayed)*100;
        middletenppg = (middletenpointsscored/middletengamesplayed);
        middletenpapg = (middletenpointsallowed/middletengamesplayed);
        middletenfgptg = (middletenfgm/middletenfga)*100;
        middleten2ptfgptg = (middleten2ptfgm/middleten2ptfga)*100;
        middleten3ptfgptg = (middleten3ptfgm/middleten3ptfga)*100;
        middletenassistspergame = (middletenassists/middletengamesplayed);
        middletenassistsperfgm = (middletenassists/middletenfgm);
        middletenassiststoturnoverratio = (middletenassists/middletenturnovers);
        middletenblockspergame = (middletenblocks/middletengamesplayed);
        middletenstealspergame = (middletensteals/middletengamesplayed);
        middletenturnoverspergame = (middletenturnovers/middletengamesplayed);
        middletenturnoverpercentage = (100*middletenturnovers)/(middletenfga+(0.475*middletenfta)+middletenturnovers);
        middletenftpercentage = (middletenftm/middletenfta)*100;
        middletenreboundspergame = (middletenrebounds/middletengamesplayed);
        middletenoffreboundspergame = (middletenoffrebounds/middletengamesplayed);
        middletendefreboundspergame = (middletendefrebounds/middletengamesplayed);
        middletenpossessions = (0.5 * (middletenfga + (0.475 * middletenfta) - middletenoffrebounds + middletenturnovers) + 0.5 * (middletenoppfga + (0.475 * middletenoppfta) - middletenopporb + middletentoforced));
        middletendefrating = 100*(middletenpointsallowed/middletenpossessions);
        middleteneffectivefgpercentage = ((middletenfgm+(0.5*middleten3ptfgm))/middletenfga)*100;
        middletenteamgamescore = ((middletenpointsscored + (0.4 * middletenfgm) - (0.7 * middletenfga) - (0.4*(middletenfta - middletenftm)) + (0.7 * middletenoffrebounds) + (0.3 * middletendefrebounds) + middletensteals + (0.7 * middletenassists) + (0.7 * middletenblocks) - (0.4 * middletenfouls) - middletenturnovers)/8)/middletengamesplayed;
        middletennetrating = 100 * ((middletenpointsscored - middletenpointsallowed) / middletenpossessions);
        middletenoffensiverating = 100 * (middletenpointsscored / middletenpossessions);
        middletenpace = 40 * (middletenpossessions / (0.2 * middletenminutesplayed));
        middletentrueshootingpercentage = (middletenpointsscored / (2 * (middletenfga + 0.475 * middletenfta)))*100;
        System.out.println("\nMiddle Tennessee:\n" + middletenwinpercentage + "% Win Percentage\n" + middletenppg +
                " Points Per Game\n"+middletenpapg+ " Points Allowed Per Game\n"+middletenfgptg+
                "% Field Goal Percentage\n"+middleten2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +middleten3ptfgptg+"% 3 Point Field Goal Percentage\n"+middletenassistspergame+" Assists Per Game\n"+
                middletenassistsperfgm+" Assists Per FGM\n"+ middletenassiststoturnoverratio+" Assists : TO Ratio\n"+
                middletenblockspergame+" Blocks Per Game\n"+middletenstealspergame+" Steals Per Game\n"+
                middletenturnoverspergame+" TO Per Game\n"+middletenturnoverpercentage+" TO%\n"+ middletenftpercentage+" FT%\n"+
                middletenreboundspergame+" Rebounds Per Game\n"+middletenoffreboundspergame+" Offensive Rebounds Per game\n"+
                middletendefreboundspergame+" Defensive Rebounds Per Game\n"+middletenpossessions+" Possessions\n"+
                middletendefrating+" Defensive Rating\n"+middleteneffectivefgpercentage+" EFG%\n"+middletenteamgamescore+" Team Game Score\n"
                +middletennetrating+" Net Rating\n"+middletenoffensiverating+" Offensive Rating\n"+middletenpace+" Pace\n"+middletentrueshootingpercentage+" True Shooting Percentage");

        double olemisswins = 22;
        double olemissgamesplayed = 36;
        double olemisswinpercentage = 0;
        double olemisspointsscored = 2807;
        double olemissppg = 0;
        double olemisspointsallowed = 2747;
        double olemisspapg = 0;
        double olemissfgm = 914;
        double olemissfga = 2162;
        double olemissfgptg = 0;
        double olemiss2ptfgm = 631;
        double olemiss2ptfga = 1347;
        double olemiss2ptfgptg = 0;
        double olemiss3ptfgm = 283;
        double olemiss3ptfga = 815;
        double olemiss3ptfgptg = 0;
        double olemissassists = 465;
        double olemissassistspergame = 0;
        double olemissassistsperfgm = 0;
        double olemissassiststoturnoverratio = 0;
        double olemissturnovers = 515;
        double olemissturnoverspergame = 0;
        double olemissblocks = 149;
        double olemissblockspergame = 0;
        double olemisssteals = 243;
        double olemissstealspergame = 0;
        double olemissfta = 926;
        double olemissftm = 696;
        double olemissturnoverpercentage = 0;
        double olemissftpercentage = 0;
        double olemissrebounds = 1422;
        double olemissoffrebounds = 458;
        double olemissdefrebounds = 964;
        double olemissreboundspergame = 0;
        double olemissoffreboundspergame = 0;
        double olemissdefreboundspergame = 0;
        double olemisspossessions = 0;
        double olemissoppfga = 2204;
        double olemissoppfta = 785;
        double olemissopporb = 414;
        double olemisstoforced = 501;
        double olemissdefrating = 0;
        double olemisseffectivefgpercentage = 0;
        double olemissteamgamescore = 0;
        double olemissfouls = 702;
        double olemissnetrating = 0;
        double olemissoffensiverating = 0;
        double olemisspace = 0;
        double olemissminutesplayed = 7250;
        double olemisstrueshootingpercentage = 0;
        olemisswinpercentage = (olemisswins/olemissgamesplayed)*100;
        olemissppg = (olemisspointsscored/olemissgamesplayed);
        olemisspapg = (olemisspointsallowed/olemissgamesplayed);
        olemissfgptg = (olemissfgm/olemissfga)*100;
        olemiss2ptfgptg = (olemiss2ptfgm/olemiss2ptfga)*100;
        olemiss3ptfgptg = (olemiss3ptfgm/olemiss3ptfga)*100;
        olemissassistspergame = (olemissassists/olemissgamesplayed);
        olemissassistsperfgm = (olemissassists/olemissfgm);
        olemissassiststoturnoverratio = (olemissassists/olemissturnovers);
        olemissblockspergame = (olemissblocks/olemissgamesplayed);
        olemissstealspergame = (olemisssteals/olemissgamesplayed);
        olemissturnoverspergame = (olemissturnovers/olemissgamesplayed);
        olemissturnoverpercentage = (100*olemissturnovers)/(olemissfga+(0.475*olemissfta)+olemissturnovers);
        olemissftpercentage = (olemissftm/olemissfta)*100;
        olemissreboundspergame = (olemissrebounds/olemissgamesplayed);
        olemissoffreboundspergame = (olemissoffrebounds/olemissgamesplayed);
        olemissdefreboundspergame = (olemissdefrebounds/olemissgamesplayed);
        olemisspossessions = (0.5 * (olemissfga + (0.475 * olemissfta) - olemissoffrebounds + olemissturnovers) + 0.5 * (olemissoppfga + (0.475 * olemissoppfta) - olemissopporb + olemisstoforced));
        olemissdefrating = 100*(olemisspointsallowed/olemisspossessions);
        olemisseffectivefgpercentage = ((olemissfgm+(0.5*olemiss3ptfgm))/olemissfga)*100;
        olemissteamgamescore = ((olemisspointsscored + (0.4 * olemissfgm) - (0.7 * olemissfga) - (0.4*(olemissfta - olemissftm)) + (0.7 * olemissoffrebounds) + (0.3 * olemissdefrebounds) + olemisssteals + (0.7 * olemissassists) + (0.7 * olemissblocks) - (0.4 * olemissfouls) - olemissturnovers)/8)/olemissgamesplayed;
        olemissnetrating = 100 * ((olemisspointsscored - olemisspointsallowed) / olemisspossessions);
        olemissoffensiverating = 100 * (olemisspointsscored / olemisspossessions);
        olemisspace = 40 * (olemisspossessions / (0.2 * olemissminutesplayed));
        olemisstrueshootingpercentage = (olemisspointsscored / (2 * (olemissfga + 0.475 * olemissfta)))*100;
        System.out.println("\nOle Miss:\n" + olemisswinpercentage + "% Win Percentage\n" + olemissppg +
                " Points Per Game\n"+olemisspapg+ " Points Allowed Per Game\n"+olemissfgptg+
                "% Field Goal Percentage\n"+olemiss2ptfgptg+"% 2 Point Field Goal Percentage\n"
                +olemiss3ptfgptg+"% 3 Point Field Goal Percentage\n"+olemissassistspergame+" Assists Per Game\n"+
                olemissassistsperfgm+" Assists Per FGM\n"+ olemissassiststoturnoverratio+" Assists : TO Ratio\n"+
                olemissblockspergame+" Blocks Per Game\n"+olemissstealspergame+" Steals Per Game\n"+
                olemissturnoverspergame+" TO Per Game\n"+olemissturnoverpercentage+" TO%\n"+ olemissftpercentage+" FT%\n"+
                olemissreboundspergame+" Rebounds Per Game\n"+olemissoffreboundspergame+" Offensive Rebounds Per game\n"+
                olemissdefreboundspergame+" Defensive Rebounds Per Game\n"+olemisspossessions+" Possessions\n"+
                olemissdefrating+" Defensive Rating\n"+olemisseffectivefgpercentage+" EFG%\n"+olemissteamgamescore+" Team Game Score\n"
                +olemissnetrating+" Net Rating\n"+olemissoffensiverating+" Offensive Rating\n"+olemisspace+" Pace\n"+olemisstrueshootingpercentage+" True Shooting Percentage");





        double miamifinalranking = 0.0;
        double wakeforestfinalranking = 0.0;
        double texastechfinalranking = 0.0;
        double arkansasfinalranking = 0.0;
        double northwesternfinalranking = 0.0;
        double syracusefinalranking = 0.0;
        double vanderbiltfinalranking = 0.0;
        double michiganstatefinalranking = 0.0;
        double clemsonfinalranking = 0.0;
        double daytonfinalranking = 0.0;
        double rhodeislandfinalranking = 0.0;
        double marylandfinalranking = 0.0;
        double virginiatechfinalranking = 0.0;
        double utahfinalranking = 0.0;
        double houstonfinalranking = 0.0;
        double setonhallfinalranking = 0.0;
        double vcufinalranking = 0.0;
        double uscfinalranking = 0.0;
        double oklahomafinalranking = 0.0;
        double alabamafinalranking = 0.0;
        double tennesseefinalranking = 0.0;
        double providencefinalranking = 0.0;
        double georgetownfinalranking = 0.0;
        double georgiafinalranking = 0.0;
        double calfinalranking = 0.0;
        double texasfinalranking = 0.0;
        double illinoisfinalranking = 0.0;
        double nevadafinalranking = 0.0;
        double texasamfinalranking = 0.0;
        double ohiostatefinalranking = 0.0;
        double illinoisstatefinalranking = 0.0;
        double iowafinalranking = 0.0;
        double middletenfinalranking = 0.0;
        double olemissfinalranking = 0.0;

        double miamitournamentwinptg = 0.0;
        double wakeforesttournamentwinptg = 0.0;
        double texastechtournamentwinptg = 0.0;
        double arkansastournamentwinptg = 0.0;
        double northwesterntournamentwinptg = 0.0;
        double syracusetournamentwinptg = 0.0;
        double vanderbilttournamentwinptg = 0.0;
        double michiganstatetournamentwinptg = 0.0;
        double clemsontournamentwinptg = 0.0;
        double daytontournamentwinptg = 0.0;
        double rhodeislandtournamentwinptg = 0.0;
        double marylandtournamentwinptg = 0.0;
        double virginiatechtournamentwinptg = 0.0;
        double utahtournamentwinptg = 0.0;
        double houstontournamentwinptg = 0.0;
        double setonhalltournamentwinptg = 0.0;
        double vcutournamentwinptg = 0.0;
        double usctournamentwinptg = 0.0;
        double oklahomatournamentwinptg = 0.0;
        double alabamatournamentwinptg = 0.0;
        double tennesseetournamentwinptg = 0.0;
        double providencetournamentwinptg = 0.0;
        double georgetowntournamentwinptg = 0.0;
        double georgiatournamentwinptg = 0.0;
        double caltournamentwinptg = 0.0;
        double texastournamentwinptg = 0.0;
        double illinoistournamentwinptg = 0.0;
        double nevadatournamentwinptg = 0.0;
        double texasamtournamentwinptg = 0.0;
        double ohiostatetournamentwinptg = 0.0;
        double illinoisstatetournamentwinptg = 0.0;
        double iowatournamentwinptg = 0.0;
        double middletentournamentwinptg = 0.0;
        double olemisstournamentwinptg = 0.0;


        System.out.println("\nBen Marks Power Ratings");
        miamifinalranking = ((((miamiwinpercentage*75)*(50*(miamippg/miamipapg))*(50*miamifgptg)*(10*miamiassistsperfgm)*(20*miamiassiststoturnoverratio)*(miamiblockspergame+miamistealspergame)*miamiftpercentage*(miamioffensiverating+miamidefrating+miaminetrating+miamipace)*miamitrueshootingpercentage)/miamiturnoverpercentage)/1000000000/10000000);
        System.out.println("Miami: "+miamifinalranking);
        wakeforestfinalranking = ((((wakeforestwinpercentage*75)*(50*(wakeforestppg/wakeforestpapg))*(50*wakeforestfgptg)*(10*wakeforestassistsperfgm)*(20*wakeforestassiststoturnoverratio)*(wakeforestblockspergame+wakeforeststealspergame)*wakeforestftpercentage*(wakeforestoffensiverating+wakeforestdefrating+wakeforestnetrating+wakeforestpace)*wakeforesttrueshootingpercentage)/wakeforestturnoverpercentage)/1000000000/10000000);
        System.out.println("Wake Forest: "+wakeforestfinalranking);
        texastechfinalranking = ((((texastechwinpercentage*75)*(50*(texastechppg/texastechpapg))*(50*texastechfgptg)*(10*texastechassistsperfgm)*(20*texastechassiststoturnoverratio)*(texastechblockspergame+texastechstealspergame)*texastechftpercentage*(texastechoffensiverating+texastechdefrating+texastechnetrating+texastechpace)*texastechtrueshootingpercentage)/texastechturnoverpercentage)/1000000000/10000000);
        System.out.println("Texas Tech: "+texastechfinalranking);
        arkansasfinalranking = ((((arkansaswinpercentage*75)*(50*(arkansasppg/arkansaspapg))*(50*arkansasfgptg)*(10*arkansasassistsperfgm)*(20*arkansasassiststoturnoverratio)*(arkansasblockspergame+arkansasstealspergame)*arkansasftpercentage*(arkansasoffensiverating+arkansasdefrating+arkansasnetrating+arkansaspace)*arkansastrueshootingpercentage)/arkansasturnoverpercentage)/1000000000/10000000);
        System.out.println("Arkansas: "+arkansasfinalranking);
        northwesternfinalranking = ((((northwesternwinpercentage*75)*(50*(northwesternppg/northwesternpapg))*(50*northwesternfgptg)*(10*northwesternassistsperfgm)*(20*northwesternassiststoturnoverratio)*(northwesternblockspergame+northwesternstealspergame)*northwesternftpercentage*(northwesternoffensiverating+northwesterndefrating+northwesternnetrating+northwesternpace)*northwesterntrueshootingpercentage)/northwesternturnoverpercentage)/1000000000/10000000);
        System.out.println("Northwestern: "+northwesternfinalranking);
        syracusefinalranking = ((((syracusewinpercentage*75)*(50*(syracuseppg/syracusepapg))*(50*syracusefgptg)*(10*syracuseassistsperfgm)*(20*syracuseassiststoturnoverratio)*(syracuseblockspergame+syracusestealspergame)*syracuseftpercentage*(syracuseoffensiverating+syracusedefrating+syracusenetrating+syracusepace)*syracusetrueshootingpercentage)/syracuseturnoverpercentage)/1000000000/10000000);
        System.out.println("Syracuse: "+syracusefinalranking);
        vanderbiltfinalranking = ((((vanderbiltwinpercentage*75)*(50*(vanderbiltppg/vanderbiltpapg))*(50*vanderbiltfgptg)*(10*vanderbiltassistsperfgm)*(20*vanderbiltassiststoturnoverratio)*(vanderbiltblockspergame+vanderbiltstealspergame)*vanderbiltftpercentage*(vanderbiltoffensiverating+vanderbiltdefrating+vanderbiltnetrating+vanderbiltpace)*vanderbilttrueshootingpercentage)/vanderbiltturnoverpercentage)/1000000000/10000000);
        System.out.println("Vanderbilt: "+vanderbiltfinalranking);
        michiganstatefinalranking = ((((michiganstatewinpercentage*75)*(50*(michiganstateppg/michiganstatepapg))*(50*michiganstatefgptg)*(10*michiganstateassistsperfgm)*(20*michiganstateassiststoturnoverratio)*(michiganstateblockspergame+michiganstatestealspergame)*michiganstateftpercentage*(michiganstateoffensiverating+michiganstatedefrating+michiganstatenetrating+michiganstatepace)*michiganstatetrueshootingpercentage)/michiganstateturnoverpercentage)/1000000000/10000000);
        System.out.println("Michigan State: "+michiganstatefinalranking);
        clemsonfinalranking = ((((clemsonwinpercentage*75)*(50*(clemsonppg/clemsonpapg))*(50*clemsonfgptg)*(10*clemsonassistsperfgm)*(20*clemsonassiststoturnoverratio)*(clemsonblockspergame+clemsonstealspergame)*clemsonftpercentage*(clemsonoffensiverating+clemsondefrating+clemsonnetrating+clemsonpace)*clemsontrueshootingpercentage)/clemsonturnoverpercentage)/1000000000/10000000);
        System.out.println("Clemson: "+clemsonfinalranking);
        daytonfinalranking = ((((daytonwinpercentage*75)*(50*(daytonppg/daytonpapg))*(50*daytonfgptg)*(10*daytonassistsperfgm)*(20*daytonassiststoturnoverratio)*(daytonblockspergame+daytonstealspergame)*daytonftpercentage*(daytonoffensiverating+daytondefrating+daytonnetrating+daytonpace)*daytontrueshootingpercentage)/daytonturnoverpercentage)/1000000000/10000000);
        System.out.println("Dayton: "+daytonfinalranking);
        rhodeislandfinalranking = ((((rhodeislandwinpercentage*75)*(50*(rhodeislandppg/rhodeislandpapg))*(50*rhodeislandfgptg)*(10*rhodeislandassistsperfgm)*(20*rhodeislandassiststoturnoverratio)*(rhodeislandblockspergame+rhodeislandstealspergame)*rhodeislandftpercentage*(rhodeislandoffensiverating+rhodeislanddefrating+rhodeislandnetrating+rhodeislandpace)*rhodeislandtrueshootingpercentage)/rhodeislandturnoverpercentage)/1000000000/10000000);
        System.out.println("Rhode Island: "+rhodeislandfinalranking);
        marylandfinalranking = ((((marylandwinpercentage*75)*(50*(marylandppg/marylandpapg))*(50*marylandfgptg)*(10*marylandassistsperfgm)*(20*marylandassiststoturnoverratio)*(marylandblockspergame+marylandstealspergame)*marylandftpercentage*(marylandoffensiverating+marylanddefrating+marylandnetrating+marylandpace)*marylandtrueshootingpercentage)/marylandturnoverpercentage)/1000000000/10000000);
        System.out.println("Maryland: "+marylandfinalranking);
        virginiatechfinalranking = ((((virginiatechwinpercentage*75)*(50*(virginiatechppg/virginiatechpapg))*(50*virginiatechfgptg)*(10*virginiatechassistsperfgm)*(20*virginiatechassiststoturnoverratio)*(virginiatechblockspergame+virginiatechstealspergame)*virginiatechftpercentage*(virginiatechoffensiverating+virginiatechdefrating+virginiatechnetrating+virginiatechpace)*virginiatechtrueshootingpercentage)/virginiatechturnoverpercentage)/1000000000/10000000);
        System.out.println("Virginia Tech: "+virginiatechfinalranking);
        utahfinalranking = ((((utahwinpercentage*75)*(50*(utahppg/utahpapg))*(50*utahfgptg)*(10*utahassistsperfgm)*(20*utahassiststoturnoverratio)*(utahblockspergame+utahstealspergame)*utahftpercentage*(utahoffensiverating+utahdefrating+utahnetrating+utahpace)*utahtrueshootingpercentage)/utahturnoverpercentage)/1000000000/10000000);
        System.out.println("Utah: "+utahfinalranking);
        houstonfinalranking = ((((houstonwinpercentage*75)*(50*(houstonppg/houstonpapg))*(50*houstonfgptg)*(10*houstonassistsperfgm)*(20*houstonassiststoturnoverratio)*(houstonblockspergame+houstonstealspergame)*houstonftpercentage*(houstonoffensiverating+houstondefrating+houstonnetrating+houstonpace)*houstontrueshootingpercentage)/houstonturnoverpercentage)/1000000000/10000000);
        System.out.println("Houston: "+houstonfinalranking);
        setonhallfinalranking = ((((setonhallwinpercentage*75)*(50*(setonhallppg/setonhallpapg))*(50*setonhallfgptg)*(10*setonhallassistsperfgm)*(20*setonhallassiststoturnoverratio)*(setonhallblockspergame+setonhallstealspergame)*setonhallftpercentage*(setonhalloffensiverating+setonhalldefrating+setonhallnetrating+setonhallpace)*setonhalltrueshootingpercentage)/setonhallturnoverpercentage)/1000000000/10000000);
        System.out.println("Seton Hall: "+setonhallfinalranking);
        vcufinalranking = ((((vcuwinpercentage*75)*(50*(vcuppg/vcupapg))*(50*vcufgptg)*(10*vcuassistsperfgm)*(20*vcuassiststoturnoverratio)*(vcublockspergame+vcustealspergame)*vcuftpercentage*(vcuoffensiverating+vcudefrating+vcunetrating+vcupace)*vcutrueshootingpercentage)/vcuturnoverpercentage)/1000000000/10000000);
        System.out.println("VCU: "+vcufinalranking);
        uscfinalranking = ((((uscwinpercentage*75)*(50*(uscppg/uscpapg))*(50*uscfgptg)*(10*uscassistsperfgm)*(20*uscassiststoturnoverratio)*(uscblockspergame+uscstealspergame)*uscftpercentage*(uscoffensiverating+uscdefrating+uscnetrating+uscpace)*usctrueshootingpercentage)/uscturnoverpercentage)/1000000000/10000000);
        System.out.println("USC: "+uscfinalranking);
        oklahomafinalranking = ((((oklahomawinpercentage*75)*(50*(oklahomappg/oklahomapapg))*(50*oklahomafgptg)*(10*oklahomaassistsperfgm)*(20*oklahomaassiststoturnoverratio)*(oklahomablockspergame+oklahomastealspergame)*oklahomaftpercentage*(oklahomaoffensiverating+oklahomadefrating+oklahomanetrating+oklahomapace)*oklahomatrueshootingpercentage)/oklahomaturnoverpercentage)/1000000000/10000000);
        System.out.println("Oklahoma: "+oklahomafinalranking);
        alabamafinalranking = ((((alabamawinpercentage*75)*(50*(alabamappg/alabamapapg))*(50*alabamafgptg)*(10*alabamaassistsperfgm)*(20*alabamaassiststoturnoverratio)*(alabamablockspergame+alabamastealspergame)*alabamaftpercentage*(alabamaoffensiverating+alabamadefrating+alabamanetrating+alabamapace)*alabamatrueshootingpercentage)/alabamaturnoverpercentage)/1000000000/10000000);
        System.out.println("Alabama: "+alabamafinalranking);
        tennesseefinalranking = ((((tennesseewinpercentage*75)*(50*(tennesseeppg/tennesseepapg))*(50*tennesseefgptg)*(10*tennesseeassistsperfgm)*(20*tennesseeassiststoturnoverratio)*(tennesseeblockspergame+tennesseestealspergame)*tennesseeftpercentage*(tennesseeoffensiverating+tennesseedefrating+tennesseenetrating+tennesseepace)*tennesseetrueshootingpercentage)/tennesseeturnoverpercentage)/1000000000/10000000);
        System.out.println("Tennessee: "+tennesseefinalranking);
        providencefinalranking = ((((providencewinpercentage*75)*(50*(providenceppg/providencepapg))*(50*providencefgptg)*(10*providenceassistsperfgm)*(20*providenceassiststoturnoverratio)*(providenceblockspergame+providencestealspergame)*providenceftpercentage*(providenceoffensiverating+providencedefrating+providencenetrating+providencepace)*providencetrueshootingpercentage)/providenceturnoverpercentage)/1000000000/10000000);
        System.out.println("Providence: "+providencefinalranking);
        georgetownfinalranking = ((((georgetownwinpercentage*75)*(50*(georgetownppg/georgetownpapg))*(50*georgetownfgptg)*(10*georgetownassistsperfgm)*(20*georgetownassiststoturnoverratio)*(georgetownblockspergame+georgetownstealspergame)*georgetownftpercentage*(georgetownoffensiverating+georgetowndefrating+georgetownnetrating+georgetownpace)*georgetowntrueshootingpercentage)/georgetownturnoverpercentage)/1000000000/10000000);
        System.out.println("Georgetown: "+georgetownfinalranking);
        georgiafinalranking = ((((georgiawinpercentage*75)*(50*(georgiappg/georgiapapg))*(50*georgiafgptg)*(10*georgiaassistsperfgm)*(20*georgiaassiststoturnoverratio)*(georgiablockspergame+georgiastealspergame)*georgiaftpercentage*(georgiaoffensiverating+georgiadefrating+georgianetrating+georgiapace)*georgiatrueshootingpercentage)/georgiaturnoverpercentage)/1000000000/10000000);
        System.out.println("Georgia: "+georgiafinalranking);
        calfinalranking = ((((calwinpercentage*75)*(50*(calppg/calpapg))*(50*calfgptg)*(10*calassistsperfgm)*(20*calassiststoturnoverratio)*(calblockspergame+calstealspergame)*calftpercentage*(caloffensiverating+caldefrating+calnetrating+calpace)*caltrueshootingpercentage)/calturnoverpercentage)/1000000000/10000000);
        System.out.println("Cal: "+calfinalranking);
        texasfinalranking = ((((texaswinpercentage*75)*(50*(texasppg/texaspapg))*(50*texasfgptg)*(10*texasassistsperfgm)*(20*texasassiststoturnoverratio)*(texasblockspergame+texasstealspergame)*texasftpercentage*(texasoffensiverating+texasdefrating+texasnetrating+texaspace)*texastrueshootingpercentage)/texasturnoverpercentage)/1000000000/10000000);
        System.out.println("Texas: "+texasfinalranking);
        illinoisfinalranking = ((((illinoiswinpercentage*75)*(50*(illinoisppg/illinoispapg))*(50*illinoisfgptg)*(10*illinoisassistsperfgm)*(20*illinoisassiststoturnoverratio)*(illinoisblockspergame+illinoisstealspergame)*illinoisftpercentage*(illinoisoffensiverating+illinoisdefrating+illinoisnetrating+illinoispace)*illinoistrueshootingpercentage)/illinoisturnoverpercentage)/1000000000/10000000);
        System.out.println("Illinois: "+illinoisfinalranking);
        nevadafinalranking = ((((nevadawinpercentage*75)*(50*(nevadappg/nevadapapg))*(50*nevadafgptg)*(10*nevadaassistsperfgm)*(20*nevadaassiststoturnoverratio)*(nevadablockspergame+nevadastealspergame)*nevadaftpercentage*(nevadaoffensiverating+nevadadefrating+nevadanetrating+nevadapace)*nevadatrueshootingpercentage)/nevadaturnoverpercentage)/1000000000/10000000);
        System.out.println("Nevada: "+nevadafinalranking);
        texasamfinalranking = ((((texasamwinpercentage*75)*(50*(texasamppg/texasampapg))*(50*texasamfgptg)*(10*texasamassistsperfgm)*(20*texasamassiststoturnoverratio)*(texasamblockspergame+texasamstealspergame)*texasamftpercentage*(texasamoffensiverating+texasamdefrating+texasamnetrating+texasampace)*texasamtrueshootingpercentage)/texasamturnoverpercentage)/1000000000/10000000);
        System.out.println("Texas A&M: "+texasamfinalranking);
        ohiostatefinalranking = ((((ohiostatewinpercentage*75)*(50*(ohiostateppg/ohiostatepapg))*(50*ohiostatefgptg)*(10*ohiostateassistsperfgm)*(20*ohiostateassiststoturnoverratio)*(ohiostateblockspergame+ohiostatestealspergame)*ohiostateftpercentage*(ohiostateoffensiverating+ohiostatedefrating+ohiostatenetrating+ohiostatepace)*ohiostatetrueshootingpercentage)/ohiostateturnoverpercentage)/1000000000/10000000);
        System.out.println("Ohio State: "+ohiostatefinalranking);
        illinoisstatefinalranking = ((((illinoisstatewinpercentage*75)*(50*(illinoisstateppg/illinoisstatepapg))*(50*illinoisstatefgptg)*(10*illinoisstateassistsperfgm)*(20*illinoisstateassiststoturnoverratio)*(illinoisstateblockspergame+illinoisstatestealspergame)*illinoisstateftpercentage*(illinoisstateoffensiverating+illinoisstatedefrating+illinoisstatenetrating+illinoisstatepace)*illinoisstatetrueshootingpercentage)/illinoisstateturnoverpercentage)/1000000000/10000000);
        System.out.println("Illinois State: "+illinoisstatefinalranking);
        iowafinalranking = ((((iowawinpercentage*75)*(50*(iowappg/iowapapg))*(50*iowafgptg)*(10*iowaassistsperfgm)*(20*iowaassiststoturnoverratio)*(iowablockspergame+iowastealspergame)*iowaftpercentage*(iowaoffensiverating+iowadefrating+iowanetrating+iowapace)*iowatrueshootingpercentage)/iowaturnoverpercentage)/1000000000/10000000);
        System.out.println("Iowa: "+iowafinalranking);
        middletenfinalranking = ((((middletenwinpercentage*75)*(50*(middletenppg/middletenpapg))*(50*middletenfgptg)*(10*middletenassistsperfgm)*(20*middletenassiststoturnoverratio)*(middletenblockspergame+middletenstealspergame)*middletenftpercentage*(middletenoffensiverating+middletendefrating+middletennetrating+middletenpace)*middletentrueshootingpercentage)/middletenturnoverpercentage)/1000000000/10000000);
        System.out.println("Middle Tennessee: "+middletenfinalranking);
        olemissfinalranking = ((((olemisswinpercentage*75)*(50*(olemissppg/olemisspapg))*(50*olemissfgptg)*(10*olemissassistsperfgm)*(20*olemissassiststoturnoverratio)*(olemissblockspergame+olemissstealspergame)*olemissftpercentage*(olemissoffensiverating+olemissdefrating+olemissnetrating+olemisspace)*olemisstrueshootingpercentage)/olemissturnoverpercentage)/1000000000/10000000);
        System.out.println("Ole Miss: "+olemissfinalranking);

        double totalrankings = miamifinalranking + wakeforestfinalranking + texastechfinalranking + arkansasfinalranking + northwesternfinalranking + syracusefinalranking + vanderbiltfinalranking + michiganstatefinalranking + clemsonfinalranking + daytonfinalranking + rhodeislandfinalranking + marylandfinalranking + virginiatechfinalranking + utahfinalranking + houstonfinalranking + setonhallfinalranking + vcufinalranking + uscfinalranking + oklahomafinalranking + alabamafinalranking + tennesseefinalranking + providencefinalranking + georgetownfinalranking + georgiafinalranking + calfinalranking + texasfinalranking + illinoisfinalranking + nevadafinalranking + texasamfinalranking + ohiostatefinalranking + illinoisstatefinalranking + iowafinalranking + middletenfinalranking + olemissfinalranking;
        System.out.println("\nNCAA Tournament Title Percent Chance: ");
        miamitournamentwinptg = (100*(miamifinalranking/totalrankings));
        System.out.println("Miami: "+miamitournamentwinptg);
        wakeforesttournamentwinptg = (100*(wakeforestfinalranking/totalrankings));
        System.out.println("Wake Forest: "+wakeforesttournamentwinptg);
        texastechtournamentwinptg = (100*(texastechfinalranking/totalrankings));
        System.out.println("Texas Tech: "+texastechtournamentwinptg);
        arkansastournamentwinptg = (100*(arkansasfinalranking/totalrankings));
        System.out.println("Arkansas: "+arkansastournamentwinptg);
        northwesterntournamentwinptg = (100*(northwesternfinalranking/totalrankings));
        System.out.println("Northwestern: "+northwesterntournamentwinptg);
        syracusetournamentwinptg = (100*(syracusefinalranking/totalrankings));
        System.out.println("Syracuse: "+syracusetournamentwinptg);
        vanderbilttournamentwinptg = (100*(vanderbiltfinalranking/totalrankings));
        System.out.println("Vanderbilt: "+vanderbilttournamentwinptg);
        michiganstatetournamentwinptg = (100*(michiganstatefinalranking/totalrankings));
        System.out.println("Michigan State: "+michiganstatetournamentwinptg);
        clemsontournamentwinptg = (100*(clemsonfinalranking/totalrankings));
        System.out.println("Clemson: "+clemsontournamentwinptg);
        daytontournamentwinptg = (100*(daytonfinalranking/totalrankings));
        System.out.println("Dayton: "+daytontournamentwinptg);
        rhodeislandtournamentwinptg = (100*(rhodeislandfinalranking/totalrankings));
        System.out.println("Rhode Island: "+rhodeislandtournamentwinptg);
        marylandtournamentwinptg = (100*(marylandfinalranking/totalrankings));
        System.out.println("Maryland: "+marylandtournamentwinptg);
        virginiatechtournamentwinptg = (100*(virginiatechfinalranking/totalrankings));
        System.out.println("Virginia Tech: "+virginiatechtournamentwinptg);
        utahtournamentwinptg = (100*(utahfinalranking/totalrankings));
        System.out.println("Utah: "+utahtournamentwinptg);
        houstontournamentwinptg = (100*(houstonfinalranking/totalrankings));
        System.out.println("Houston: "+houstontournamentwinptg);
        setonhalltournamentwinptg = (100*(setonhallfinalranking/totalrankings));
        System.out.println("Seton Hall: "+setonhalltournamentwinptg);
        vcutournamentwinptg = (100*(vcufinalranking/totalrankings));
        System.out.println("VCU: "+vcutournamentwinptg);
        usctournamentwinptg = (100*(uscfinalranking/totalrankings));
        System.out.println("USC: "+usctournamentwinptg);
        oklahomatournamentwinptg = (100*(oklahomafinalranking/totalrankings));
        System.out.println("Oklahoma: "+oklahomatournamentwinptg);
        alabamatournamentwinptg = (100*(alabamafinalranking/totalrankings));
        System.out.println("Alabama: "+alabamatournamentwinptg);
        tennesseetournamentwinptg = (100*(tennesseefinalranking/totalrankings));
        System.out.println("Tennessee: "+tennesseetournamentwinptg);
        providencetournamentwinptg = (100*(providencefinalranking/totalrankings));
        System.out.println("Providence: "+providencetournamentwinptg);
        georgetowntournamentwinptg = (100*(georgetownfinalranking/totalrankings));
        System.out.println("Georgetown: "+georgetowntournamentwinptg);
        georgiatournamentwinptg = (100*(georgiafinalranking/totalrankings));
        System.out.println("Georgia: "+georgiatournamentwinptg);
        caltournamentwinptg = (100*(calfinalranking/totalrankings));
        System.out.println("Cal: "+caltournamentwinptg);
        texastournamentwinptg = (100*(texasfinalranking/totalrankings));
        System.out.println("Texas: "+texastournamentwinptg);
        illinoistournamentwinptg = (100*(illinoisfinalranking/totalrankings));
        System.out.println("Illinois: "+illinoistournamentwinptg);
        nevadatournamentwinptg = (100*(nevadafinalranking/totalrankings));
        System.out.println("Nevada: "+nevadatournamentwinptg);
        texasamtournamentwinptg = (100*(texasamfinalranking/totalrankings));
        System.out.println("Texas A&M: "+texasamtournamentwinptg);
        ohiostatetournamentwinptg = (100*(ohiostatefinalranking/totalrankings));
        System.out.println("Ohio State: "+ohiostatetournamentwinptg);
        illinoisstatetournamentwinptg = (100*(illinoisstatefinalranking/totalrankings));
        System.out.println("Illinois State: "+illinoisstatetournamentwinptg);
        iowatournamentwinptg = (100*(iowafinalranking/totalrankings));
        System.out.println("Iowa: "+iowatournamentwinptg);
        middletentournamentwinptg = (100*(middletenfinalranking/totalrankings));
        System.out.println("Middle Tennessee: "+middletentournamentwinptg);
        olemisstournamentwinptg = (100*(olemissfinalranking/totalrankings));
        System.out.println("Ole Miss: "+olemisstournamentwinptg);

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
*/