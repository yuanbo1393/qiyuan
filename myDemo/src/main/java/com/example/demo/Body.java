package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Column;

import java.sql.Date;

@Entity
public class Body{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;				//主键
	
	//基本信息
	@Column(unique=true)
	private String num;			//编号，例433
	
	private String name;			//名字，例Eros
	private String serialNum;	//序列号，例1898 DQ
	@Column(columnDefinition="double default 0")
	private int classification;	//类型，例Amor
	@Column(columnDefinition="int default 0")
	private long spk_id;			//spk id，例2000433

	//轨道信息Orbital Elements
	//Element e
	@Column(columnDefinition="double default 0")
	private double oe_e_v;		//e value
	@Column(columnDefinition="double default 0")
	private double oe_e_unc;		//e uncertainly
	
	//Element a
	@Column(columnDefinition="double default 0")
	private double oe_a_v;		//a value
	@Column(columnDefinition="double default 0")
	private double oe_a_unc;		//a uncertainly
	
	//Element q
	@Column(columnDefinition="double default 0")
	private double oe_q_v;		//q value
	@Column(columnDefinition="double default 0")
	private double oe_q_unc;		//q uncertainly
	
	//Element i
	@Column(columnDefinition="double default 0")
	private double oe_i_v;		//i value
	@Column(columnDefinition="double default 0")
	private double oe_i_unc;		//i uncertainly
	
	//Element node
	@Column(columnDefinition="double default 0")
	private double oe_node_v;		//node value
	@Column(columnDefinition="double default 0")
	private double oe_node_unc;		//node uncertainly
	
	//Element peri
	@Column(columnDefinition="double default 0")
	private double oe_peri_v;		//peri value
	@Column(columnDefinition="double default 0")
	private double oe_peri_unc;		//peri uncertainly
	
	//Element mUpper
	@Column(columnDefinition="double default 0")
	private double oe_mUpper_v;		//M value
	@Column(columnDefinition="double default 0")
	private double oe_mUpper_unc;	//M uncertainly
	
	//Element tp
	@Column(columnDefinition="double default 0")
	private double oe_tp_v;		//Tp value
	@Column(columnDefinition="double default 0")
	private double oe_tp_unc;	//Tp uncertainly
	
	//Element periodByDay
	@Column(columnDefinition="double default 0")
	private double oe_periodByDay_v;		//period(days) value
	@Column(columnDefinition="double default 0")
	private double oe_periodByDay_unc;	//period(days) uncertainly
	
	//Element periodByYr
	@Column(columnDefinition="double default 0")
	private double oe_periodByYr_v;		//period(years) value
	@Column(columnDefinition="double default 0")
	private double oe_periodByYr_unc;	//period(years) uncertainly
	
	//Element n
	@Column(columnDefinition="double default 0")
	private double oe_n_v;		//n value
	@Column(columnDefinition="double default 0")
	private double oe_n_unc;		//n uncertainly
	
	//Element qUpper
	@Column(columnDefinition="double default 0")
	private double oe_qUpper_v;		//Q value
	@Column(columnDefinition="double default 0")
	private double oe_qUpper_unc;	//Q uncertainly
	
	
	//轨道参数Orbit Determination Parameters
	private Integer total_obs_used;
	private Integer delay_obs_used;
	private Integer dropper_obs_used;
	private Integer data_arc_span;
	private Date first_obs_used;
	private Date last_obs_used;
	private String planetary_ephem;
	private String sb_pert_ephem;
	private Integer condition_code;
	private Double fit_RMS;
	private String data_source;
	private String producer;
	private Date solution_date;
	
	//物理参数Physical Parameter
	//absolute magnitude
	private String am_symbol;	//absolute magnitude Symbol
	private Double am_value;		//absolute magnitude Value
	private Double am_sigma;		//absolute magnitude Sigma
	private String am_reference;	//absolute magnitude Reference
	private String am_note;		//absolute magnitude Note
	//magnitude slope
	private String ms_symbol;	//magnitude slope Symbol
	private Double ms_value;		//magnitude slope Value
	private Double ms_sigma;		//magnitude slope Sigma
	private String ms_reference;	//magnitude slope Reference
	private String ms_note;		//magnitude slope Note
	//diameter
	private String diameter_symbol;		//diameter Symbol
	private Double diameter_value;		//diameter Value
	private Double diameter_sigma;		//diameter Sigma
	private String diameter_reference;	//diameter Reference
	private String diameter_note;		//diameter Note
	//extent
	private String extent_symbol;	//extent Symbol
	private Double extent_value_l;	//extent Value L
	private Double extent_value_w;	//extent Value W
	private Double extent_value_h;	//extent Value H
	private Double extent_sigma;		//extent Sigma
	private String extent_reference;	//extent Reference
	private String extent_note;		//extent Note
	
