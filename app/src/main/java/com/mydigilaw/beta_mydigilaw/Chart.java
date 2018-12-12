package com.mydigilaw.beta_mydigilaw;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class Chart extends AppCompatActivity {

    private PieChart pieChart,piechart2;
    private SeekBar seekBarX, seekBarY;
    private TextView tvX, tvY;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);


        pieChart = (PieChart)findViewById(R.id.chart1);
        piechart2 = (PieChart)findViewById(R.id.chart2);

        //pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5, 10, 5, 5);


        pieChart.setDragDecelerationEnabled(true);
        pieChart.setHoleColor(Color.WHITE);
        pieChart.setHoleRadius(30f);
        pieChart.setTransparentCircleRadius(31f);
        pieChart.setCenterText("Assigned Enquiry");

        pieChart.setDragDecelerationFrictionCoef(0.95f);
        //pieChart.setCenterTextTypeface(Bo);
        // pieChart.setCenterText(generateCenterSpannableText());

        ArrayList<PieEntry> yValues = new ArrayList<>();
        /*      yValues.add(new PieEntry(10, "New Lead"));*/
        yValues.add(new PieEntry(6, "Joseph"));
        yValues.add(new PieEntry(6, "Sakthi"));
        yValues.add(new PieEntry(9, "Sredevi"));
        yValues.add(new PieEntry(4, "Subashini"));



        PieDataSet dataSet = new PieDataSet(yValues, "");
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(5f);

        //Legend legend = pieChart.getLegend();
        Legend l = pieChart.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.VERTICAL);
        l.setDrawInside(false);
        l.setXEntrySpace(7f);
        l.setYEntrySpace(0f);
        l.setYOffset(0f);

        pieChart.setEntryLabelColor(Color.WHITE);
        // chart.setEntryLabelTypeface(tfRegular);
        pieChart.setEntryLabelTextSize(14f);

        dataSet.setColors(ColorTemplate.PASTEL_COLORS);
        PieData data = new PieData((dataSet));
        data.setValueTextSize(10f);
        data.setValueTextColor(Color.YELLOW);
        pieChart.setData(data);


        //


        //piechart2.setUsePercentValues(true);
        piechart2.getDescription().setEnabled(false);
        piechart2.setExtraOffsets(5, 10, 5, 5);


        piechart2.setDragDecelerationEnabled(true);
        piechart2.setHoleColor(Color.WHITE);
        piechart2.setHoleRadius(30f);
        piechart2.setTransparentCircleRadius(31f);
        piechart2.setCenterText("Enquiry Staistics");

        piechart2.setDragDecelerationFrictionCoef(0.95f);
        //piechart2.setCenterTextTypeface(Bo);
        // piechart2.setCenterText(generateCenterSpannableText());

        ArrayList<PieEntry> yValues2 = new ArrayList<>();

        yValues2.add(new PieEntry(6, "New"));
        yValues2.add(new PieEntry(6, "Completed"));
        yValues2.add(new PieEntry(9, "in Progress"));




        PieDataSet dataSet2 = new PieDataSet(yValues, "");
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(5f);

        //Legend legend = piechart2.getLegend();
        Legend l1 = piechart2.getLegend();
        l1.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l1.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l1.setOrientation(Legend.LegendOrientation.VERTICAL);
        l1.setDrawInside(false);
        l1.setXEntrySpace(7f);
        l1.setYEntrySpace(0f);
        l1.setYOffset(0f);

        piechart2.setEntryLabelColor(Color.WHITE);
        // chart.setEntryLabelTypeface(tfRegular);
        piechart2.setEntryLabelTextSize(14f);

        dataSet.setColors(ColorTemplate.PASTEL_COLORS);
        PieData data2 = new PieData((dataSet));
        data.setValueTextSize(10f);
        data.setValueTextColor(Color.YELLOW);
        piechart2.setData(data2);
    }
}
