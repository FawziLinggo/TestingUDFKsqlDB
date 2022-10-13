import io.confluent.ksql.function.udf.UdfParameter;

public class testing {
    public static void main(String[] args) {
         double woe_age = 53;
         double woe_debt_ratio = 1;
         double woe_monthly_income = 3000;
         double woe_30_59_days =1;
         double woe_60_89_days = 1;
         double woe_90_days = 1;
         double no_depedents = 3;

        if (woe_age < 51.5){
            woe_age=144;
        } else if ( woe_age > 51.5 && woe_age <= 59.6) {
            woe_age=103;
        } else if ( woe_age > 59.6 && woe_age <= 62.5) {
            woe_age=100;
        } else {
            woe_age=82;
        }

        if (woe_debt_ratio < 0.5){
            woe_debt_ratio=101;
        } else if (woe_debt_ratio > 0.5 && woe_debt_ratio <= 1.5) {
            woe_debt_ratio=116;
        }else if (woe_debt_ratio > 1.5 && woe_debt_ratio <= 2.5) {
            woe_debt_ratio=134;
        }else {
            woe_debt_ratio=80;
        }

        if (woe_monthly_income < 937){
            woe_monthly_income=95;
        } else if (woe_monthly_income > 937 && woe_monthly_income <= 5301.5) {
            woe_monthly_income=110;
        }else {
            woe_monthly_income=101;
        }

        if (woe_30_59_days < 0.5){
            woe_30_59_days=91;
        } else if ( woe_30_59_days > 0.5 && woe_30_59_days <= 0.9) {
            woe_30_59_days=131;
        } else if ( woe_30_59_days > 0.9 && woe_30_59_days <= 4) {
            woe_30_59_days=145;
        } else {
            woe_30_59_days=163;
        }

        if (woe_60_89_days <= 0.5){
            woe_60_89_days=100;
        } else if (woe_60_89_days > 0.5 && woe_60_89_days <= 1.5) {
            woe_60_89_days=142;
        }else {
            woe_60_89_days=167;
        }

        if (woe_90_days <= 0.5){
            woe_90_days=96;
        } else if (woe_90_days > 0.5 && woe_90_days <= 1.5) {
            woe_90_days=155;
        }else {
            woe_90_days=183;
        }

        if (no_depedents <= 2){
            no_depedents=105;
        }else {
            no_depedents=108;
        }

        double sum_woe = woe_age +
                woe_debt_ratio +
                woe_monthly_income +
                woe_30_59_days +
                woe_60_89_days +
                woe_90_days +
                no_depedents;

        System.out.println(sum_woe);
    }


}