	//gm
	private String gm_symbol;	//gm Symbol
	private Double gm_value;		//gm Value
	private Double gm_sigma;		//gm Sigma
	private String gm_reference;	//gm Reference
	private String gm_note;		//gm Note
	
	//bulk density
	private String bd_symbol;	//bulk density Symbol
	private Double bd_value;		//bulk density Value
	private Double bd_sigma;		//bulk density Sigma
	private String bd_reference;	//bulk density Reference
	private String bd_note;		//bulk density Note
	
	//rotation period
	private String rp_symbol;	//rotation period Symbol
	private Double rp_value;		//rotation period Value
	private Double rp_sigma;		//rotation period Sigma
	private String rp_reference;	//rotation period Reference
	@Lob
	private String rp_note;		//rotation period Note
	
	//geometric albedo
	private String ga_symbol;	//geometric albedo Symbol
	private Double ga_value;		//geometric albedo Value
	private Double ga_sigma;		//geometric albedo Sigma
	private String ga_reference;	//geometric albedo Reference
	private String ga_note;		//geometric albedo Note
	
	//B-V
	private String bv_symbol;	//B-V Symbol
	private Double bv_value;		//B-V Value
	private Double bv_sigma;		//B-V Sigma
	private String bv_reference;	//B-V Reference
	private String bv_note;		//B-V Note
	
	//U-B
	private String ub_symbol;	//U-B Symbol
	private Double ub_value;		//U-B Value
	private Double ub_sigma;		//U-B Sigma
	private String ub_reference;	//U-B Reference
	private String ub_note;		//U-B Note
	
	//Tholen spectral type
	private String tst_symbol;	//Tholen spectral type Symbol
	private String tst_value;	//Tholen spectral type Value
	private Double tst_sigma;	//Tholen spectral type Sigma
	private String tst_reference;//Tholen spectral type Reference
	private String tst_note;		//Tholen spectral type Note
	
	//SMASSII spectral type
	private String sst_symbol;	//SMASSII spectral type Symbol
	private String sst_value;	//SMASSII spectral type Value
	private Double sst_sigma;	//SMASSII spectral type Sigma
	private String sst_reference;//SMASSII spectral type Reference
	private String sst_note;		//SMASSII spectral type Note
	
	//addition information
	@Column(columnDefinition="double default 0")
	private double earth_moid;
	@Column(columnDefinition="double default 0")
	private double jupiter_moid;
	@Column(columnDefinition="double default 0")
	private double t_jup;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	//基本信息
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
	
	public int getClassification() {
		return classification;
	}
	public void setClassification(int classification) {
		this.classification = classification;
	}
	
	public long getSpk_id() {
		return spk_id;
	}
	public void setSpk_id(long spk_id) {
		this.spk_id = spk_id;
	}
	
	//轨道信息Orbital Elements
	//Element e
	public double getOe_e_v() {
		return oe_e_v;
	}
	public void setOe_e_v(double oe_e_v) {
		this.oe_e_v = oe_e_v;
	}
	
	public double getOe_e_unc() {
		return oe_e_unc;
	}
	public void setOe_e_unc(double oe_e_unc) {
		this.oe_e_unc = oe_e_unc;
	}

	//Element a
	public double getOe_a_v() {
		return oe_a_v;
	}
	public void setOe_a_v(double oe_a_v) {
		this.oe_a_v = oe_a_v;
	}
	
	public double getOe_a_unc() {
		return oe_a_unc;
	}
	public void setOe_a_unc(double oe_a_unc) {
		this.oe_a_unc = oe_a_unc;
	}

	//Element q
	public double getOe_q_v() {
		return oe_q_v;
	}
	public void setOe_q_v(double oe_q_v) {
		this.oe_q_v = oe_q_v;
	}
	
	public double getOe_q_unc() {
		return oe_q_unc;
	}
	public void setOe_q_unc(double oe_q_unc) {
		this.oe_q_unc = oe_q_unc;
	}

	//Element i
	public double getOe_i_v() {
		return oe_i_v;
	}
	public void setOe_i_v(double oe_i_v) {
		this.oe_i_v = oe_i_v;
	}
	
	public double getOe_i_unc() {
		return oe_i_unc;
	}
	public void setOe_i_unc(double oe_i_unc) {
		this.oe_i_unc = oe_i_unc;
	}

