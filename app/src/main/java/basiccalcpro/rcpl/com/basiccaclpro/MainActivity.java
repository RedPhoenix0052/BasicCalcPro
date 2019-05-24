package basiccalcpro.rcpl.com.basiccaclpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText et;
    Button btnDot, btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnEqual, btnAdd, btnSub, btnMul, btnDiv, btnDel, btnClr;
    String strnum="";
    Double num1,res;
    int btn,btnEq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.editText1);
        btnDot = findViewById(R.id.buttonDot);
        btn0 = findViewById(R.id.button0);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btnEqual = findViewById(R.id.buttonEqual);
        btnAdd = findViewById(R.id.buttonAdd);
        btnSub = findViewById(R.id.buttonSub);
        btnMul = findViewById(R.id.buttonMul);
        btnDiv = findViewById(R.id.buttonDiv);
        btnDel = findViewById(R.id.buttonDel);
        btnClr = findViewById(R.id.buttonClear);

        et.setShowSoftInputOnFocus(false);

        btnDot.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnDel.setOnClickListener(this);
        btnClr.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonDot:
                if(btnEq==R.id.buttonEqual) {
                et.getText().clear();
                strnum="";
                btnEq=0;
                }
                strnum = strnum.concat(btnDot.getText().toString());
                et.setText(strnum);
                break;
            case R.id.button0:
                if(btnEq==R.id.buttonEqual) {
                    et.getText().clear();
                    strnum="";
                    btnEq = 0;
                }
                strnum = strnum.concat(btn0.getText().toString());
                et.setText(strnum);
                break;
            case R.id.button1:
                if(btnEq==R.id.buttonEqual) {
                    et.getText().clear();
                    strnum="";
                    btnEq = 0;
                }
                strnum = strnum.concat(btn1.getText().toString());
                et.setText(strnum);
                break;
            case R.id.button2:
                if(btnEq==R.id.buttonEqual) {
                    et.getText().clear();
                    strnum="";
                    btnEq = 0;
                }
                strnum = strnum.concat(btn2.getText().toString());
                et.setText(strnum);
                break;
            case R.id.button3:
                if(btnEq==R.id.buttonEqual) {
                    et.getText().clear();
                    strnum="";
                    btnEq = 0;
                }
                strnum = strnum.concat(btn3.getText().toString());
                et.setText(strnum);
                break;
            case R.id.button4:
                if(btnEq==R.id.buttonEqual) {
                    et.getText().clear();
                    strnum="";
                    btnEq = 0;
                }
                strnum = strnum.concat(btn4.getText().toString());
                et.setText(strnum);
                break;
            case R.id.button5:
                if(btnEq==R.id.buttonEqual) {
                    et.getText().clear();
                    strnum="";
                    btnEq = 0;
                }
                strnum = strnum.concat(btn5.getText().toString());
                et.setText(strnum);
                break;
            case R.id.button6:
                if(btnEq==R.id.buttonEqual) {
                    et.getText().clear();
                    strnum="";
                    btnEq = 0;
                }
                strnum = strnum.concat(btn6.getText().toString());
                et.setText(strnum);
                break;
            case R.id.button7:
                if(btnEq==R.id.buttonEqual) {
                    et.getText().clear();
                    strnum="";
                    btnEq = 0;
                }
                strnum = strnum.concat(btn7.getText().toString());
                et.setText(strnum);
                break;
            case R.id.button8:
                if(btnEq==R.id.buttonEqual) {
                    et.getText().clear();
                    strnum="";
                    btnEq = 0;
                }
                strnum = strnum.concat(btn8.getText().toString());
                et.setText(strnum);
                break;
            case R.id.button9:
                if(btnEq==R.id.buttonEqual) {
                    et.getText().clear();
                    strnum="";
                    btnEq = 0;
                }
                strnum = strnum.concat(btn9.getText().toString());
                et.setText(strnum);
                break;
            case R.id.buttonEqual:
                btnEq = view.getId();
                try {
                    if (btn == R.id.buttonAdd) {
                        res += Double.parseDouble(strnum);
                        et.setText(res.toString());
                        strnum = res.toString();
                    } else if (btn == R.id.buttonSub) {
                        res -= Double.parseDouble(strnum);
                        et.setText(res.toString());
                        strnum = res.toString();
                    } else if (btn == R.id.buttonMul) {
                        res *= Double.parseDouble(strnum);
                        et.setText(res.toString());
                        strnum = res.toString();
                    } else if (btn == R.id.buttonDiv) {
                        res /= Double.parseDouble(strnum);
                        et.setText(res.toString());
                        strnum = res.toString();
                    }
                }
                catch(Exception e){
                    System.out.println(e);
                }
                break;
            case R.id.buttonAdd:
                try {
                    btn = view.getId();
                    num1 = 0.0;
                    num1 += Double.parseDouble(strnum);
                    et.getText().clear();
                    strnum = "";
                    res = num1;
                }
                catch(Exception e){
                    System.out.println(e);
                }
                break;
            case R.id.buttonSub:
                try {
                    btn = view.getId();
                    num1 = 0.0;
                    num1 += Double.parseDouble(strnum);
                    et.getText().clear();
                    strnum = "";
                    res = num1;
                }
                catch(Exception e){
                    System.out.println(e);
                }
                break;
            case R.id.buttonMul:
                try {
                    btn = view.getId();
                    num1 = 0.0;
                    num1 += Double.parseDouble(strnum);
                    et.getText().clear();
                    strnum = "";
                    res = num1;
                }
                catch(Exception e){
                    System.out.println(e);
                }
                break;
            case R.id.buttonDiv:
                try {
                    btn = view.getId();
                    num1 = 0.0;
                    num1 += Double.parseDouble(strnum);
                    et.getText().clear();
                    strnum = "";
                    res = num1;
                }
                catch(Exception e){
                    System.out.println(e);
                }
                break;
            case R.id.buttonDel:
                if (strnum != null && strnum.length() > 0) {
                    strnum = strnum.substring(0, strnum.length() - 1);
                }
                et.setText(strnum);
                break;
            case R.id.buttonClear:
                et.getText().clear();
                strnum = "";
                break;
        }

    }
}
