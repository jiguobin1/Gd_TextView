package jiguobin.example.com.gd_textview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.chaychan.viewlib.ExpandableLinearLayout;
import com.chaychan.viewlib.NumberRunningTextView;

public class MainActivity extends AppCompatActivity {

    private NumberRunningTextView tv_money,tv_num;
    private ExpandableLinearLayout ellProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_money = (NumberRunningTextView) findViewById(R.id.tv_money);
        tv_num = (NumberRunningTextView) findViewById(R.id.tv_num);
        tv_money.setContent("1354.00");
        tv_num.setContent("200");
        ellProduct = (ExpandableLinearLayout) findViewById(R.id.ell_product);
        ellProduct.removeAllViews();//清除所有的子View（避免重新刷新数据时重复添加）

        }
    }