	//Element node
	public double getOe_node_v() {
		return oe_node_v;
	}
	public void setOe_node_v(double oe_node_v) {
		this.oe_node_v = oe_node_v;
	}
	
	public double getOe_node_unc() {
		return oe_node_unc;
	}
	public void setOe_node_unc(double oe_node_unc) {
		this.oe_node_unc = oe_node_unc;
	}

	//Element peri
	public double getOe_peri_v() {
		return oe_peri_v;
	}
	public void setOe_peri_v(double oe_peri_v) {
		this.oe_peri_v = oe_peri_v;
	}
	
	public double getOe_peri_unc() {
		return oe_peri_unc;
	}
	public void setOe_peri_unc(double oe_peri_unc) {
		this.oe_peri_unc = oe_peri_unc;
	}

	//Element mUpper
	public double getOe_mUpper_v() {
		return oe_mUpper_v;
	}
	public void setOe_mUpper_v(double oe_mUpper_v) {
		this.oe_mUpper_v = oe_mUpper_v;
	}
	
	public double getOe_mUpper_unc() {
		return oe_mUpper_unc;
	}
	public void setOe_mUpper_unc(double oe_mUpper_unc) {
		this.oe_mUpper_unc = oe_mUpper_unc;
	}

	//Element tp
	public double getOe_tp_v() {
		return oe_tp_v;
	}
	public void setOe_tp_v(double oe_tp_v) {
		this.oe_tp_v = oe_tp_v;
	}
	
	public double getOe_tp_unc() {
		return oe_tp_unc;
	}
	public void setOe_tp_unc(double oe_tp_unc) {
		this.oe_tp_unc = oe_tp_unc;
	}

	//Element periodByDay
	public double getOe_periodByDay_v() {
		return oe_periodByDay_v;
	}
	public void setOe_periodByDay_v(double oe_periodByDay_v) {
		this.oe_periodByDay_v = oe_periodByDay_v;
	}
	
	public double getOe_periodByDay_unc() {
		return oe_periodByDay_unc;
	}
	public void setOe_periodByDay_unc(double oe_periodByDay_unc) {
		this.oe_periodByDay_unc = oe_periodByDay_unc;
	}

	//Element periodByYr
	public double getOe_periodByYr_v() {
		return oe_periodByYr_v;
	}
	public void setOe_periodByYr_v(double oe_periodByYr_v) {
		this.oe_periodByYr_v = oe_periodByYr_v;
	}
		
	public double getOe_periodByYr_unc() {
		return oe_periodByYr_unc;
	}
	public void setOe_periodByYr_unc(double oe_periodByYr_unc) {
		this.oe_periodByYr_unc = oe_periodByYr_unc;
	}

	//Element n
	public double getOe_n_v() {
		return oe_n_v;
	}
	public void setOe_n_v(double oe_n_v) {
		this.oe_n_v = oe_n_v;
	}
		
	public double getOe_n_unc() {
		return oe_n_unc;
	}
	public void setOe_n_unc(double oe_n_unc) {
		this.oe_n_unc = oe_n_unc;
	}

	//Element qUpper
	public double getOe_qUpper_v() {
		return oe_qUpper_v;
	}
	public void setOe_qUpper_v(double oe_qUpper_v) {
		this.oe_qUpper_v = oe_qUpper_v;
	}
	
	public double getOe_qUpper_unc() {
		return oe_qUpper_unc;
	}
	public void setOe_qUpper_unc(double oe_qUpper_unc) {
		this.oe_qUpper_unc = oe_qUpper_unc;
	}

	//轨道参数Orbit Determination Parameters
	public Integer getTotal_obs_used() {
		return total_obs_used;
	}
	public void setTotal_obs_used(Integer total_obs_used) {
		this.total_obs_used = total_obs_used;
	}
	
	public Integer getDelay_obs_used() {
		return delay_obs_used;
	}
	public void setDelay_obs_used(Integer delay_obs_used) {
		this.delay_obs_used = delay_obs_used;
	}
	
	public Integer getDropper_obs_used() {
		return dropper_obs_used;
	}
	public void setDropper_obs_used(Integer dropper_obs_used) {
		this.dropper_obs_used = dropper_obs_used;
	}
	
	public Integer getData_arc_span() {
		return data_arc_span;
	}
	public void setData_arc_span(Integer data_arc_span) {
		this.data_arc_span = data_arc_span;
	}
	
	public Date getFirst_obs_used() {
		return first_obs_used;
	}
	public void setFirst_obs_used(Date first_obs_used) {
		this.first_obs_used = first_obs_used;
	}
	
	public Date getLast_obs_used() {
		return last_obs_used;
	}
	public void setLast_obs_used(Date last_obs_used) {
		this.last_obs_used = last_obs_used;
	}
	
