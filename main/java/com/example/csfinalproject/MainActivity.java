package com.example.csfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;

//Yussef Ibarra Calculator App
public class MainActivity extends AppCompatActivity {
    boolean exp = false;
    boolean add = false;
    boolean sub = false;
    boolean mul = false;
    boolean div = false;
    boolean mod = false;

    TextView tvmain;
    TextView tvsec;

    androidx.appcompat.widget.AppCompatButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bdot,bpi,be,bln,bmod,binv,bsin,bcos,btan,bClear,bfact,bexp,bsqrt,bdiv,bmul,bmin,bplus,bequal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        bdot = findViewById(R.id.bdot);
        bpi = findViewById(R.id.bpi);
        be = findViewById(R.id.be);
        bln = findViewById(R.id.bln);
        bmod = findViewById(R.id.bmod);
        binv = findViewById(R.id.binv);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        btan = findViewById(R.id.btan);
        bClear = findViewById(R.id.bClear);
        bfact = findViewById(R.id.bfact);
        bexp = findViewById(R.id.bexp);
        bsqrt = findViewById(R.id.bsqrt);
        bdiv = findViewById(R.id.bdiv);
        bmul = findViewById(R.id.bmul);
        bmin = findViewById(R.id.bmin);
        bplus = findViewById(R.id.bplus);
        bequal = findViewById(R.id.bequal);

        tvmain = findViewById(R.id.tvmain);
        tvsec = findViewById(R.id.tvsec);

