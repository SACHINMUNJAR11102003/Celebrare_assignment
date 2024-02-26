package com.example.celebrare;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText text;
    TextView editText,parent_1_ed,parent_2_ed,bride_groom_1_ed,bride_groom_2_ed,weds_ed,date_and_vennue_ed;
    LinearLayout edit_ll;
    Spinner fontFamily_spinner,fontSize_spinner,fontColor_spinner;
    Button saveInformation;

    public TextView getEditText() {
        return editText;
    }

    public void setEditText(TextView editText) {
        this.editText = editText;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        text=findViewById(R.id.text_message);
        fontColor_spinner=findViewById(R.id.fontcolor_spinner);
        fontFamily_spinner=findViewById(R.id.font_Family_spinner);
        fontSize_spinner=findViewById(R.id.fontsize_spinner);
        saveInformation=findViewById(R.id.save_information);
        edit_ll=findViewById(R.id.edit_ll);
        parent_1_ed = findViewById(R.id.parent_1);
        parent_2_ed=findViewById(R.id.parent_2);
        bride_groom_1_ed=findViewById(R.id.groom_bride_1);
        bride_groom_2_ed=findViewById(R.id.groom_bride_2);
        weds_ed=findViewById(R.id.weds);
        date_and_vennue_ed=findViewById(R.id.date_vennue);


        parent_1_ed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_ll.setVisibility(View.VISIBLE);
                setEditText(parent_1_ed);
            }
        });

        parent_2_ed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_ll.setVisibility(View.VISIBLE);
                setEditText(parent_2_ed);
            }
        });

        bride_groom_1_ed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_ll.setVisibility(View.VISIBLE);
                setEditText(bride_groom_1_ed);
            }
        });

        bride_groom_2_ed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_ll.setVisibility(View.VISIBLE);
                setEditText(bride_groom_2_ed);
            }
        });

        weds_ed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_ll.setVisibility(View.VISIBLE);
                setEditText(weds_ed);
            }
        });

        date_and_vennue_ed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_ll.setVisibility(View.VISIBLE);
                setEditText(date_and_vennue_ed);
            }
        });

        ArrayList<String> list_font_family=new ArrayList<>();
        list_font_family.add("Select Font Family");
        list_font_family.add("Aclonica");
        list_font_family.add("Bad Script");
        list_font_family.add("Diplomata");
        list_font_family.add("Almendra");
        list_font_family.add("Annie Use Your Telescope");
        list_font_family.add("Alfa Slab One");
        list_font_family.add("Aguafina Script");

        ArrayAdapter<String> arrayAdapter_fontFamily=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,list_font_family);
        fontFamily_spinner.setAdapter(arrayAdapter_fontFamily);

        ArrayList<String> list_font_size = new ArrayList<>();
        list_font_size.add("Select Font Size");
        list_font_size.add("Very Small");
        list_font_size.add("Small");
        list_font_size.add("Medium");
        list_font_size.add("Large");

        ArrayAdapter<String> arrayAdapter_fontSize = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, list_font_size);
        fontSize_spinner.setAdapter(arrayAdapter_fontSize);

        ArrayList<String> list_font_color = new ArrayList<>();
        list_font_color.add("Select Font Color");
        list_font_color.add("Black");
        list_font_color.add("Red");
        list_font_color.add("Blue");
        list_font_color.add("Green");
        list_font_color.add("Yellow");

        ArrayAdapter<String> arrayAdapter_fontColor = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, list_font_color);
        fontColor_spinner.setAdapter(arrayAdapter_fontColor);


        saveInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView textView=getEditText();
                String text_message=text.getText().toString();
                textView.setText(text_message);
                fontFamily_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        if (i==1){
                            textView.setTypeface(ResourcesCompat.getFont(MainActivity.this,R.font.aclonica));
                        } else if (i==2) {
                            textView.setTypeface(ResourcesCompat.getFont(MainActivity.this,R.font.bad_script));
                        } else if (i==3) {
                            textView.setTypeface(ResourcesCompat.getFont(MainActivity.this,R.font.diplomata_sc));
                        } else if (i==4) {
                            textView.setTypeface(ResourcesCompat.getFont(MainActivity.this,R.font.almendra_display));
                        }else if (i==5) {
                            textView.setTypeface(ResourcesCompat.getFont(MainActivity.this,R.font.annie_use_your_telescope));
                        }else if (i==6) {
                            textView.setTypeface(ResourcesCompat.getFont(MainActivity.this,R.font.alfa_slab_one));
                        }else if (i==7) {
                            textView.setTypeface(ResourcesCompat.getFont(MainActivity.this,R.font.aguafina_script));
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });


                fontSize_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        float size;
                        switch (i) {
                            case 1:
                                size=10;
                            case 2:
                                size = 20;
                                break;
                            case 3:
                                size = 30;
                                break;
                            case 4:
                                size = 40;
                                break;
                            default:
                                size = 20;
                                break;
                        }
                        textView.setTextSize(size);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });

                fontColor_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        int color;
                        switch (i) {
                            case 1:
                                color = Color.BLACK;
                                break;
                            case 2:
                                color = Color.RED;
                                break;
                            case 3:
                                color = Color.BLUE;
                                break;

                            case 4:
                                color = Color.GREEN;
                                break;

                            case 5:
                                color = Color.YELLOW;
                                break;

                            default:
                                color = Color.BLACK;
                                break;
                        }
                        textView.setTextColor(color);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });


            }
        });

    }

    public void savingInformation(EditText editText1,int fontsize,String fontcolor,String fontfamily){



    }

    @Override
    public void onBackPressed() {
        if (edit_ll.getVisibility() == View.VISIBLE) {
            edit_ll.setVisibility(View.GONE);
        } else {
            super.onBackPressed();
        }
    }

}

