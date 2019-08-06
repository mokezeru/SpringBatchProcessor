package com.charter.experian.tasks;

import com.charter.experian.model.Experian;
import org.springframework.batch.item.ItemProcessor;

public class ExperianProcessor implements ItemProcessor<Experian, Experian> {
    @Override
    public Experian process(final Experian item) throws Exception {
        String prodType = item.getProd_Typ();
        if (!prodType.isEmpty()) {
            prodType = prodType+" Moke";
            item.setProd_Typ(prodType);
            return item;
        }
        item.setProd_Typ("Moke");
        return item;
    }
}