package ttu.mis.lab211014_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private ArrayList<CompoundButton> selected = new ArrayList();
    private TextView mTxtHobby;
    private CheckBox chk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 從介面佈局檔取得介面元件
       /* mChkBoxMusic = findViewById(R.id.chkBoxMusic);
        mChkBoxSing = findViewById(R.id.chkBoxSing);
        mChkBoxDance = findViewById(R.id.chkBoxDance);
        mChkBoxTravel = findViewById(R.id.chkBoxTravel);
        mChkBoxReading = findViewById(R.id.chkBoxReading);
        mChkBoxWriting = findViewById(R.id.chkBoxWriting);
        mChkBoxClimbing = findViewById(R.id.chkBoxClimbing);
        mChkBoxSwim = findViewById(R.id.chkBoxSwim);
        mChkBoxExercise = findViewById(R.id.chkBoxExercise);
        mChkBoxFitness = findViewById(R.id.chkBoxFitness);
        mChkBoxPhoto = findViewById(R.id.chkBoxPhoto);
        mChkBoxFood = findViewById(R.id.chkBoxFood);
        mChkBoxPainting = findViewById(R.id.chkBoxPainting);*/
        mTxtHobby = findViewById(R.id.txtHobby);
        int[] id = {R.id.chkBoxMusic,R.id.chkBoxSing,R.id.chkBoxDance,R.id.chkBoxTravel
        ,R.id.chkBoxReading,R.id.chkBoxWriting,R.id.chkBoxClimbing,R.id.chkBoxSwim
        ,R.id.chkBoxExercise,R.id.chkBoxFitness,R.id.chkBoxPhoto,R.id.chkBoxFood
        ,R.id.chkBoxPainting};
        for (int i:id){
            chk = (CheckBox) findViewById(i);
            chk.setOnCheckedChangeListener(this);
                    }
            }


  /*@Override
    public void onClick(View view) {
      String s = getString(R.string.your_hobby);

    }
        // 逐一檢查所有的CheckBox元件，記下使用者勾選的項目
        /*if (mChkBoxMusic.isChecked())
            s += mChkBoxMusic.getText().toString() + ", ";

        if (mChkBoxSing.isChecked())
            s += mChkBoxSing.getText().toString() + ", ";

        if (mChkBoxDance.isChecked())
            s += mChkBoxDance.getText().toString() + ", ";

        if (mChkBoxTravel.isChecked())
            s += mChkBoxTravel.getText().toString() + ", ";

        if (mChkBoxReading.isChecked())
            s += mChkBoxReading.getText().toString() + ",";

        if (mChkBoxWriting.isChecked())
            s += mChkBoxWriting.getText().toString() + ", ";

        if (mChkBoxClimbing.isChecked())
            s += mChkBoxClimbing.getText().toString() + ",";

        if (mChkBoxSwim.isChecked())
            s += mChkBoxSwim.getText().toString() + ", ";

        if (mChkBoxExercise.isChecked())
            s += mChkBoxExercise.getText().toString() + ", ";

        if (mChkBoxFitness.isChecked())
            s += mChkBoxFitness.getText().toString() + ", ";

        if (mChkBoxPhoto.isChecked())
            s += mChkBoxPhoto.getText().toString() + ", ";

        if (mChkBoxFood.isChecked())
            s += mChkBoxFood.getText().toString() + ", ";

        if (mChkBoxPainting.isChecked())
            s += mChkBoxPainting.getText().toString() + ", ";

        // 顯示勾選的興趣項目
        mTxtHobby.setText(s);
    }*/


    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        String s = getString(R.string.your_hobby);

        if (isChecked){
            selected.add(compoundButton);

        }
        else {
            selected.remove(compoundButton);

        }
        for (CompoundButton chk:selected) {
            s += chk.getText().toString()+"\t";
        }

        mTxtHobby.setText(s);
    }
}