	public String getPlanetary_ephem() {
		return planetary_ephem;
	}
	public void setPlanetary_ephem(String planetary_ephem) {
		this.planetary_ephem = planetary_ephem;
	}
	
	public String getSb_pert_ephem() {
		return sb_pert_ephem;
	}
	public void setSb_pert_ephem(String sb_pert_ephem) {
		this.sb_pert_ephem = sb_pert_ephem;
	}
	
	public Integer getCondition_code() {
		return condition_code;
	}
	public void setCondition_code(Integer condition_code) {
		this.condition_code = condition_code;
	}
	
	public Double getFit_RMS() {
		return fit_RMS;
	}
	public void setFit_RMS(Double fit_RMS) {
		this.fit_RMS = fit_RMS;
	}
	
	public String getData_source() {
		return data_source;
	}
	public void setData_source(String data_source) {
		this.data_source = data_source;
	}
	
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	public Date getSolution_date() {
		return solution_date;
	}
	public void setSolution_date(Date solution_date) {
		this.solution_date = solution_date;
	}
	
	//物理参数Physical Parameter
	//absolute magnitude
	public String getAm_symbol() {
		return am_symbol;
	}
	public void setAm_symbol(String am_symbol) {
		this.am_symbol = am_symbol;
	}
	
	public Double getAm_value() {
		return am_value;
	}
	public void setAm_value(Double am_value) {
		this.am_value = am_value;
	}

	public Double getAm_sigma() {
		return am_sigma;
	}
	public void setAm_sigma(Double am_sigma) {
		this.am_sigma = am_sigma;
	}
	
	public String getAm_reference() {
		return am_reference;
	}
	public void setAm_reference(String am_reference) {
		this.am_reference = am_reference;
	}
		
	public String getAm_note() {
		return am_note;
	}
	public void setAm_note(String am_note) {
		this.am_note = am_note;
	}
	
	//magnitude slope
	public String getMs_symbol() {
		return ms_symbol;
	}
	public void setMs_symbol(String ms_symbol) {
		this.ms_symbol = ms_symbol;
	}
	
	public Double getMs_value() {
		return ms_value;
	}
	public void setMs_value(Double ms_value) {
		this.ms_value = ms_value;
	}

	public Double getMs_sigma() {
		return ms_sigma;
	}
	public void setMs_sigma(Double ms_sigma) {
		this.ms_sigma = ms_sigma;
	}
		
	public String getMs_reference() {
		return ms_reference;
	}
	public void setMs_reference(String ms_reference) {
		this.ms_reference = ms_reference;
	}
			
	public String getMs_note() {
		return ms_note;
	}
	public void setMs_note(String ms_note) {
		this.ms_note = ms_note;
	}
	
	//diameter
	public String getDiameter_symbol() {
		return diameter_symbol;
	}
	public void setDiameter_symbol(String diameter_symbol) {
		this.diameter_symbol = diameter_symbol;
	}
	
	public Double getDiameter_value() {
		return diameter_value;
	}
	public void setDiameter_value(Double diameter_value) {
		this.diameter_value = diameter_value;
	}

	public Double getDiameter_sigma() {
		return diameter_sigma;
	}
	public void setDiameter_sigma(Double diameter_sigma) {
		this.diameter_sigma = diameter_sigma;
	}
			
	public String getDiameter_reference() {
		return diameter_reference;
	}
	public void setDiameter_reference(String diameter_reference) {
		this.diameter_reference = diameter_reference;
	}
				
	public String getDiameter_note() {
		return diameter_note;
	}
	public void setDiameter_note(String diameter_note) {
		this.diameter_note = diameter_note;
	}
	
	//extent
	public String getExtent_symbol() {
		return extent_symbol;
	}
	public void setExtent_symbol(String extent_symbol) {
		this.extent_symbol = extent_symbol;
	}
		
	public Double getExtent_value_l() {
		return extent_value_l;
	}
	public void setExtent_value_l(Double extent_value_l) {
		this.extent_value_l = extent_value_l;
	}
	public Double getExtent_value_w() {
		return extent_value_w;
	}
	public void setExtent_value_w(Double extent_value_w) {
		this.extent_value_w = extent_value_w;
	}
	public Double getExtent_value_h() {
		return extent_value_h;
	}
	public void setExtent_value_h(Double extent_value_h) {
		this.extent_value_h = extent_value_h;
	}

	public Double getExtent_sigma() {
		return extent_sigma;
	}
	public void setExtent_sigma(Double extent_sigma) {
		this.extent_sigma = extent_sigma;
	}
				
