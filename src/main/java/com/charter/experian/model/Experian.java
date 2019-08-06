package com.charter.experian.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Experian implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Rec_Hdr;
    private int Rec_Len;
    private int Subcd;
    private String Inq_Dte;
    private String Inq_Tme_CST;
    private String Prod_Typ;
    private String Err_Cd;
    private String ID_Mtch_Cd;
    private String Class_Cd;
    private String C_Rtrn_Cd;
    private String D_Rtrn_Cd;
    private String E_Rtrn_Cd;
    private String Risk_Scr;
    private String Scr_Typ;
    private String Scr_Eval;
    private String Scr_Factor_Cds;
    private String Inq_Cons_Nm;
    private String Inq_SSN;
    private String Inq_Str_Add;
    private String Inq_Add_City;
    private String Inq_Add_Ste;
    private String Inq_Add_Zip;
    private String Connect_Chk_Rtrnd_Cstm_Msg;
    private String Rtrnd_Phn;
    private String Experian_Rtrnd_SSN;
    private String FACTA_Cd;
    private String Fraud_Shield_Cd;
    private String File_One_PIN;
    private String Acc_Mtch_Cnt;
    private String Inq_Mtch_Cnt;
    //@Column(name="1st_Mtch_Acc_Nbr")
    private String First_Mtch_Acc_Nbr;
    //@Column(name="1st_Mtch_Acc_St")
    private String First_Mtch_Acc_St;
    //@Column(name="1st_Mtch_Acc_Bl")
    private String First_Mtch_Acc_Bl;
    //@Column(name="1st_Mtch_Acc_Sub")
    private String First_Mtch_Acc_Sub;
    private String Second_Mtch_Acc_Nbr;
    private String Second_Mtch_Acc_St;
    private String Second_Mtch_Acc_Bl;
    private String Second_Mtch_Acc_Sub;
    private String Third_Mtch_Acc_Nbr;
    private String Third_Mtch_Acc_St;
    private String Third_Mtch_Acc_Bl;
    private String Third_Mtch_Acc_Sub;
    private String Fourth_Mtch_Acc_Nbr;
    private String Fourth_Mtch_Acc_St;
    private String Fourth_Mtch_Acc_Bl;
    private String Fourth_Mtch_Acc_Sub;
    private String Fifth_Mtch_Acc_Nbr;
    private String Fifth_Mtch_Acc_St;
    private String Fifth_Mtch_Acc_Bl;
    private String Fifth_Mtch_Acc_Sub;
    private String InqRef_EchoBk;
    private String IIScr;
    private String IIScrTyp;
    private String IIScrEval;
    private String IIFactor;
    private String EncrPin;
    private String RecEnd;
    private String OprInt;
    private String FifthFSc;
    private String First_Name_from_Inquiry;
    private String Middle_Name_from_Inquiry;
    private String Last_Name_from_Inquiry;
    private String Gen_Code_from_Inquiry;
    private String OFAC_Msg_Code;
    private String PID_scr;
    private String PID_reason_Code;

    public Experian() {
    }

    public Experian(Integer id, String rec_Hdr, int rec_Len, int subcd, String inq_Dte, String inq_Tme_CST, String prod_Typ, String err_Cd, String ID_Mtch_Cd, String class_Cd, String c_Rtrn_Cd, String d_Rtrn_Cd, String e_Rtrn_Cd, String risk_Scr, String scr_Typ, String scr_Eval, String scr_Factor_Cds, String inq_Cons_Nm, String inq_SSN, String inq_Str_Add, String inq_Add_City, String inq_Add_Ste, String inq_Add_Zip, String connect_Chk_Rtrnd_Cstm_Msg, String rtrnd_Phn, String experian_Rtrnd_SSN, String FACTA_Cd, String fraud_Shield_Cd, String file_One_PIN, String acc_Mtch_Cnt, String inq_Mtch_Cnt, String first_Mtch_Acc_Nbr, String first_Mtch_Acc_St, String first_Mtch_Acc_Bl, String first_Mtch_Acc_Sub, String second_Mtch_Acc_Nbr, String second_Mtch_Acc_St, String second_Mtch_Acc_Bl, String second_Mtch_Acc_Sub, String third_Mtch_Acc_Nbr, String third_Mtch_Acc_St, String third_Mtch_Acc_Bl, String third_Mtch_Acc_Sub, String fourth_Mtch_Acc_Nbr, String fourth_Mtch_Acc_St, String fourth_Mtch_Acc_Bl, String fourth_Mtch_Acc_Sub, String fifth_Mtch_Acc_Nbr, String fifth_Mtch_Acc_St, String fifth_Mtch_Acc_Bl, String fifth_Mtch_Acc_Sub, String inqRef_EchoBk, String IIScr, String IIScrTyp, String IIScrEval, String IIFactor, String encrPin, String recEnd, String oprInt, String fifthFSc, String first_Name_from_Inquiry, String middle_Name_from_Inquiry, String last_Name_from_Inquiry, String gen_Code_from_Inquiry, String OFAC_Msg_Code, String PID_scr, String PID_reason_Code) {
        this.id = id;
        Rec_Hdr = rec_Hdr;
        Rec_Len = rec_Len;
        Subcd = subcd;
        Inq_Dte = inq_Dte;
        Inq_Tme_CST = inq_Tme_CST;
        Prod_Typ = prod_Typ;
        Err_Cd = err_Cd;
        this.ID_Mtch_Cd = ID_Mtch_Cd;
        Class_Cd = class_Cd;
        C_Rtrn_Cd = c_Rtrn_Cd;
        D_Rtrn_Cd = d_Rtrn_Cd;
        E_Rtrn_Cd = e_Rtrn_Cd;
        Risk_Scr = risk_Scr;
        Scr_Typ = scr_Typ;
        Scr_Eval = scr_Eval;
        Scr_Factor_Cds = scr_Factor_Cds;
        Inq_Cons_Nm = inq_Cons_Nm;
        Inq_SSN = inq_SSN;
        Inq_Str_Add = inq_Str_Add;
        Inq_Add_City = inq_Add_City;
        Inq_Add_Ste = inq_Add_Ste;
        Inq_Add_Zip = inq_Add_Zip;
        Connect_Chk_Rtrnd_Cstm_Msg = connect_Chk_Rtrnd_Cstm_Msg;
        Rtrnd_Phn = rtrnd_Phn;
        Experian_Rtrnd_SSN = experian_Rtrnd_SSN;
        this.FACTA_Cd = FACTA_Cd;
        Fraud_Shield_Cd = fraud_Shield_Cd;
        File_One_PIN = file_One_PIN;
        Acc_Mtch_Cnt = acc_Mtch_Cnt;
        Inq_Mtch_Cnt = inq_Mtch_Cnt;
        First_Mtch_Acc_Nbr = first_Mtch_Acc_Nbr;
        First_Mtch_Acc_St = first_Mtch_Acc_St;
        First_Mtch_Acc_Bl = first_Mtch_Acc_Bl;
        First_Mtch_Acc_Sub = first_Mtch_Acc_Sub;
        Second_Mtch_Acc_Nbr = second_Mtch_Acc_Nbr;
        Second_Mtch_Acc_St = second_Mtch_Acc_St;
        Second_Mtch_Acc_Bl = second_Mtch_Acc_Bl;
        Second_Mtch_Acc_Sub = second_Mtch_Acc_Sub;
        Third_Mtch_Acc_Nbr = third_Mtch_Acc_Nbr;
        Third_Mtch_Acc_St = third_Mtch_Acc_St;
        Third_Mtch_Acc_Bl = third_Mtch_Acc_Bl;
        Third_Mtch_Acc_Sub = third_Mtch_Acc_Sub;
        Fourth_Mtch_Acc_Nbr = fourth_Mtch_Acc_Nbr;
        Fourth_Mtch_Acc_St = fourth_Mtch_Acc_St;
        Fourth_Mtch_Acc_Bl = fourth_Mtch_Acc_Bl;
        Fourth_Mtch_Acc_Sub = fourth_Mtch_Acc_Sub;
        Fifth_Mtch_Acc_Nbr = fifth_Mtch_Acc_Nbr;
        Fifth_Mtch_Acc_St = fifth_Mtch_Acc_St;
        Fifth_Mtch_Acc_Bl = fifth_Mtch_Acc_Bl;
        Fifth_Mtch_Acc_Sub = fifth_Mtch_Acc_Sub;
        InqRef_EchoBk = inqRef_EchoBk;
        this.IIScr = IIScr;
        this.IIScrTyp = IIScrTyp;
        this.IIScrEval = IIScrEval;
        this.IIFactor = IIFactor;
        EncrPin = encrPin;
        RecEnd = recEnd;
        OprInt = oprInt;
        FifthFSc = fifthFSc;
        First_Name_from_Inquiry = first_Name_from_Inquiry;
        Middle_Name_from_Inquiry = middle_Name_from_Inquiry;
        Last_Name_from_Inquiry = last_Name_from_Inquiry;
        Gen_Code_from_Inquiry = gen_Code_from_Inquiry;
        this.OFAC_Msg_Code = OFAC_Msg_Code;
        this.PID_scr = PID_scr;
        this.PID_reason_Code = PID_reason_Code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRec_Hdr() {
        return Rec_Hdr;
    }

    public void setRec_Hdr(String rec_Hdr) {
        Rec_Hdr = rec_Hdr;
    }

    public int getRec_Len() {
        return Rec_Len;
    }

    public void setRec_Len(int rec_Len) {
        Rec_Len = rec_Len;
    }

    public int getSubcd() {
        return Subcd;
    }

    public void setSubcd(int subcd) {
        Subcd = subcd;
    }

    public String getInq_Dte() {
        return Inq_Dte;
    }

    public void setInq_Dte(String inq_Dte) {
        Inq_Dte = inq_Dte;
    }

    public String getInq_Tme_CST() {
        return Inq_Tme_CST;
    }

    public void setInq_Tme_CST(String inq_Tme_CST) {
        Inq_Tme_CST = inq_Tme_CST;
    }

    public String getProd_Typ() {
        return Prod_Typ;
    }

    public void setProd_Typ(String prod_Typ) {
        Prod_Typ = prod_Typ;
    }

    public String getErr_Cd() {
        return Err_Cd;
    }

    public void setErr_Cd(String err_Cd) {
        Err_Cd = err_Cd;
    }

    public String getID_Mtch_Cd() {
        return ID_Mtch_Cd;
    }

    public void setID_Mtch_Cd(String ID_Mtch_Cd) {
        this.ID_Mtch_Cd = ID_Mtch_Cd;
    }

    public String getClass_Cd() {
        return Class_Cd;
    }

    public void setClass_Cd(String class_Cd) {
        Class_Cd = class_Cd;
    }

    public String getC_Rtrn_Cd() {
        return C_Rtrn_Cd;
    }

    public void setC_Rtrn_Cd(String c_Rtrn_Cd) {
        C_Rtrn_Cd = c_Rtrn_Cd;
    }

    public String getD_Rtrn_Cd() {
        return D_Rtrn_Cd;
    }

    public void setD_Rtrn_Cd(String d_Rtrn_Cd) {
        D_Rtrn_Cd = d_Rtrn_Cd;
    }

    public String getE_Rtrn_Cd() {
        return E_Rtrn_Cd;
    }

    public void setE_Rtrn_Cd(String e_Rtrn_Cd) {
        E_Rtrn_Cd = e_Rtrn_Cd;
    }

    public String getRisk_Scr() {
        return Risk_Scr;
    }

    public void setRisk_Scr(String risk_Scr) {
        Risk_Scr = risk_Scr;
    }

    public String getScr_Typ() {
        return Scr_Typ;
    }

    public void setScr_Typ(String scr_Typ) {
        Scr_Typ = scr_Typ;
    }

    public String getScr_Eval() {
        return Scr_Eval;
    }

    public void setScr_Eval(String scr_Eval) {
        Scr_Eval = scr_Eval;
    }

    public String getScr_Factor_Cds() {
        return Scr_Factor_Cds;
    }

    public void setScr_Factor_Cds(String scr_Factor_Cds) {
        Scr_Factor_Cds = scr_Factor_Cds;
    }

    public String getInq_Cons_Nm() {
        return Inq_Cons_Nm;
    }

    public void setInq_Cons_Nm(String inq_Cons_Nm) {
        Inq_Cons_Nm = inq_Cons_Nm;
    }

    public String getInq_SSN() {
        return Inq_SSN;
    }

    public void setInq_SSN(String inq_SSN) {
        Inq_SSN = inq_SSN;
    }

    public String getInq_Str_Add() {
        return Inq_Str_Add;
    }

    public void setInq_Str_Add(String inq_Str_Add) {
        Inq_Str_Add = inq_Str_Add;
    }

    public String getInq_Add_City() {
        return Inq_Add_City;
    }

    public void setInq_Add_City(String inq_Add_City) {
        Inq_Add_City = inq_Add_City;
    }

    public String getInq_Add_Ste() {
        return Inq_Add_Ste;
    }

    public void setInq_Add_Ste(String inq_Add_Ste) {
        Inq_Add_Ste = inq_Add_Ste;
    }

    public String getInq_Add_Zip() {
        return Inq_Add_Zip;
    }

    public void setInq_Add_Zip(String inq_Add_Zip) {
        Inq_Add_Zip = inq_Add_Zip;
    }

    public String getConnect_Chk_Rtrnd_Cstm_Msg() {
        return Connect_Chk_Rtrnd_Cstm_Msg;
    }

    public void setConnect_Chk_Rtrnd_Cstm_Msg(String connect_Chk_Rtrnd_Cstm_Msg) {
        Connect_Chk_Rtrnd_Cstm_Msg = connect_Chk_Rtrnd_Cstm_Msg;
    }

    public String getRtrnd_Phn() {
        return Rtrnd_Phn;
    }

    public void setRtrnd_Phn(String rtrnd_Phn) {
        Rtrnd_Phn = rtrnd_Phn;
    }

    public String getExperian_Rtrnd_SSN() {
        return Experian_Rtrnd_SSN;
    }

    public void setExperian_Rtrnd_SSN(String experian_Rtrnd_SSN) {
        Experian_Rtrnd_SSN = experian_Rtrnd_SSN;
    }

    public String getFACTA_Cd() {
        return FACTA_Cd;
    }

    public void setFACTA_Cd(String FACTA_Cd) {
        this.FACTA_Cd = FACTA_Cd;
    }

    public String getFraud_Shield_Cd() {
        return Fraud_Shield_Cd;
    }

    public void setFraud_Shield_Cd(String fraud_Shield_Cd) {
        Fraud_Shield_Cd = fraud_Shield_Cd;
    }

    public String getFile_One_PIN() {
        return File_One_PIN;
    }

    public void setFile_One_PIN(String file_One_PIN) {
        File_One_PIN = file_One_PIN;
    }

    public String getAcc_Mtch_Cnt() {
        return Acc_Mtch_Cnt;
    }

    public void setAcc_Mtch_Cnt(String acc_Mtch_Cnt) {
        Acc_Mtch_Cnt = acc_Mtch_Cnt;
    }

    public String getInq_Mtch_Cnt() {
        return Inq_Mtch_Cnt;
    }

    public void setInq_Mtch_Cnt(String inq_Mtch_Cnt) {
        Inq_Mtch_Cnt = inq_Mtch_Cnt;
    }

    public String getFirst_Mtch_Acc_Nbr() {
        return First_Mtch_Acc_Nbr;
    }

    public void setFirst_Mtch_Acc_Nbr(String first_Mtch_Acc_Nbr) {
        First_Mtch_Acc_Nbr = first_Mtch_Acc_Nbr;
    }

    public String getFirst_Mtch_Acc_St() {
        return First_Mtch_Acc_St;
    }

    public void setFirst_Mtch_Acc_St(String first_Mtch_Acc_St) {
        First_Mtch_Acc_St = first_Mtch_Acc_St;
    }

    public String getFirst_Mtch_Acc_Bl() {
        return First_Mtch_Acc_Bl;
    }

    public void setFirst_Mtch_Acc_Bl(String first_Mtch_Acc_Bl) {
        First_Mtch_Acc_Bl = first_Mtch_Acc_Bl;
    }

    public String getFirst_Mtch_Acc_Sub() {
        return First_Mtch_Acc_Sub;
    }

    public void setFirst_Mtch_Acc_Sub(String first_Mtch_Acc_Sub) {
        First_Mtch_Acc_Sub = first_Mtch_Acc_Sub;
    }

    public String getSecond_Mtch_Acc_Nbr() {
        return Second_Mtch_Acc_Nbr;
    }

    public void setSecond_Mtch_Acc_Nbr(String second_Mtch_Acc_Nbr) {
        Second_Mtch_Acc_Nbr = second_Mtch_Acc_Nbr;
    }

    public String getSecond_Mtch_Acc_St() {
        return Second_Mtch_Acc_St;
    }

    public void setSecond_Mtch_Acc_St(String second_Mtch_Acc_St) {
        Second_Mtch_Acc_St = second_Mtch_Acc_St;
    }

    public String getSecond_Mtch_Acc_Bl() {
        return Second_Mtch_Acc_Bl;
    }

    public void setSecond_Mtch_Acc_Bl(String second_Mtch_Acc_Bl) {
        Second_Mtch_Acc_Bl = second_Mtch_Acc_Bl;
    }

    public String getSecond_Mtch_Acc_Sub() {
        return Second_Mtch_Acc_Sub;
    }

    public void setSecond_Mtch_Acc_Sub(String second_Mtch_Acc_Sub) {
        Second_Mtch_Acc_Sub = second_Mtch_Acc_Sub;
    }

    public String getThird_Mtch_Acc_Nbr() {
        return Third_Mtch_Acc_Nbr;
    }

    public void setThird_Mtch_Acc_Nbr(String third_Mtch_Acc_Nbr) {
        Third_Mtch_Acc_Nbr = third_Mtch_Acc_Nbr;
    }

    public String getThird_Mtch_Acc_St() {
        return Third_Mtch_Acc_St;
    }

    public void setThird_Mtch_Acc_St(String third_Mtch_Acc_St) {
        Third_Mtch_Acc_St = third_Mtch_Acc_St;
    }

    public String getThird_Mtch_Acc_Bl() {
        return Third_Mtch_Acc_Bl;
    }

    public void setThird_Mtch_Acc_Bl(String third_Mtch_Acc_Bl) {
        Third_Mtch_Acc_Bl = third_Mtch_Acc_Bl;
    }

    public String getThird_Mtch_Acc_Sub() {
        return Third_Mtch_Acc_Sub;
    }

    public void setThird_Mtch_Acc_Sub(String third_Mtch_Acc_Sub) {
        Third_Mtch_Acc_Sub = third_Mtch_Acc_Sub;
    }

    public String getFourth_Mtch_Acc_Nbr() {
        return Fourth_Mtch_Acc_Nbr;
    }

    public void setFourth_Mtch_Acc_Nbr(String fourth_Mtch_Acc_Nbr) {
        Fourth_Mtch_Acc_Nbr = fourth_Mtch_Acc_Nbr;
    }

    public String getFourth_Mtch_Acc_St() {
        return Fourth_Mtch_Acc_St;
    }

    public void setFourth_Mtch_Acc_St(String fourth_Mtch_Acc_St) {
        Fourth_Mtch_Acc_St = fourth_Mtch_Acc_St;
    }

    public String getFourth_Mtch_Acc_Bl() {
        return Fourth_Mtch_Acc_Bl;
    }

    public void setFourth_Mtch_Acc_Bl(String fourth_Mtch_Acc_Bl) {
        Fourth_Mtch_Acc_Bl = fourth_Mtch_Acc_Bl;
    }

    public String getFourth_Mtch_Acc_Sub() {
        return Fourth_Mtch_Acc_Sub;
    }

    public void setFourth_Mtch_Acc_Sub(String fourth_Mtch_Acc_Sub) {
        Fourth_Mtch_Acc_Sub = fourth_Mtch_Acc_Sub;
    }

    public String getFifth_Mtch_Acc_Nbr() {
        return Fifth_Mtch_Acc_Nbr;
    }

    public void setFifth_Mtch_Acc_Nbr(String fifth_Mtch_Acc_Nbr) {
        Fifth_Mtch_Acc_Nbr = fifth_Mtch_Acc_Nbr;
    }

    public String getFifth_Mtch_Acc_St() {
        return Fifth_Mtch_Acc_St;
    }

    public void setFifth_Mtch_Acc_St(String fifth_Mtch_Acc_St) {
        Fifth_Mtch_Acc_St = fifth_Mtch_Acc_St;
    }

    public String getFifth_Mtch_Acc_Bl() {
        return Fifth_Mtch_Acc_Bl;
    }

    public void setFifth_Mtch_Acc_Bl(String fifth_Mtch_Acc_Bl) {
        Fifth_Mtch_Acc_Bl = fifth_Mtch_Acc_Bl;
    }

    public String getFifth_Mtch_Acc_Sub() {
        return Fifth_Mtch_Acc_Sub;
    }

    public void setFifth_Mtch_Acc_Sub(String fifth_Mtch_Acc_Sub) {
        Fifth_Mtch_Acc_Sub = fifth_Mtch_Acc_Sub;
    }

    public String getInqRef_EchoBk() {
        return InqRef_EchoBk;
    }

    public void setInqRef_EchoBk(String inqRef_EchoBk) {
        InqRef_EchoBk = inqRef_EchoBk;
    }

    public String getIIScr() {
        return IIScr;
    }

    public void setIIScr(String IIScr) {
        this.IIScr = IIScr;
    }

    public String getIIScrTyp() {
        return IIScrTyp;
    }

    public void setIIScrTyp(String IIScrTyp) {
        this.IIScrTyp = IIScrTyp;
    }

    public String getIIScrEval() {
        return IIScrEval;
    }

    public void setIIScrEval(String IIScrEval) {
        this.IIScrEval = IIScrEval;
    }

    public String getIIFactor() {
        return IIFactor;
    }

    public void setIIFactor(String IIFactor) {
        this.IIFactor = IIFactor;
    }

    public String getEncrPin() {
        return EncrPin;
    }

    public void setEncrPin(String encrPin) {
        EncrPin = encrPin;
    }

    public String getRecEnd() {
        return RecEnd;
    }

    public void setRecEnd(String recEnd) {
        RecEnd = recEnd;
    }

    public String getOprInt() {
        return OprInt;
    }

    public void setOprInt(String oprInt) {
        OprInt = oprInt;
    }

    public String getFifthFSc() {
        return FifthFSc;
    }

    public void setFifthFSc(String fifthFSc) {
        FifthFSc = fifthFSc;
    }

    public String getFirst_Name_from_Inquiry() {
        return First_Name_from_Inquiry;
    }

    public void setFirst_Name_from_Inquiry(String first_Name_from_Inquiry) {
        First_Name_from_Inquiry = first_Name_from_Inquiry;
    }

    public String getMiddle_Name_from_Inquiry() {
        return Middle_Name_from_Inquiry;
    }

    public void setMiddle_Name_from_Inquiry(String middle_Name_from_Inquiry) {
        Middle_Name_from_Inquiry = middle_Name_from_Inquiry;
    }

    public String getLast_Name_from_Inquiry() {
        return Last_Name_from_Inquiry;
    }

    public void setLast_Name_from_Inquiry(String last_Name_from_Inquiry) {
        Last_Name_from_Inquiry = last_Name_from_Inquiry;
    }

    public String getGen_Code_from_Inquiry() {
        return Gen_Code_from_Inquiry;
    }

    public void setGen_Code_from_Inquiry(String gen_Code_from_Inquiry) {
        Gen_Code_from_Inquiry = gen_Code_from_Inquiry;
    }

    public String getOFAC_Msg_Code() {
        return OFAC_Msg_Code;
    }

    public void setOFAC_Msg_Code(String OFAC_Msg_Code) {
        this.OFAC_Msg_Code = OFAC_Msg_Code;
    }

    public String getPID_scr() {
        return PID_scr;
    }

    public void setPID_scr(String PID_scr) {
        this.PID_scr = PID_scr;
    }

    public String getPID_reason_Code() {
        return PID_reason_Code;
    }

    public void setPID_reason_Code(String PID_reason_Code) {
        this.PID_reason_Code = PID_reason_Code;
    }
}