        //Load the contents in from the last time App was used
        try {
            load();
        } catch (Exception e) {
            e.printStackTrace();
        }

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvsec.getText().toString().equals("Error")) {
                    tvmain.setText("");
                }
                tvsec.setText("Number");
                tvmain.setText(tvmain.getText() + "0");
                try {
                    save();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvsec.getText().toString().equals("Error")) {
                    tvmain.setText("");
                }
                tvsec.setText("Number");
                tvmain.setText(tvmain.getText() + "1");
                try {
                    save();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvsec.getText().toString().equals("Error")) {
                    tvmain.setText("");
                }
                tvsec.setText("Number");
                tvmain.setText(tvmain.getText() + "2");
                try {
                    save();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvsec.getText().toString().equals("Error")) {
                    tvmain.setText("");
                }
                tvsec.setText("Number");
                tvmain.setText(tvmain.getText() + "3");
                try {
                    save();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvsec.getText().toString().equals("Error")) {
                    tvmain.setText("");
                }
                tvsec.setText("Number");
                tvmain.setText(tvmain.getText() + "4");
                try {
                    save();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvsec.getText().toString().equals("Error")) {
                    tvmain.setText("");
                }
                tvsec.setText("Number");
                tvmain.setText(tvmain.getText() + "5");
                try {
                    save();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvsec.getText().toString().equals("Error")) {
                    tvmain.setText("");
                }
                tvsec.setText("Number");
                tvmain.setText(tvmain.getText() + "6");
                try {
                    save();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvsec.getText().toString().equals("Error")) {
                    tvmain.setText("");
                }
                tvsec.setText("Number");
                tvmain.setText(tvmain.getText() + "7");
                try {
                    save();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvsec.getText().toString().equals("Error")) {
                    tvmain.setText("");
                }
                tvsec.setText("Number");
                tvmain.setText(tvmain.getText() + "8");
                try {
                    save();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvsec.getText().toString().equals("Error")) {
                    tvmain.setText("");
                }
                tvsec.setText("Number");
                tvmain.setText(tvmain.getText() + "9");
                try {
                    save();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvsec.getText().toString().equals("Error")) {
                    tvmain.setText("");
                }
                tvsec.setText("Decimal");
                tvmain.setText(tvmain.getText() + ".");
                try {
                    save();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvsec.getText().toString().equals("Error")) {
                    tvmain.setText("");
                }
                tvsec.setText(bpi.getText());
                tvmain.setText(tvmain.getText() + String.format("%.7f", Math.PI));
                try {
                    save();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvsec.getText().toString().equals("Error")) {
                    tvmain.setText("");
                }
                tvsec.setText(be.getText());
                tvmain.setText(tvmain.getText() + String.format("%.7f", Math.E));
                try {
                    save();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mod = true;
                tvmain.setText(tvmain.getText() + "%");
                try {
                    save();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                div = true;
                if (!tvmain.getText().toString().isEmpty() && tvmain.getText().toString().matches("[0-9]+[.]?[0-9]*")) {
                    try {
                        tvsec.setText(String.format("%s%f%s", "1/", Double.parseDouble(tvmain.getText().toString()), "="));
                        tvmain.setText(calculate("1/" + tvmain.getText().toString(), "[/]"));
                        try {
                            save();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        div = false;
                    } catch (Exception e) {
                        tvsec.setText("Error");
                        tvmain.setText("Divide by 0 Error");
                        try {
                            save();
                        } catch (Exception io) {
                            io.printStackTrace();
                        }
                    }
                } else {
                    tvsec.setText("Error");
                    tvmain.setText("Enter a number");
                    try {
                        save();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tvmain.getText().toString().isEmpty() && tvmain.getText().toString().matches("[0-9]+[.]?[0-9]*")) {
                    tvsec.setText(String.format("%s%f%s", "sin(", Double.parseDouble(tvmain.getText().toString()), ")="));
                    tvmain.setText(String.format("%.7f", Math.sin(Double.parseDouble(tvmain.getText().toString()))));
                    try {
                        save();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    tvsec.setText("Error");
                    tvmain.setText("Enter a number");
                    try {
                        save();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tvmain.getText().toString().isEmpty() && tvmain.getText().toString().matches("[0-9]+[.]?[0-9]*")) {
                    tvsec.setText(String.format("%s%f%s", "cos(", Double.parseDouble(tvmain.getText().toString()), ")="));
                    tvmain.setText(String.format("%.7f", Math.cos(Double.parseDouble(tvmain.getText().toString()))));
                    try {
                        save();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    tvsec.setText("Error");
                    tvmain.setText("Enter a number");
                    try {
                        save();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tvmain.getText().toString().isEmpty() && tvmain.getText().toString().matches("[0-9]+[.]?[0-9]*")) {
                    double number = Double.parseDouble(tvmain.getText().toString());
                    if (Math.cos(number) == (double) 0) {
                        tvsec.setText("Error");
                        tvmain.setText("Domain Error");
                        try {
                            save();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        tvsec.setText(String.format("%s%f%s", "tan(", number, ")="));
                        tvmain.setText(String.format("%.7f", Math.tan(number)));
                        try {
                            save();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    tvsec.setText("Error");
                    tvmain.setText("Enter a number");
                    try {
                        save();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsec.setText("");
                tvmain.setText("");
                try {
                    save();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tvmain.getText().toString().matches("[0-9]+")) {
                    tvsec.setText("Error");
                    tvmain.setText("Enter an integer");
                    try {
                        save();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    int number = Integer.parseInt(tvmain.getText().toString());
                    tvsec.setText(String.format("%d%s", number, "! ="));
                    tvmain.setText(String.valueOf(factorial(number)));
                    try {
                        save();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tvmain.getText().toString().isEmpty() && tvmain.getText().toString().matches("[0-9]+[.]?[0-9]*")) {
                    double number = Double.parseDouble(tvmain.getText().toString());
                    if (number < (double) 0) {
                        tvsec.setText("Error");
                        tvmain.setText("Domain Error");
                        try {
                            save();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        tvsec.setText(String.format("%s%f%s", "squrt(", number, ")="));
                        tvmain.setText(String.format("%.7f", Math.sqrt(number)));
                        try {
                            save();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    tvsec.setText("Error");
                    tvmain.setText("Enter a number");
                    try {
                        save();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!tvmain.getText().toString().isEmpty() && tvmain.getText().toString().matches("[0-9]+[.]?[0-9]*")) {
                    ;
                    double number = Double.parseDouble(tvmain.getText().toString());
                    if (number <= (double) 0) {
                        tvsec.setText("Error");
                        tvmain.setText("Domain Error");
                        try {
                            save();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        tvsec.setText(String.format("%s%f%s", "ln(", number, ")="));
                        tvmain.setText(String.format("%.7f", Math.log(number)));
                        try {
                            save();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    tvsec.setText("Error");
                    tvmain.setText("Enter a number");
                    try {
                        save();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        bexp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp = true;
                if (tvsec.getText().toString().equals("Error")) {
                    tvmain.setText("");
                }
                tvsec.setText("exponential");
                tvmain.setText(tvmain.getText() + "^");
                try {
                    save();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                div = true;
                if (tvsec.getText().toString().equals("Error")) {
                    tvmain.setText("");
                }
                tvsec.setText("division");
                tvmain.setText(tvmain.getText() + "/");
                try {
                    save();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mul = true;
                if (tvsec.getText().toString().equals("Error")) {
                    tvmain.setText("");
                }
                tvsec.setText("multiplication");
                tvmain.setText(tvmain.getText() + "*");
                try {
                    save();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub = true;
                if (tvsec.getText().toString().equals("Error")) {
                    tvmain.setText("");
                }
                tvsec.setText("subtraction");
                tvmain.setText(tvmain.getText() + "-");
                try {
                    save();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add = true;
                if (tvsec.getText().toString().equals("Error")) {
                    tvmain.setText("");
                }
                tvsec.setText("addition");
                tvmain.setText(tvmain.getText() + "+");
                try {
                    save();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String str = tvmain.getText().toString();
                    tvsec.setText(tvmain.getText().toString() + "=");
                    if (exp) {
                        tvmain.setText(calculate(str, "\\^"));
                        try {
                            save();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        exp = false;
                    } else if (mod) {
                        tvmain.setText(calculate(str, "[%]"));
                        try {
                            save();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        mod = false;
                    } else if (add) {
                        tvmain.setText(calculate(str, "[+]"));
                        try {
                            save();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        add = false;
                    } else if (sub) {
                        tvmain.setText(calculate(str, "[-]"));
                        try {
                            save();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        sub = false;
                    } else if (mul) {
                        tvmain.setText(calculate(str, "[*]"));
                        try {
                            save();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        mul = false;
                    } else if (div) {
                        try {
                            tvmain.setText(calculate(str, "[/]"));
                            try {
                                save();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            div = false;
                        } catch (ArithmeticException ae) {
                            tvsec.setText("Error");
                            tvmain.setText("Divide by 0 Error");
                            try {
                                save();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                } catch (InputMismatchException in) {
                    tvsec.setText("Error");
                    tvmain.setText("Too many operat.");
                    try {
                        save();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    public void save() throws Exception {
        String textsec = tvsec.getText().toString();
        String textmain = tvmain.getText().toString();
        File file = new File(MainActivity.this.getFilesDir(),"history");
        if(!file.exists()){
            file.mkdir();
        }
        FileWriter writer = new FileWriter(new File(file,"sample"));
        writer.append(textsec).append("\n").append(textmain);
        writer.flush();
        writer.close();
    }

    public void load() throws Exception {
        File fileEvents = new File(MainActivity.this.getFilesDir()+"/history/sample");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileEvents));
        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            list.add(line);
        }
        bufferedReader.close();
        tvsec.setText(list.get(0));
        tvmain.setText(list.get(1));
    }

    private int factorial(int x){
        if(x==0||x==1){
            return 1;
        }else{
            return x*factorial(x-1);
        }
    }

    private String calculate(String str,String operator){
        String [] strArr = str.split(operator);
        if(strArr.length!=2 && !(strArr[0].matches("[0-9]+[.]?[0-9]*") || strArr[1].matches("[0-9]+[.]?[0-9]*"))){
            throw new InputMismatchException();
        }
        double num1 = Double.parseDouble(strArr[0]);
        double num2 = Double.parseDouble(strArr[1]);
        if(exp) {
            return String.valueOf(Math.pow(num1, num2));
        }else if(mod){
            return String.valueOf(num1%num2);
        }else if(add){
            return String.valueOf(num1+num2);
        }else if(sub){
            return String.valueOf(num1-num2);
        }else if(mul){
            return String.valueOf(num1*num2);
        }else if(div){
            if(num2==(double) 0){
                throw new ArithmeticException();
            }
            return String.format("%.7f", num1/num2);
        }
        return null;
    }
}