	public String getExtent_reference() {
		return extent_reference;
	}
	public void setExtent_reference(String extent_reference) {
		this.extent_reference = extent_reference;
	}
					
	public String getExtent_note() {
		return extent_note;
	}
	public void setExtent_note(String extent_note) {
		this.extent_note = extent_note;
	}
	
	//gm
	public String getGm_symbol() {
		return gm_symbol;
	}
	public void setGm_symbol(String gm_symbol) {
		this.gm_symbol = gm_symbol;
	}
	
	public Double getGm_value() {
		return gm_value;
	}
	public void setGm_value(Double gm_value) {
		this.gm_value = gm_value;
	}

	public Double getGm_sigma() {
		return gm_sigma;
	}
	public void setGm_sigma(Double gm_sigma) {
		this.gm_sigma = gm_sigma;
	}
			
	public String getGm_reference() {
		return gm_reference;
	}
	public void setGm_reference(String gm_reference) {
		this.gm_reference = gm_reference;
	}
				
	public String getGm_note() {
		return gm_note;
	}
	public void setGm_note(String gm_note) {
		this.gm_note = gm_note;
	}
	
	//bulk density
	public String getBd_symbol() {
		return bd_symbol;
	}
	public void setBd_symbol(String bd_symbol) {
		this.bd_symbol = bd_symbol;
	}
	public Double getBd_value() {
		return bd_value;
	}
	public void setBd_value(Double bd_value) {
		this.bd_value = bd_value;
	}

	public Double getBd_sigma() {
		return bd_sigma;
	}
	public void setBd_sigma(Double bd_sigma) {
		this.bd_sigma = bd_sigma;
	}
	public String getBd_reference() {
		return bd_reference;
	}
	public void setBd_reference(String bd_reference) {
		this.bd_reference = bd_reference;
	}
	public String getBd_note() {
		return bd_note;
	}
	public void setBd_note(String bd_note) {
		this.bd_note = bd_note;
	}
	
	//rotation period
	public String getRp_symbol() {
		return rp_symbol;
	}
	public void setRp_symbol(String rp_symbol) {
		this.rp_symbol = rp_symbol;
	}
	public Double getRp_value() {
		return rp_value;
	}
	public void setRp_value(Double rp_value) {
		this.rp_value = rp_value;
	}

	public Double getRp_sigma() {
		return rp_sigma;
	}
	public void setRp_sigma(Double rp_sigma) {
		this.rp_sigma = rp_sigma;
	}
	public String getRp_reference() {
		return rp_reference;
	}
	public void setRp_reference(String rp_reference) {
		this.rp_reference = rp_reference;
	}
	public String getRp_note() {
		return rp_note;
	}
	public void setRp_note(String rp_note) {
		this.rp_note = rp_note;
	}
	
	//geometric albedo
	public String getGa_symbol() {
		return ga_symbol;
	}
	public void setGa_symbol(String ga_symbol) {
		this.ga_symbol = ga_symbol;
	}
	public Double getGa_value() {
		return ga_value;
	}
	public void setGa_value(Double ga_value) {
		this.ga_value = ga_value;
	}

	public Double getGa_sigma() {
		return ga_sigma;
	}
	public void setGa_sigma(Double ga_sigma) {
		this.ga_sigma = ga_sigma;
	}
	public String getGa_reference() {
		return ga_reference;
	}
	public void setGa_reference(String ga_reference) {
		this.ga_reference = ga_reference;
	}
	public String getGa_note() {
		return ga_note;
	}
	public void setGa_note(String ga_note) {
		this.ga_note = ga_note;
	}
	
	//B-V
	public String getBv_symbol() {
		return bv_symbol;
	}
	public void setBv_symbol(String bv_symbol) {
		this.bv_symbol = bv_symbol;
	}
	public Double getBv_value() {
		return bv_value;
	}
	public void setBv_value(Double bv_value) {
		this.bv_value = bv_value;
	}

	public Double getBv_sigma() {
		return bv_sigma;
	}
	public void setBv_sigma(Double bv_sigma) {
		this.bv_sigma = bv_sigma;
	}
	public String getBv_reference() {
		return bv_reference;
	}
	public void setBv_reference(String bv_reference) {
		this.bv_reference = bv_reference;
	}
	public String getBv_note() {
		return bv_note;
	}
	public void setBv_note(String bv_note) {
		this.bv_note = bv_note;
	}
	
	//U-B
	public String getUb_symbol() {
		return ub_symbol;
	}
	public void setUb_symbol(String ub_symbol) {
		this.ub_symbol = ub_symbol;
	}
	public Double getUb_value() {
		return ub_value;
	}
	public void setUb_value(Double ub_value) {
		this.ub_value = ub_value;
	}

