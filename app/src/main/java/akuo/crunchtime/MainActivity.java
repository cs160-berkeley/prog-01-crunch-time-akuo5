// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package akuo.crunchtime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    double exercise0 = 1.0;
    double exercise1 = 3.5;

    private void update(EditText editText, TextView textView0, TextView textView1)
    {
        int num = 0;
        try
        {
            num = Integer.parseInt(editText.getText().toString());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            int calories = (int) (num/exercise0);
            int workout = (int) (num/exercise1);
            textView0.setText(String.valueOf(calories));
            textView1.setText(String.valueOf(workout));
        }
    }

    protected void onCreate(final Bundle bdnle)
    {
        super.onCreate(bdnle);
        setContentView(R.layout.activity_main);
        final EditText from = (EditText)findViewById(R.id.convert_from);
        final TextView to = (TextView)findViewById(R.id.convert_to);
        final TextView to_calorie = (TextView)findViewById(R.id.convert_to_calorie);
        from.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable editable)
            {
            }

            public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
                int num = 0;
                try
                {
                    num = Integer.parseInt(charsequence.toString());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                } finally {
                    int calories = (int) (num/exercise0);
                    int workout = (int) (num/exercise1);
                    to_calorie.setText(String.valueOf(calories));
                    to.setText(String.valueOf(workout));
                }
            }


        });

        final TextView _repmin = (TextView)findViewById(R.id._repmin);
        final TextView repmin_ = (TextView)findViewById(R.id.repmin_);

        final Button _calorieButton = (Button) findViewById(R.id._calorie);
        _calorieButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                _repmin.setText("Calories");
                exercise0 = 1.0;
                update(from, to_calorie, to);
            }
        });

        final Button _pushupButton = (Button) findViewById(R.id._pushup);
        _pushupButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                _repmin.setText("Reps of Pushups");
                exercise0 = 3.5;
                update(from, to_calorie, to);
            }

        });

        final Button _situpButton = (Button) findViewById(R.id._situp);
        _situpButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                _repmin.setText("Reps of Situps");
                exercise0 = 2D;
                update(from, to_calorie, to);
            }


        });

        final Button _squatButton = (Button) findViewById(R.id._squat);
        _squatButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                _repmin.setText("Reps of Squats");
                exercise0 = 2.25D;
                update(from, to_calorie, to);
            }
        });

        final Button _legliftButton = (Button) findViewById(R.id._leglift);
        _legliftButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                _repmin.setText("Mins of LegLifts");
                exercise0 = 0.25D;
                update(from, to_calorie, to);
            }
        });

        final Button _plankButton = (Button) findViewById(R.id._plank);
        _plankButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                _repmin.setText("Mins of Planks");
                exercise0 = 0.25D;
                update(from, to_calorie, to);
            }
        });

        final Button _jumpingjackButton = (Button) findViewById(R.id._jumpingjack);
        _jumpingjackButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                _repmin.setText("Mins of Jumping Jacks");
                exercise0 = 0.10000000000000001D;
                update(from, to_calorie, to);
            }
        });

        final Button _pullupButton = (Button) findViewById(R.id._pullup);
        _pullupButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                _repmin.setText("Reps of Pullups");
                exercise0 = 1.0D;
                update(from, to_calorie, to);
            }
        });

        final Button _cyclingButton = (Button) findViewById(R.id._cycling);
        _cyclingButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                _repmin.setText("Mins of Cycling");
                exercise0 = 0.12D;
                update(from, to_calorie, to);
            }
        });

        final Button _walkingButton = (Button) findViewById(R.id._walking);
        _walkingButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                _repmin.setText("Mins of Walking");
                exercise0 = 0.20000000000000001D;
                update(from, to_calorie, to);
            }
        });

        final Button _joggingButton = (Button) findViewById(R.id._jogging);
        _joggingButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                _repmin.setText("Mins of Jogging");
                exercise0 = 0.12D;
                update(from, to_calorie, to);
            }
        });

        final Button _swimmingButton = (Button) findViewById(R.id._swimming);
        _swimmingButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                _repmin.setText("Mins of Swimming");
                exercise0 = 0.13D;
                update(from, to_calorie, to);
            }
        });

        final Button _stairButton = (Button) findViewById(R.id._stair);
        _stairButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                _repmin.setText("Mins of Stairs");
                exercise0 = 0.15;
                update(from, to_calorie, to);
            }
        });

        final Button pushupButton_ = (Button) findViewById(R.id.pushup_);
        pushupButton_.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                repmin_.setText("Reps of Pushups");
                exercise1 = 3.5D;
                update(from, to_calorie, to);
            }
        });

        final Button situpButton_ = (Button) findViewById(R.id.situp_);
        situpButton_.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                repmin_.setText("Reps of Situps");
                exercise1 = 2.0;
                update(from, to_calorie, to);
            }
        });

        final Button squatButton_ = (Button) findViewById(R.id.squat_);
        squatButton_.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                repmin_.setText("Reps of Squats");
                exercise1 = 2.25;
                update(from, to_calorie, to);
            }
        });

        final Button legliftButton_ = (Button) findViewById(R.id.leglift_);
        legliftButton_.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                repmin_.setText("Mins of LegLifts");
                exercise1 = 0.25;
                update(from, to_calorie, to);
            }
        });

        final Button plankButton_ = (Button) findViewById(R.id.plank_);
        plankButton_.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                repmin_.setText("Mins of Planks");
                exercise1 = 0.25D;
                update(from, to_calorie, to);
            }
        });

        final Button jumpingjackButton_ = (Button) findViewById(R.id.jumpingjack_);
        jumpingjackButton_.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                repmin_.setText("Mins of Jumping Jacks");
                exercise1 = 0.10;
                update(from, to_calorie, to);
            }
        });

        final Button pullupButton_ = (Button) findViewById(R.id.pullup_);
        pullupButton_.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                repmin_.setText("Reps of Pullups");
                exercise1 = 1.0;
                update(from, to_calorie, to);
            }
        });

        final Button cyclingButton_ = (Button) findViewById(R.id.cycling_);
        cyclingButton_.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                repmin_.setText("Mins of Cycling");
                exercise1 = 0.12;
                update(from, to_calorie, to);
            }
        });

        final Button walkingButton_ = (Button) findViewById(R.id.walking_);
        walkingButton_.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                repmin_.setText("Mins of Walking");
                exercise1 = 0.2;
                update(from, to_calorie, to);
            }
        });

        final Button joggingButton_ = (Button) findViewById(R.id.jogging_);
        joggingButton_.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                repmin_.setText("Mins of Jogging");
                exercise1 = 0.12;
                update(from, to_calorie, to);
            }
        });

        final Button swimmingButton_ = (Button) findViewById(R.id.swimming_);
        swimmingButton_.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                repmin_.setText("Mins of Swimming");
                exercise1 = 0.13;
                update(from, to_calorie, to);
            }
        });

        final Button stairButton_ = (Button) findViewById(R.id.stair_);
        stairButton_.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                repmin_.setText("Mins of Stairs");
                exercise1 = 0.15;
                update(from, to_calorie, to);
            }
        });
    }

}
