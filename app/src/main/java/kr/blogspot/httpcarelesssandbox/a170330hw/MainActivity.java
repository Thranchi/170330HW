package kr.blogspot.httpcarelesssandbox.a170330hw;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Button apple,kiwi,pear,grape;
    boolean applec,kiwic,pearc,grapec;
    LinearLayout l1,l2,l3,l4,l5,l6;
    TextView name,time,pasta,pizza,member,price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final databox databox=new databox();
        thisisit();

        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //true-손님 있음 false-없음
                if(applec){
                    apple.setText("Table [Apple] - Full");

                    l2.setVisibility(View.VISIBLE);
                    l3.setVisibility(View.VISIBLE);
                    l4.setVisibility(View.VISIBLE);
                    l5.setVisibility(View.VISIBLE);
                    l6.setVisibility(View.VISIBLE);

                    name.setText("Table [Apple]");
                    time.setText(heywhendidyougetinhear());
                    pasta.setText(databox.setpasta(1)+"");

                }
                else{
                    apple.setText("Table [Apple] - Empty");

                    l2.setVisibility(View.GONE);
                    l3.setVisibility(View.GONE);
                    l4.setVisibility(View.GONE);
                    l5.setVisibility(View.GONE);
                    l6.setVisibility(View.GONE);
                }
            }
        });

    }
    private void thisisit(){
        View fr=View.inflate(this, R.layout.frag, null);

        apple=(Button)fr.findViewById(R.id.apple);
        kiwi=(Button)fr.findViewById(R.id.kiwi);
        pear=(Button)fr.findViewById(R.id.pear);
        grape=(Button)fr.findViewById(R.id.grape);

        l1=(LinearLayout)findViewById(R.id.l1);
        l2=(LinearLayout)findViewById(R.id.l2);
        l3=(LinearLayout)findViewById(R.id.l3);
        l4=(LinearLayout)findViewById(R.id.l4);
        l5=(LinearLayout)findViewById(R.id.l5);
        l6=(LinearLayout)findViewById(R.id.l6);

        name=(TextView)findViewById(R.id.tablename);
        time=(TextView)findViewById(R.id.time);
        pasta=(TextView)findViewById(R.id.pasta);
        pizza=(TextView)findViewById(R.id.pizza);
        member=(TextView)findViewById(R.id.membership);
        price=(TextView)findViewById(R.id.price);
    }

    private String heywhendidyougetinhear(){
        long now = System.currentTimeMillis();
        Date date = new Date(now);
        SimpleDateFormat sdfNow = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return sdfNow.format(date);

    }
}