	public Double getUb_sigma() {
		return ub_sigma;
	}
	public void setUb_sigma(Double ub_sigma) {
		this.ub_sigma = ub_sigma;
	}
	public String getUb_reference() {
		return ub_reference;
	}
	public void setUb_reference(String ub_reference) {
		this.ub_reference = ub_reference;
	}
	public String getUb_note() {
		return ub_note;
	}
	public void setUb_note(String ub_note) {
		this.ub_note = ub_note;
	}
	
	//Tholen spectral type
	public String getTst_symbol() {
		return tst_symbol;
	}
	public void setTst_symbol(String tst_symbol) {
		this.tst_symbol = tst_symbol;
	}
	public String getTst_value() {
		return tst_value;
	}
	public void setTst_value(String tst_value) {
		this.tst_value = tst_value;
	}

	public Double getTst_sigma() {
		return tst_sigma;
	}
	public void setTst_sigma(Double tst_sigma) {
		this.tst_sigma = tst_sigma;
	}
	public String getTst_reference() {
		return tst_reference;
	}
	public void setTst_reference(String tst_reference) {
		this.tst_reference = tst_reference;
	}
	public String getTst_note() {
		return tst_note;
	}
	public void setTst_note(String tst_note) {
		this.tst_note = tst_note;
	}
	
	//SMASSII spectral type
	public String getSst_symbol() {
		return sst_symbol;
	}
	public void setSst_symbol(String sst_symbol) {
		this.sst_symbol = sst_symbol;
	}
	public String getSst_value() {
		return sst_value;
	}
	public void setSst_value(String sst_value) {
		this.sst_value = sst_value;
	}

	public Double getSst_sigma() {
		return sst_sigma;
	}
	public void setSst_sigma(Double sst_sigma) {
		this.sst_sigma = sst_sigma;
	}
	public String getSst_reference() {
		return sst_reference;
	}
	public void setSst_reference(String sst_reference) {
		this.sst_reference = sst_reference;
	}
	public String getSst_note() {
		return sst_note;
	}
	public void setSst_note(String sst_note) {
		this.sst_note = sst_note;
	}
	
	//additional information
	public double getEarth_moid() {
		return earth_moid;
	}
	public void setEarth_moid(double earth_moid) {
		this.earth_moid = earth_moid;
	}
	public double getJupiter_moid() {
		return jupiter_moid;
	}
	public void setJupiter_moid(double jupiter_moid) {
		this.jupiter_moid = jupiter_moid;
	}
	public double getT_jup() {
		return t_jup;
	}
	public void setT_jup(double t_jup) {
		this.t_jup = t_jup;
	}
	//get Basic
	public Basic getBasic() {
		Basic b = new Basic();
		b.setNum(num);
		b.setName(name);
		b.setClassification(classification);
		b.setClassName(Classification.CLASSNAME[classification]);
		b.setSerialNum(serialNum);
		b.setSpk_id(spk_id);
		return b;
	}
	
	//get Orbit Determination Parameter
	public OrbitDeterminationParameter getODP(int parameter) {
		OrbitDeterminationParameter odp = new OrbitDeterminationParameter();
		odp.setParameter(parameter);
		switch(parameter) {
		case OrbitParameter.OBS_U_TOTAL:
			odp.setName("# obs. used (total)");
			odp.setValue(total_obs_used.toString());
		break;
		case OrbitParameter.OBS_U_DELAY:
			odp.setName("# delay obs. used");
			odp.setValue(delay_obs_used.toString());
		break;
		case OrbitParameter.OBS_U_DROPPER:
			odp.setName("# Doppler obs. used");
			odp.setValue(dropper_obs_used.toString());
		break;
		case OrbitParameter.DATA_ARC_SPAN:
			odp.setName("data-arc span");
			odp.setValue(data_arc_span.toString()+" days");
		break;
		case OrbitParameter.FIRST_OBS_U:
			odp.setName("first obs. used");
			odp.setValue(first_obs_used.toString());
		break;
		case OrbitParameter.LAST_OBS_U:
			odp.setName("last obs. used");
			odp.setValue(last_obs_used.toString());
		break;
		case OrbitParameter.PLANETARY_E:
			odp.setName("planetary ephem.");
			odp.setValue(planetary_ephem);
		break;
		case OrbitParameter.SB_PERT_E:
			odp.setName("SB-pert. ephem.");
			odp.setValue(sb_pert_ephem);
		break;
		case OrbitParameter.CONDITION_CODE:
			odp.setName("condition code");
			odp.setValue(condition_code.toString());
		break;
		case OrbitParameter.FIT_RMS:
			odp.setName("fit RMS");
			odp.setValue(fit_RMS.toString());
		break;
		case OrbitParameter.DATA_SOURCE:
			odp.setName("data source");
			odp.setValue(data_source);
		break;
		case OrbitParameter.PRODUCER:
			odp.setName("producer");
			odp.setValue(producer);
		break;
		case OrbitParameter.SOLUTION_DATE:
			odp.setName("solution date");
			odp.setValue(solution_date.toString());
		break;
		default:
		}
		return odp;
	}
	
