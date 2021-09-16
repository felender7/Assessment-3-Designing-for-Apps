package co.za.appbrewery.worklocal.ui.activities.resume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import co.za.appbrewery.worklocal.R

class DetailsResume : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_resume)


        //actionbar
        val actionbar = supportActionBar

        //set actionbar title
        "Resume Details".also { actionbar!!.title = it }

        //set back button
        actionbar?.setDisplayHomeAsUpEnabled(true)
        actionbar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}

