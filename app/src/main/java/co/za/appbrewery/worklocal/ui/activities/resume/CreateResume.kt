package co.za.appbrewery.worklocal.ui.activities.resume

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import androidx.core.content.ContentProviderCompat.requireContext
import co.za.appbrewery.worklocal.R


class CreateResume : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //actionbar
        val actionbar = supportActionBar

        //set actionbar title
        "Create Resume".also { actionbar!!.title = it }

        //set back button
        actionbar?.setDisplayHomeAsUpEnabled(true)
        actionbar?.setDisplayHomeAsUpEnabled(true)

        setContentView(R.layout.activity_create_resume)

        //Identification type dropDown
        val identification_type = resources.getStringArray(R.array.id_passport)
        val dropDownAutoCompletetxtIdent =
            findViewById<AutoCompleteTextView>(R.id.autoCompleteIDPassport)
        val arrayAdapterIdentType =
            ArrayAdapter(this, R.layout.dropdown_item_resume, identification_type)
        dropDownAutoCompletetxtIdent.setAdapter(arrayAdapterIdentType)


        //Gender dropDown
        val gender = resources.getStringArray(R.array.gender)
        val dropDownAutoCompletetxtGender =
            findViewById<AutoCompleteTextView>(R.id.autoCompleteGender)
        val arrayAdapterGender = ArrayAdapter(this, R.layout.dropdown_item_resume, gender)
        dropDownAutoCompletetxtGender.setAdapter(arrayAdapterGender)

        //Disability dropDown
        val disability = resources.getStringArray(R.array.disability)
        val dropDownAutoCompletetxtDisability =
            findViewById<AutoCompleteTextView>(R.id.autoCompleteDisability)
        val arrayAdapterDisability = ArrayAdapter(this, R.layout.dropdown_item_resume, disability)
        dropDownAutoCompletetxtDisability.setAdapter(arrayAdapterDisability)

        //Job Function  dropDown
        val job_function = resources.getStringArray(R.array.job_function)
        val dropDownAutoCompletetxtJobFunction =
            findViewById<AutoCompleteTextView>(R.id.autoCompleteJobFunction)
        val arrayAdapterJobFunction =
            ArrayAdapter(this, R.layout.dropdown_item_resume, job_function)
        dropDownAutoCompletetxtJobFunction.setAdapter(arrayAdapterJobFunction)


        //Job Industry dropDown
        val job_industry = resources.getStringArray(R.array.job_industry)
        val dropDownAutoCompletetxtJobIndustry =
            findViewById<AutoCompleteTextView>(R.id.autoCompleteJobIndustry)
        val arrayAdapterJobIndustry =
            ArrayAdapter(this, R.layout.dropdown_item_resume, job_industry)
        dropDownAutoCompletetxtJobIndustry.setAdapter(arrayAdapterJobIndustry)

        //Salary Rage dropDown
        val salary_rage = resources.getStringArray(R.array.salary_rage)
        val dropDownAutoCompletetxtSalaryRage =
            findViewById<AutoCompleteTextView>(R.id.autoCompleteSalaryRage)
        val arrayAdapterSalaryRage = ArrayAdapter(this, R.layout.dropdown_item_resume, salary_rage)
        dropDownAutoCompletetxtSalaryRage.setAdapter(arrayAdapterSalaryRage)


        //availability dropDown
        val availability = resources.getStringArray(R.array.availability)
        val dropDownAutoCompletetxtAvailability =
            findViewById<AutoCompleteTextView>(R.id.autoCompleteAvailability)
        val arrayAdapterAvailability =
            ArrayAdapter(this, R.layout.dropdown_item_resume, availability)
        dropDownAutoCompletetxtAvailability.setAdapter(arrayAdapterAvailability)

        //Education
        val education = resources.getStringArray(R.array.education)
        val dropDownAutoCompletetxtEducation =
            findViewById<AutoCompleteTextView>(R.id.autoCompleteEducation)
        val arrayAdapterEducation = ArrayAdapter(this, R.layout.dropdown_item_resume, education)
        dropDownAutoCompletetxtEducation.setAdapter(arrayAdapterEducation)

        //hooks
        val btnSaveResume = findViewById<Button>(R.id.btnSaveResume)
        btnSaveResume.setOnClickListener {
            Intent(this, DetailsResume::class.java).also {
                startActivity(it)
            }
        }

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}