	//get Orbital Element
	public OrbitalElement getOE (int element) {
		OrbitalElement oe = new OrbitalElement();
		oe.setElement(element);
		switch(element) {
		case Element.E:
			oe.setElementName(ElementName.E);
			oe.setValue(this.oe_e_v);
			oe.setUncertainly(this.oe_e_unc);
			oe.setUnit(ElementUnit.E);
		break;
		case Element.A:
			oe.setElementName(ElementName.A);
			oe.setValue(this.oe_a_v);
			oe.setUncertainly(this.oe_a_unc);
			oe.setUnit(ElementUnit.A);
		break;
		case Element.Q:
			oe.setElementName(ElementName.Q);
			oe.setValue(this.oe_q_v);
			oe.setUncertainly(this.oe_q_unc);
			oe.setUnit(ElementUnit.Q);
		break;
		case Element.I:
			oe.setElementName(ElementName.I);
			oe.setValue(this.oe_i_v);
			oe.setUncertainly(this.oe_i_unc);
			oe.setUnit(ElementUnit.I);
		break;
		case Element.NODE:
			oe.setElementName(ElementName.NODE);
			oe.setValue(this.oe_node_v);
			oe.setUncertainly(this.oe_node_unc);
			oe.setUnit(ElementUnit.NODE);
		break;
		case Element.PERI:
			oe.setElementName(ElementName.PERI);
			oe.setValue(this.oe_peri_v);
			oe.setUncertainly(this.oe_peri_unc);
			oe.setUnit(ElementUnit.PERI);
		break;
		case Element.MUPPER:
			oe.setElementName(ElementName.MUPPER);
			oe.setValue(this.oe_mUpper_v);
			oe.setUncertainly(this.oe_mUpper_unc);
			oe.setUnit(ElementUnit.MUPPER);
		break;
		case Element.TP:
			oe.setElementName(ElementName.TP);
			oe.setValue(this.oe_tp_v);
			oe.setUncertainly(this.oe_tp_unc);
			oe.setUnit(ElementUnit.TP);
		break;
		case Element.PERIODBYDAY:
			oe.setElementName(ElementName.PERIODBYDAY);
			oe.setValue(this.oe_periodByDay_v);
			oe.setUncertainly(this.oe_periodByDay_unc);
			oe.setUnit(ElementUnit.PERIODBYDAY);
		break;
		case Element.PERIODBYYR:
			oe.setElementName(ElementName.PERIODBYYR);
			oe.setValue(this.oe_periodByYr_v);
			oe.setUncertainly(this.oe_periodByYr_unc);
			oe.setUnit(ElementUnit.PERIODBYYR);
		break;
		case Element.N:
			oe.setElementName(ElementName.N);
			oe.setValue(this.oe_n_v);
			oe.setUncertainly(this.oe_n_unc);
			oe.setUnit(ElementUnit.N);
		break;
		case Element.QUPPER:
			oe.setElementName(ElementName.QUPPER);
			oe.setValue(this.oe_qUpper_v);
			oe.setUncertainly(this.oe_qUpper_unc);
			oe.setUnit(ElementUnit.QUPPER);
		break;
		default:
		}
		return oe;
	}
	
