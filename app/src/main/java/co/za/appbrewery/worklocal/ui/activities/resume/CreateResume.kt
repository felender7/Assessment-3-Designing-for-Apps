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

        setContentView(R.layout.activity_create_resume)

        //Identification type dropDown
        val identification_type = resources.getStringArray(R.array.id_passport)
        val dropDownAutoCompletetxtIdent = findViewById<AutoCompleteTextView>(R.id.autoCompleteIDPassport)
        val arrayAdapterIdentType = ArrayAdapter(this, R.layout.dropdown_item_resume, identification_type)
        dropDownAutoCompletetxtIdent.setAdapter(arrayAdapterIdentType)


        //Gender dropDown
        val gender = resources.getStringArray(R.array.gender)
        val dropDownAutoCompletetxtGender = findViewById<AutoCompleteTextView>(R.id.autoCompleteGender)
        val arrayAdapterGender = ArrayAdapter(this, R.layout.dropdown_item_resume, gender)
        dropDownAutoCompletetxtGender.setAdapter(arrayAdapterGender)

        //Disability dropDown
        val disability = resources.getStringArray(R.array.disability)
        val dropDownAutoCompletetxtDisability = findViewById<AutoCompleteTextView>(R.id.autoCompleteDisability)
        val arrayAdapterDisability = ArrayAdapter(this, R.layout.dropdown_item_resume, disability)
        dropDownAutoCompletetxtDisability.setAdapter(arrayAdapterDisability)

        //Job dropDown
        val job_function = resources.getStringArray(R.array.job_function)
        val dropDownAutoCompletetxtJobFunction = findViewById<AutoCompleteTextView>(R.id.autoCompleteJobFunction)
        val arrayAdapterJobFunction = ArrayAdapter(this, R.layout.dropdown_item_resume, job_function)
        dropDownAutoCompletetxtJobFunction.setAdapter(arrayAdapterJobFunction)

        //hooks
        val btnSaveResume = findViewById<Button>(R.id.btnSaveResume)
        btnSaveResume.setOnClickListener {
            Intent(this,DetailsResume::class.java).also {
                startActivity(it)
            }
        }

    }
}