package com.charter.experian.tasks;

import com.charter.experian.model.Experian;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;

@Configuration
public class Task1 {

    Resource resource = new FileSystemResource("C:/Charter/experian/SomeCSVData.csv");

    @Bean
    public FlatFileItemReader<Experian> fileReader() throws Exception {

        return new FlatFileItemReaderBuilder<Experian>()
                .name("file-reader")
                .resource(resource)
                .targetType(Experian.class)
                .linesToSkip(1)
                .delimited().delimiter(",").names(new String[]{ "rec_Hdr", "rec_Len", "subcd", "inq_Dte", "inq_Tme_CST", "prod_Typ", "err_Cd", "ID_Mtch_Cd", "class_Cd", "c_Rtrn_Cd", "d_Rtrn_Cd", "e_Rtrn_Cd", "risk_Scr", "scr_Typ", "scr_Eval", "scr_Factor_Cds", "inq_Cons_Nm", "inq_SSN", "inq_Str_Add", "inq_Add_City", "inq_Add_Ste", "inq_Add_Zip", "connect_Chk_Rtrnd_Cstm_Msg", "rtrnd_Phn", "experian_Rtrnd_SSN", "FACTA_Cd", "fraud_Shield_Cd", "file_One_PIN", "acc_Mtch_Cnt", "inq_Mtch_Cnt", "first_Mtch_Acc_Nbr", "first_Mtch_Acc_St", "first_Mtch_Acc_Bl", "first_Mtch_Acc_Sub", "second_Mtch_Acc_Nbr", "second_Mtch_Acc_St", "second_Mtch_Acc_Bl", "second_Mtch_Acc_Sub", "third_Mtch_Acc_Nbr", "third_Mtch_Acc_St", "third_Mtch_Acc_Bl", "third_Mtch_Acc_Sub", "fourth_Mtch_Acc_Nbr", "fourth_Mtch_Acc_St", "fourth_Mtch_Acc_Bl", "fourth_Mtch_Acc_Sub", "fifth_Mtch_Acc_Nbr", "fifth_Mtch_Acc_St", "fifth_Mtch_Acc_Bl", "fifth_Mtch_Acc_Sub", "inqRef_EchoBk", "IIScr", "IIScrTyp", "IIScrEval", "IIFactor", "encrPin", "recEnd", "oprInt", "fifthFSc", "first_Name_from_Inquiry", "middle_Name_from_Inquiry", "last_Name_from_Inquiry", "gen_Code_from_Inquiry", "OFAC_Msg_Code", "ID_scr", "PID_reason_Code"})
                .build();
    }

    @Bean
    public JdbcBatchItemWriter<Experian> jdbcWriter(DataSource ds) {
        return new JdbcBatchItemWriterBuilder<Experian>()
                .dataSource(ds)
                .sql("insert into EXPERIAN(REC_HDR, REC_LEN, SUBCD, INQ_DTE, INQ_TME_CST, PROD_TYP, ERR_CD, ID_MTCH_CD, CLASS_CD, C_RTRN_CD, D_RTRN_CD, E_RTRN_CD, RISK_SCR, SCR_TYP, SCR_EVAL, SCR_FACTOR_CDS, INQ_CONS_NM, INQ_SSN, INQ_STR_ADD, INQ_ADD_CITY, INQ_ADD_STE, INQ_ADD_ZIP, CONNECT_CHK_RTRND_CSTM_MSG, RTRND_PHN, EXPERIAN_RTRND_SSN, FACTA_CD, FRAUD_SHIELD_CD, FILE_ONE_PIN, ACC_MTCH_CNT, INQ_MTCH_CNT, FIRST_MTCH_ACC_NBR, FIRST_MTCH_ACC_ST, FIRST_MTCH_ACC_BL, FIRST_MTCH_ACC_SUB, SECOND_MTCH_ACC_NBR, SECOND_MTCH_ACC_ST, SECOND_MTCH_ACC_BL, SECOND_MTCH_ACC_SUB, THIRD_MTCH_ACC_NBR, THIRD_MTCH_ACC_ST, THIRD_MTCH_ACC_BL, THIRD_MTCH_ACC_SUB, FOURTH_MTCH_ACC_NBR, FOURTH_MTCH_ACC_ST, FOURTH_MTCH_ACC_BL, FOURTH_MTCH_ACC_SUB, FIFTH_MTCH_ACC_NBR, FIFTH_MTCH_ACC_ST, FIFTH_MTCH_ACC_BL, FIFTH_MTCH_ACC_SUB, INQ_REF_ECHO_BK, IISCR, IISCR_TYP, IISCR_EVAL, IIFACTOR, ENCR_PIN, REC_END, OPR_INT, FIFTHFSC, FIRST_NAME_FROM_INQUIRY, MIDDLE_NAME_FROM_INQUIRY, LAST_NAME_FROM_INQUIRY, GEN_CODE_FROM_INQUIRY, OFAC_MSG_CODE, PID_SCR, PID_REASON_CODE) values (:rec_Hdr, :rec_Len, :subcd, :inq_Dte, :inq_Tme_CST, :prod_Typ, :err_Cd, :ID_Mtch_Cd, :class_Cd, :c_Rtrn_Cd, :d_Rtrn_Cd, :e_Rtrn_Cd, :risk_Scr, :scr_Typ, :scr_Eval, :scr_Factor_Cds, :inq_Cons_Nm, :inq_SSN, :inq_Str_Add, :inq_Add_City, :inq_Add_Ste, :inq_Add_Zip, :connect_Chk_Rtrnd_Cstm_Msg, :rtrnd_Phn, :experian_Rtrnd_SSN, :FACTA_Cd, :fraud_Shield_Cd, :file_One_PIN, :acc_Mtch_Cnt, :inq_Mtch_Cnt, :first_Mtch_Acc_Nbr, :first_Mtch_Acc_St, :first_Mtch_Acc_Bl, :first_Mtch_Acc_Sub, :second_Mtch_Acc_Nbr, :second_Mtch_Acc_St, :second_Mtch_Acc_Bl, :second_Mtch_Acc_Sub, :third_Mtch_Acc_Nbr, :third_Mtch_Acc_St, :third_Mtch_Acc_Bl, :third_Mtch_Acc_Sub, :fourth_Mtch_Acc_Nbr, :fourth_Mtch_Acc_St, :fourth_Mtch_Acc_Bl, :fourth_Mtch_Acc_Sub, :fifth_Mtch_Acc_Nbr, :fifth_Mtch_Acc_St, :fifth_Mtch_Acc_Bl, :fifth_Mtch_Acc_Sub, :inqRef_EchoBk, :IIScr, :IIScrTyp, :IIScrEval, :IIFactor, :encrPin, :recEnd, :oprInt, :fifthFSc, :first_Name_from_Inquiry, :middle_Name_from_Inquiry, :last_Name_from_Inquiry, :gen_Code_from_Inquiry, :OFAC_Msg_Code, :PID_scr, :PID_reason_Code)")
                .beanMapped()
                .build();
    }
}