	//get Physical Parameter
	public PhysicalParameter getPP (int parameter) {
		PhysicalParameter pp = new PhysicalParameter();
		pp.setParameter(parameter);
		switch(parameter) {
		case Parameter.AM:
			pp.setName(ParameterName.AM);
			pp.setSymbol(this.am_symbol);
			pp.setValue(this.am_value.toString());
			pp.setUnit(ParameterUnit.AM);
			pp.setSigma(this.am_sigma<0?"n/a":this.am_sigma.toString());
			pp.setReference(this.am_reference);
			pp.setNote(this.am_note);
		break;
		case Parameter.MS:
			pp.setName(ParameterName.MS);
			pp.setSymbol(this.ms_symbol);
			pp.setValue(this.ms_value.toString());
			pp.setUnit(ParameterUnit.MS);
			pp.setSigma(this.ms_sigma<0?"n/a":this.ms_sigma.toString());
			pp.setReference(this.ms_reference);
			pp.setNote(this.ms_note);
		break;
		case Parameter.DIAMETER:
			pp.setName(ParameterName.DIAMETER);
			pp.setSymbol(this.diameter_symbol);
			pp.setValue(this.diameter_value.toString());
			pp.setUnit(ParameterUnit.DIAMETER);
			pp.setSigma(this.diameter_sigma<0?"n/a":this.diameter_sigma.toString());
			pp.setReference(this.diameter_reference);
			pp.setNote(this.diameter_note);
		break;
		case Parameter.EXTENT:
			pp.setName(ParameterName.EXTENT);
			pp.setSymbol(this.extent_symbol);
			pp.setValue(this.extent_value_l.toString()+"*"+this.extent_value_w.toString()+"*"+this.extent_value_h.toString());
			pp.setUnit(ParameterUnit.EXTENT);
			pp.setSigma(this.extent_sigma<0?"n/a":this.extent_sigma.toString());
			pp.setReference(this.extent_reference);
			pp.setNote(this.extent_note);
		break;
		case Parameter.GM:
			pp.setName(ParameterName.GM);
			pp.setSymbol(this.gm_symbol);
			pp.setValue(this.gm_value.toString());
			pp.setUnit(ParameterUnit.GM);
			pp.setSigma(this.gm_sigma<0?"n/a":this.gm_sigma.toString());
			pp.setReference(this.gm_reference);
			pp.setNote(this.gm_note);
		break;
		case Parameter.B_DENSITY:
			pp.setName(ParameterName.B_DENSITY);
			pp.setSymbol(this.bd_symbol);
			pp.setValue(this.bd_value.toString());
			pp.setUnit(ParameterUnit.B_DENSITY);
			pp.setSigma(this.bd_sigma<0?"n/a":this.bd_sigma.toString());
			pp.setReference(this.bd_reference);
			pp.setNote(this.bd_note);
		break;
		case Parameter.R_PERIOD:
			pp.setName(ParameterName.R_PERIOD);
			pp.setSymbol(this.rp_symbol);
			pp.setValue(this.rp_value.toString());
			pp.setUnit(ParameterUnit.R_PERIOD);
			pp.setSigma(this.rp_sigma<0?"n/a":this.rp_sigma.toString());
			pp.setReference(this.rp_reference);
			pp.setNote(this.rp_note);
		break;
		case Parameter.GA:
			pp.setName(ParameterName.GA);
			pp.setSymbol(this.ga_symbol);
			pp.setValue(this.ga_value.toString());
			pp.setUnit(ParameterUnit.GA);
			pp.setSigma(this.ga_sigma<0?"n/a":this.ga_sigma.toString());
			pp.setReference(this.ga_reference);
			pp.setNote(this.ga_note);
		break;
		case Parameter.B_V:
			pp.setName(ParameterName.B_V);
			pp.setSymbol(this.bv_symbol);
			pp.setValue(this.bv_value.toString());
			pp.setUnit(ParameterUnit.B_V);
			pp.setSigma(this.bv_sigma<0?"n/a":this.bv_sigma.toString());
			pp.setReference(this.bv_reference);
			pp.setNote(this.bv_note);
		break;
		case Parameter.U_B:
			pp.setName(ParameterName.U_B);
			pp.setSymbol(this.ub_symbol);
			pp.setValue(this.ub_value.toString());
			pp.setUnit(ParameterUnit.U_B);
			pp.setSigma(this.ub_sigma<0?"n/a":this.ub_sigma.toString());
			pp.setReference(this.ub_reference);
			pp.setNote(this.ub_note);
		break;
		case Parameter.TST:
			pp.setName(ParameterName.TST);
			pp.setSymbol(this.tst_symbol);
			pp.setValue(this.tst_value.toString());
			pp.setUnit(ParameterUnit.TST);
			pp.setSigma(this.tst_sigma<0?"n/a":this.tst_sigma.toString());
			pp.setReference(this.tst_reference);
			pp.setNote(this.tst_note);
		break;
		case Parameter.SST:
			pp.setName(ParameterName.SST);
			pp.setSymbol(this.sst_symbol);
			pp.setValue(this.sst_value.toString());
			pp.setUnit(ParameterUnit.SST);
			pp.setSigma(this.sst_sigma<0?"n/a":this.sst_sigma.toString());
			pp.setReference(this.sst_reference);
			pp.setNote(this.sst_note);
		break;
		default:
		}
		return pp;
	}
	
}