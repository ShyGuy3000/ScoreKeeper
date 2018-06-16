package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    // Tracks the score for Fleet Commander (Player 1)
    int scoreFleetComm = 50;

    // Tracks the score for Enemy Commander (Player 2)
    int scoreEnemyComm = 50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Fleet Commander */

    /** Adds 5 to the Authority for the Fleet Commander */
    public void plusFiveFleetComm (View view)
    {
        scoreFleetComm = scoreFleetComm + 5;
        displayForFleetComm(scoreFleetComm);
    }

    /** Adds 1 to the Authority for the Fleet Commander */
    public void plusOneFleetComm (View view)
    {
        scoreFleetComm = scoreFleetComm + 1;
        displayForFleetComm(scoreFleetComm);
    }

    /** Subtracts 1 to the Authority for the Fleet Commander */
    public void minusOneFleetComm (View view)
    {
        scoreFleetComm = scoreFleetComm - 1;
        if (scoreFleetComm < 0) {
            scoreFleetComm = 0;
           }
        if (scoreFleetComm == 0) {
            // Show defeat as a toast
            Toast.makeText(this, "GAME OVER", Toast.LENGTH_SHORT).show();
        }
        displayForFleetComm(scoreFleetComm);
    }

    /** Subtracts 5 to the Authority for the Fleet Commander */
    public void minusFiveFleetComm (View view)
    {
        scoreFleetComm = scoreFleetComm - 5;
        if (scoreFleetComm < 0) {
            scoreFleetComm = 0;
        }
        if (scoreFleetComm == 0) {
            // Show defeat as a toast
            Toast.makeText(this, "GAME OVER", Toast.LENGTH_SHORT).show();
        }
        displayForFleetComm(scoreFleetComm);
    }

    /** Enemy Commander */

    /** Adds 5 to the Authority for the Enemy Commander */
    public void plusFiveEnemyComm (View view)
    {
        scoreEnemyComm = scoreEnemyComm + 5;
        displayForEnemyComm(scoreEnemyComm);
    }

    /** Adds 1 to the Authority for the Enemy Commander */
    public void plusOneEnemyComm (View view)
    {
        scoreEnemyComm = scoreEnemyComm + 1;
        displayForEnemyComm(scoreEnemyComm);
    }

    /** Subtracts 1 to the Authority for the Enemy Commander */
    public void minusOneEnemyComm (View view)
    {
        scoreEnemyComm = scoreEnemyComm - 1;
        if (scoreEnemyComm < 0) {
            scoreEnemyComm = 0;
        }
        if (scoreEnemyComm == 0) {
            // Show defeat as a toast
            Toast.makeText(this, "VICTORY!!", Toast.LENGTH_SHORT).show();
        }
        displayForEnemyComm(scoreEnemyComm);
    }

    /** Subtracts 5 to the Authority for the Enemy Commander */
    public void minusFiveEnemyComm (View view)
    {
        scoreEnemyComm = scoreEnemyComm - 5;
        if (scoreEnemyComm < 0) {
            scoreEnemyComm = 0;
        }
        if (scoreEnemyComm == 0) {
            // Show defeat as a toast
            Toast.makeText(this, "VICTORY!!", Toast.LENGTH_SHORT).show();
        }
        displayForEnemyComm(scoreEnemyComm);
    }

    /** Resets both Commander's Authority back to 0 */
    public void resetPoints (View view)
    {
        scoreFleetComm = 50;
        scoreEnemyComm = 50;
        displayForFleetComm(scoreFleetComm);
        displayForEnemyComm(scoreEnemyComm);
    }

    /**
     * Displays the given Authority for the Fleet Commander.
     */
    public void displayForFleetComm(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fleet_commander_authority);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Authority for the Enemy Commander.
     */
    public void displayForEnemyComm(int score) {
        TextView scoreView = (TextView) findViewById(R.id.enemy_commander_authority);
        scoreView.setText(String.valueOf(score));
    }
}
