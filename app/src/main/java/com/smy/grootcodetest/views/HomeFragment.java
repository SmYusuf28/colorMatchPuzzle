package com.smy.grootcodetest.views;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.smy.grootcodetest.R;
import com.smy.grootcodetest.viewmodel.AuthViewModel;

import java.util.Arrays;
import java.util.HashMap;

public class HomeFragment extends Fragment {

    private AuthViewModel viewModel;
    private NavController navController;
    private Button signOutBtn,testButton;
    TextView btn_one,btn_two,btn_three,btn_four,btn_five,btn_six,btn_seven,btn_eight,btn_nine,txt_time;
    TextView[] txt_array = {btn_one,btn_two,btn_three,btn_four,btn_five,btn_six,btn_seven,btn_eight,btn_nine};
    int count = 1;
    TextView selectOne;
    TextView selectTwo;
    boolean rowOne = false;
    boolean rowTwo = false;
    boolean rowThree = false;
    AppCompatButton btn_scramble,btn_history;
    int score = 0;
    CountDownTimer timer;
    TextView txt_score;
    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference root = db.getReference().child("data");


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        viewModel = new ViewModelProvider(this , ViewModelProvider.AndroidViewModelFactory
                .getInstance(getActivity().getApplication())).get(AuthViewModel.class);
        viewModel.getLoggedStatus().observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {
               if (aBoolean){
                  navController.navigate(R.id.action_homeFragment_to_signInFragment);
               }
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        signOutBtn = view.findViewById(R.id.btn_signOut);
        btn_one = view.findViewById(R.id.btn_one);
        btn_two = view.findViewById(R.id.btn_two);
        btn_three = view.findViewById(R.id.btn_three);
        btn_four = view.findViewById(R.id.btn_four);
        btn_five = view.findViewById(R.id.btn_five);
        btn_six = view.findViewById(R.id.btn_six);
        btn_seven = view.findViewById(R.id.btn_seven);
        btn_eight = view.findViewById(R.id.btn_eight);
        btn_nine = view.findViewById(R.id.btn_nine);
        txt_time = view.findViewById(R.id.txt_time);
        btn_scramble = view.findViewById(R.id.btn_scramble);
        btn_history = view.findViewById(R.id.btn_history);
        txt_score = view.findViewById(R.id.txt_score);


        txt_array[0] = btn_one;
        txt_array[1] = btn_two;
        txt_array[2] = btn_three;
        txt_array[3] = btn_four;
        txt_array[4] = btn_five;
        txt_array[5] = btn_six;
        txt_array[6] = btn_seven;
        txt_array[7] = btn_eight;
        txt_array[8] = btn_nine;

        navController = Navigation.findNavController(view);

        btn_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_homeFragment_to_playResultFragment);
            }
        });

        signOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.signOut();
            }
        });

        btn_scramble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doScramble();
            }
        });

        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count == 1){
                    selectOne = btn_one;
                    count++;
                } else if (count == 2){
                    selectTwo = btn_one;
                    changeColor(selectOne,selectTwo);
                }
                Log.e("Counttt",count+"");
            }
        });

        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count == 1){
                    selectOne = btn_two;
                    count++;
                } else if (count == 2){
                    selectTwo = btn_two;
                    changeColor(selectOne,selectTwo);
                }
                Log.e("Counttt",count+"");
            }
        });

        btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count == 1){
                    selectOne = btn_three;
                    count++;
                } else if (count == 2){
                    selectTwo = btn_three;
                    changeColor(selectOne,selectTwo);
                }
                Log.e("Counttt",count+"");
            }
        });

        btn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count == 1){
                    selectOne = btn_four;
                    count++;
                } else if (count == 2){
                    selectTwo = btn_four;
                    changeColor(selectOne,selectTwo);
                }
                Log.e("Counttt",count+"");
            }
        });

        btn_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count == 1){
                    selectOne = btn_five;
                    count++;
                } else if (count == 2){
                    selectTwo = btn_five;
                    changeColor(selectOne,selectTwo);
                }
                Log.e("Counttt",count+"");
            }
        });

        btn_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count == 1){
                    selectOne = btn_six;
                    count++;
                } else if (count == 2){
                    selectTwo = btn_six;
                    changeColor(selectOne,selectTwo);
                }
                Log.e("Counttt",count+"");
            }
        });

        btn_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count == 1){
                    selectOne = btn_seven;
                    count++;
                } else if (count == 2){
                    selectTwo = btn_seven;
                    changeColor(selectOne,selectTwo);
                }
                Log.e("Counttt",count+"");
            }
        });



        btn_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count == 1){
                    selectOne = btn_eight;
                    count++;
                } else if (count == 2){
                    selectTwo = btn_eight;
                    changeColor(selectOne,selectTwo);
                }
                Log.e("Counttt",count+"");
            }
        });

        btn_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count == 1){
                    selectOne = btn_nine;
                    count++;
                } else if (count == 2){
                    selectTwo = btn_nine;
                    changeColor(selectOne,selectTwo);
                }
                Log.e("Counttt",count+"");
            }
        });

    }

    public void doScramble(){
        btn_two.setText("green");
        btn_two.setBackgroundColor(getResources().getColor(R.color.green));
        btn_three.setText("blue");
        btn_three.setBackgroundColor(getResources().getColor(R.color.blue));
        btn_four.setText("blue");
        btn_four.setBackgroundColor(getResources().getColor(R.color.blue));
        btn_five.setText("green");
        btn_five.setBackgroundColor(getResources().getColor(R.color.green));
        btn_six.setText("red");
        btn_six.setBackgroundColor(getResources().getColor(R.color.red));
        btn_seven.setText("red");
        btn_seven.setBackgroundColor(getResources().getColor(R.color.red));
        btn_eight.setText("blue");
        btn_eight.setBackgroundColor(getResources().getColor(R.color.blue));
        btn_nine.setText("green");
        btn_nine.setBackgroundColor(getResources().getColor(R.color.green));
        txt_score.setVisibility(View.GONE);
        btn_history.setVisibility(View.GONE);
        startTimer();
    }

    public void doAlign(){
        btn_one.setText("red");
        btn_one.setBackgroundColor(getResources().getColor(R.color.red));
        btn_two.setText("red");
        btn_two.setBackgroundColor(getResources().getColor(R.color.red));
        btn_three.setText("red");
        btn_three.setBackgroundColor(getResources().getColor(R.color.red));
        btn_four.setText("green");
        btn_four.setBackgroundColor(getResources().getColor(R.color.green));
        btn_five.setText("green");
        btn_five.setBackgroundColor(getResources().getColor(R.color.green));
        btn_six.setText("green");
        btn_six.setBackgroundColor(getResources().getColor(R.color.green));
        btn_seven.setText("blue");
        btn_seven.setBackgroundColor(getResources().getColor(R.color.blue));
        btn_eight.setText("blue");
        btn_eight.setBackgroundColor(getResources().getColor(R.color.blue));
        btn_nine.setText("blue");
        btn_nine.setBackgroundColor(getResources().getColor(R.color.blue));
    }

    private void startTimer() {
        timer = new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                txt_time.setText("seconds remaining: " + millisUntilFinished / 1000);
                boolean one = checkRowOne();
                boolean two = checkRowTwo();
                boolean three = checkRowThree();
                boolean result = one && two && three;
                if (result){
                    long seconds = millisUntilFinished / 1000;
                    completeTask("success",seconds);
                    //Toast.makeText(MainActivity.this,"success",Toast.LENGTH_SHORT).show();


                    Log.e("===Status===","success");
                }
                //here you can have your logic to set text to edittext
            }

            public void onFinish() {
                txt_time.setText("time over");
                completeTask("failure",0);
                doAlign();
//                Intent intent = new Intent(MainActivity.this,GameOverActivity.class);
//                intent.putExtra("score","50");
//                startActivity(intent);
            }

        }.start();
    }

    private void completeTask(String status,long seconds) {
        String score;
        int time = (int) seconds;
        if (time > 20){
            score = 100+"";
        } else if (time >10 && time <= 20){
            score = 50+"";
        }else {
            score = 0+"";
        }

        HashMap<String,String> resultMap = new HashMap<>();

        resultMap.put("status",status);
        resultMap.put("score",score);

        root.push().setValue(resultMap);


        txt_score.setText("Your score is "+score);
        txt_score.setVisibility(View.VISIBLE);
        btn_history.setVisibility(View.VISIBLE);
        timer.cancel();

    }

    private void changeColor(TextView selectOne, TextView selectTwo) {
        int indexOne = Arrays.asList(txt_array).indexOf(selectOne);
        int indexTwo = Arrays.asList(txt_array).indexOf(selectTwo);

        String temp = selectOne.getText().toString();
        String str1 = selectTwo.getText().toString();
        String str2 = temp;

        selectOne.setText(str1);
        selectTwo.setText(str2);

        if (selectOne.getText().toString().equals("red")){
            txt_array[indexOne].setBackgroundColor(getResources().getColor(R.color.red));
        } else if(selectOne.getText().toString().equals("green")){
            txt_array[indexOne].setBackgroundColor(getResources().getColor(R.color.green));
        }else {
            txt_array[indexOne].setBackgroundColor(getResources().getColor(R.color.blue));
        }

        if (selectTwo.getText().toString().equals("red")){
            txt_array[indexTwo].setBackgroundColor(getResources().getColor(R.color.red));
        } else if(selectTwo.getText().toString().equals("green")){
            txt_array[indexTwo].setBackgroundColor(getResources().getColor(R.color.green));
        }else {
            txt_array[indexTwo].setBackgroundColor(getResources().getColor(R.color.blue));
        }

        count = 1;
    }

    public boolean checkRowOne(){
        if (btn_one.getText().toString().equals("red") &&
                btn_two.getText().toString().equals("red") &&
                btn_three.getText().toString().equals("red")){
            return  true;
        }
        return false;
    }

    public boolean checkRowTwo(){
        if (btn_four.getText().toString().equals("green") &&
                btn_five.getText().toString().equals("green") &&
                btn_six.getText().toString().equals("green")){
            return  true;
        }
        return false;
    }

    public boolean checkRowThree(){
        if (btn_seven.getText().toString().equals("blue") &&
                btn_eight.getText().toString().equals("blue") &&
                btn_nine.getText().toString().equals("blue")){
            return  true;
        }
        return false;
    }
}