package sg.edu.rp.c346.id20018354.democontextmenutranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvTranslatedText;
    TextView tvTranslatedText2;
    TextView tvTranslatedText3;
    String wordClicked="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTranslatedText=findViewById(R.id.textViewTranslatedText);
        tvTranslatedText2=findViewById(R.id.textViewTranslatedText2);
        tvTranslatedText3=findViewById(R.id.textViewTranslatedText3);
        registerForContextMenu(tvTranslatedText);
        registerForContextMenu(tvTranslatedText2);
        registerForContextMenu(tvTranslatedText3);    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        Log.v("Context","create context");
        menu.add(0,0,0,"English");
        menu.add(0,1,1,"Italian");
        menu.add(0,2,2,"French");
        menu.add(0,3,3,"Japanese");
        menu.add(0,4,4,"Korean");
        menu.add(0,5,5,"Chinese");
        if(v==tvTranslatedText){
            wordClicked="hello";
            Log.v("Context","top view selected");
        }
        else if(v==tvTranslatedText2){
            wordClicked="bye";
            Log.v("Context","middle view selected");
        }else{
            wordClicked="anything";
            Log.v("Context","bottom view selected");
        }
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(wordClicked.equalsIgnoreCase("hello")){
        if(item.getItemId()==0) { //check whether the selected menu item ID is 0
            //code for action
            tvTranslatedText.setText("Hello");
            return true; //menu item successfully handled
        }
        else if(item.getItemId()==1) { //check if the selected menu item ID is 1
            //code for action
            tvTranslatedText.setText("Ciao");
            return true;  //menu item successfully handled
        }
        else if(item.getItemId()==2) { //check if the selected menu item ID is 1
            //code for action
            tvTranslatedText.setText("Bonjour");
            return true;  //menu item successfully handled
        }
        else if(item.getItemId()==3) { //check if the selected menu item ID is 1
            //code for action
            tvTranslatedText.setText("???????????????");
            return true;  //menu item successfully handled
        }
        else if(item.getItemId()==4) { //check if the selected menu item ID is 1
            //code for action
            tvTranslatedText.setText("???????????????");
            return true;  //menu item successfully handled
        }
        else if(item.getItemId()==5) { //check if the selected menu item ID is 1
            //code for action
            tvTranslatedText.setText("??????");
            return true;  //menu item successfully handled
        }
    } else if(wordClicked.equalsIgnoreCase("bye")){
            if(item.getItemId()==0) { //check whether the selected menu item ID is 0
                //code for action
                tvTranslatedText2.setText("Bye");
                return true; //menu item successfully handled
            }
            else if(item.getItemId()==1) { //check if the selected menu item ID is 1
                //code for action
                tvTranslatedText2.setText("addio");
                return true;  //menu item successfully handled
            }
            else if(item.getItemId()==2) { //check if the selected menu item ID is 1
                //code for action
                tvTranslatedText2.setText("au revoir");
                return true;  //menu item successfully handled
            }
            else if(item.getItemId()==3) { //check if the selected menu item ID is 1
                //code for action
                tvTranslatedText2.setText("???????????????");
                return true;  //menu item successfully handled
            }
            else if(item.getItemId()==4) { //check if the selected menu item ID is 1
                //code for action
                tvTranslatedText2.setText("??????");
                return true;  //menu item successfully handled
            }
            else if(item.getItemId()==5) { //check if the selected menu item ID is 1
                //code for action
                tvTranslatedText2.setText("??????");
                return true;  //menu item successfully handled
            }
        }else{
            if(item.getItemId()==0) { //check whether the selected menu item ID is 0
                //code for action
                tvTranslatedText3.setText("Hello");
                return true; //menu item successfully handled
            }
            else if(item.getItemId()==1) { //check if the selected menu item ID is 1
                //code for action
                tvTranslatedText3.setText("nulla");
                return true;  //menu item successfully handled
            }
            else if(item.getItemId()==2) { //check if the selected menu item ID is 1
                //code for action
                tvTranslatedText3.setText("n'importe quoi");
                return true;  //menu item successfully handled
            }
            else if(item.getItemId()==3) { //check if the selected menu item ID is 1
                //code for action
                tvTranslatedText3.setText("?????????");
                return true;  //menu item successfully handled
            }
            else if(item.getItemId()==4) { //check if the selected menu item ID is 1
                //code for action
                tvTranslatedText3.setText("????????????");
                return true;  //menu item successfully handled
            }
            else if(item.getItemId()==5) { //check if the selected menu item ID is 1
                //code for action
                tvTranslatedText3.setText("????????????");
                return true;  //menu item successfully handled
            }

        }
        return super.onContextItemSelected(item); //pass menu item to the superclass implementation
    }
}