package com.example.demo;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class MainController{
	
	@Autowired
	private BodyRepository bodyRepository;
	
	private int flag = 0;
	
	public void importData() {
		Body temp = new Body();
		//基本信息
		temp.setNum("433");
		temp.setName("Eros");
		temp.setSerialNum("1898 DQ");
		temp.setClassification(Classification.Amor);
		temp.setSpk_id(2000433);
		
		//轨道信息
		OrbitalElement oeE = new OrbitalElement();
		oeE.setElement(Element.E);
		oeE.setValue(0.2225889698301071);
		oeE.setUncertainly(1.2099e-08);
		oeE.setUnit("");
		temp.setOE(oeE);
		
		OrbitalElement oeA = new OrbitalElement();
		oeA.setElement(Element.A);
		oeA.setValue(1.457940027185708);
		oeA.setUncertainly(4.7533e-10);
		oeA.setUnit("au");
		temp.setOE(oeA);
		
		OrbitalElement oeQ = new OrbitalElement();
		oeQ.setElement(Element.Q);
		oeQ.setValue(1.133418658460363);
		oeQ.setUncertainly(1.7812e-08);
		oeQ.setUnit("au");
		temp.setOE(oeQ);
		
		OrbitalElement oeI = new OrbitalElement();
		oeI.setElement(Element.I);
		oeI.setValue(10.82759100494802);
		oeI.setUncertainly(2.8225e-06);
		oeI.setUnit("deg");
		temp.setOE(oeI);
		
		OrbitalElement oeNode = new OrbitalElement();
		oeNode.setElement(Element.NODE);
		oeNode.setValue(304.3221633898424);
		oeNode.setUncertainly(1.1845e-05);
		oeNode.setUnit("deg");
		temp.setOE(oeNode);
		
		OrbitalElement oePeri = new OrbitalElement();
		oePeri.setElement(Element.PERI);
		oePeri.setValue(178.8165910886752);
		oePeri.setUncertainly(1.3126e-05);
		oePeri.setUnit("deg");
		temp.setOE(oePeri);
		
		OrbitalElement oeMUpper = new OrbitalElement();
		oeMUpper.setElement(Element.MUPPER);
		oeMUpper.setValue(71.28027812836476);
		oeMUpper.setUncertainly(5.6926e-06);
		oeMUpper.setUnit("deg");
		temp.setOE(oeMUpper);
		
		OrbitalElement oeTp = new OrbitalElement();
		oeTp.setElement(Element.TP);
		oeTp.setValue(2457873.186399333365);
		oeTp.setUncertainly(1.0144e-05);
		oeTp.setUnit("JED");
		temp.setOE(oeTp);
		
		OrbitalElement oePeriodByDay = new OrbitalElement();
		oePeriodByDay.setElement(Element.PERIODBYDAY);
		oePeriodByDay.setValue(642.9954742523677);
		oePeriodByDay.setUncertainly(3.1445e-07);
		oePeriodByDay.setUnit("d");
		temp.setOE(oePeriodByDay);
		
		OrbitalElement oePeriodByYr = new OrbitalElement();
		oePeriodByYr.setElement(Element.PERIODBYYR);
		oePeriodByYr.setValue(1.76);
		oePeriodByYr.setUncertainly(8.609e-10);
		oePeriodByYr.setUnit("yr");
		temp.setOE(oePeriodByYr);
		
		OrbitalElement oeN = new OrbitalElement();
		oeN.setElement(Element.N);
		oeN.setValue(0.5598795239089109);
		oeN.setUncertainly(2.7381e-10);
		oeN.setUnit("deg/d");
		temp.setOE(oeN);
		
		OrbitalElement oeQUpper = new OrbitalElement();
		oeQUpper.setElement(Element.QUPPER);
		oeQUpper.setValue(1.782461395911054);
		oeQUpper.setUncertainly(5.8114e-10);
		oeQUpper.setUnit("au");
		temp.setOE(oeQUpper);
		
		//轨道参数
		temp.setTotal_obs_used(6084);
		temp.setDelay_obs_used(1);
		temp.setDropper_obs_used(3);
		temp.setData_arc_span(19683);
		Date dFirst = Date.valueOf("1963-07-15");
		temp.setFirst_obs_used(dFirst);
		Date dLast = Date.valueOf("2017-06-04");
		temp.setLast_obs_used(dLast);
		temp.setPlanetary_ephem("DE431");
		temp.setSB_pert_ephem("SB431-N16");
		temp.setCondition_code(0);
		temp.setFit_RMS(0.36235);
		temp.setData_source("ORB");
		temp.setProducer("Otto Matic");
		Date dSolution = Date.valueOf("2017-06-06");
		temp.setSolution_data(dSolution);
		
		
		//物理参数
		PhysicalParameter ppAM = new PhysicalParameter();
		ppAM.setParameter(Parameter.AM);
		ppAM.setSymbol("H");
		ppAM.setValue("11.16");
		ppAM.setUnit("mag");
		ppAM.setSigma("n/a");
		ppAM.setReference("PDS3 (MPC 17258)");
		ppAM.setNote("");
		temp.setPP(ppAM);
		
		PhysicalParameter ppMS = new PhysicalParameter();
		ppMS.setParameter(Parameter.MS);
		ppMS.setSymbol("G");
		ppMS.setValue("0.46");
		ppMS.setUnit("");
		ppMS.setSigma("n/a");
		ppMS.setReference("PDS3 (MPC 17258)");
		ppMS.setNote("Fit");
		temp.setPP(ppMS);
		
		PhysicalParameter ppDiameter = new PhysicalParameter();
		ppDiameter.setParameter(Parameter.DIAMETER);
		ppDiameter.setSymbol("diameter");
		ppDiameter.setValue("16.84");
		ppDiameter.setUnit("km");
		ppDiameter.setSigma("0.06");
		ppDiameter.setReference("Yeomans et al. (2000) Science v.289,pp.2085-2088");
		ppDiameter.setNote("sphere having the measured volume of 2503 +/- 25 km^3");
		temp.setPP(ppDiameter);
		
		PhysicalParameter ppExtent = new PhysicalParameter();
		ppExtent.setParameter(Parameter.EXTENT);
		ppExtent.setSymbol("extent");
		ppExtent.setValue("34.4*11.2*11.2");
		ppExtent.setUnit("km");
		ppExtent.setSigma("n/a");
		ppExtent.setReference("Veverka et al. (2000) Science v.289,pp.2088-2097");
		ppExtent.setNote("");
		temp.setPP(ppExtent);
		
		PhysicalParameter ppGM = new PhysicalParameter();
		ppGM.setParameter(Parameter.GM);
		ppGM.setSymbol("GM");
		ppGM.setValue("4.463e-04");
		ppGM.setUnit("km^3/s^2");
		ppGM.setSigma("0.001e-04");
		ppGM.setReference("Yeomans et al. (2000) Science v.289,pp.2085-2088");
		ppGM.setNote("");
		temp.setPP(ppGM);
		
		PhysicalParameter ppBD = new PhysicalParameter();
		ppBD.setParameter(Parameter.B_DENSITY);
		ppBD.setSymbol("density");
		ppBD.setValue("2.67");
		ppBD.setUnit("g/cm^3");
		ppBD.setSigma("0.03");
		ppBD.setReference("Yeomans et al. (2000) Science v.289,pp.2085-2088");
		ppBD.setNote("based on a volume of 2503 +/- 25 km^3. Porosity 10-30%.");
		temp.setPP(ppBD);
		
		PhysicalParameter ppRP = new PhysicalParameter();
		ppRP.setParameter(Parameter.R_PERIOD);
		ppRP.setSymbol("rot_per");
		ppRP.setValue("5.270");
		ppRP.setUnit("h");
		ppRP.setSigma("n/a");
		ppRP.setReference("LCDB (Rev. 2017-April); Warner et al., 2009");
		ppRP.setNote("Published Reference List:\n" + 
				"[Campa, M. (1938) Mem. Soc. Astron. Ital. 11, 285-301.]\n" + 
				"[Beyer, M. (1953) Astron. Nachr. 281, 121-130.]");
		temp.setPP(ppRP);
		
		PhysicalParameter ppGA = new PhysicalParameter();
		ppGA.setParameter(Parameter.GA);
		ppGA.setSymbol("albedo");
		ppGA.setValue("0.25");
		ppGA.setUnit("");
		ppGA.setSigma("0.06");
		ppGA.setReference("Veverka et al. (2000) Science v.289,pp.2088-2097");
		ppGA.setNote("average");
		temp.setPP(ppGA);
		
		PhysicalParameter ppBV = new PhysicalParameter();
		ppBV.setParameter(Parameter.B_V);
		ppBV.setSymbol("BV");
		ppBV.setValue("0.921");
		ppBV.setUnit("mag");
		ppBV.setSigma("0.021");
		ppBV.setReference("EAR-A-5-DDR-UBV-MEAN-VALUES-V1.1");
		ppBV.setNote("#obs=48; phase (min.=8.73, mean=34.88, max.=57.19) deg.");
		temp.setPP(ppBV);
		
		PhysicalParameter ppUB = new PhysicalParameter();
		ppUB.setParameter(Parameter.U_B);
		ppUB.setSymbol("UB");
		ppUB.setValue("0.531");
		ppUB.setUnit("mag");
		ppUB.setSigma("0.027");
		ppUB.setReference("EAR-A-5-DDR-UBV-MEAN-VALUES-V1.1");
		ppUB.setNote("#obs=45; phase (min.=7.37, mean=34.55, max.=57.19) deg.");
		temp.setPP(ppUB);
		
		PhysicalParameter ppTST = new PhysicalParameter();
		ppTST.setParameter(Parameter.TST);
		ppTST.setSymbol("spec_T");
		ppTST.setValue("S");
		ppTST.setUnit("");
		ppTST.setSigma("n/a");
		ppTST.setReference("EAR-A-5-DDR-TAXONOMY-V4.0");
		ppTST.setNote("used 7 color indices; used ground-based radiometric albedo");
		temp.setPP(ppTST);
		
		PhysicalParameter ppSST = new PhysicalParameter();
		ppSST.setParameter(Parameter.SST);
		ppSST.setSymbol("spec_B");
		ppSST.setValue("S");
		ppSST.setUnit("");
		ppSST.setSigma("n/a");
		ppSST.setReference("EAR-A-5-DDR-TAXONOMY-V4.0");
		ppSST.setNote("based on a high-resolution spectrum by Xu et al. (1995) or Bus and Binzel (2002)");
		temp.setPP(ppSST);
		
		bodyRepository.save(temp);
	}
	
	@RequestMapping(path="/search")
	public String showData(@RequestParam(value="keyword") String keyword, Model model) {
		if(flag==0)
		{
			importData();
			flag =1;
		}
		model.addAttribute("keyword", keyword);
		System.out.println(keyword);
		return "db";
	}
}