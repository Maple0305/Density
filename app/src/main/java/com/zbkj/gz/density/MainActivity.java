package com.zbkj.gz.density;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.zbkj.gz.density.R.id.et_dip;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tv_dip)
    TextView tvDip;
    @Bind(et_dip)
    EditText etDip;
    @Bind(R.id.tv_dp)
    TextView tvDp;
    @Bind(R.id.et_dp)
    EditText etDp;
    @Bind(R.id.btn_dip)
    Button btnDip;
    @Bind(R.id.btn_dp)
    Button btnDp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_dip, R.id.btn_dp})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_dip:
                float dip = DensityUtil.dq2px(this, Float.parseFloat(etDip.getText().toString()));
                tvDip.setText("dip转成为 px:           "+dip);
                break;
            case R.id.btn_dp:
                float dp = DensityUtil.px2dip(this, Float.parseFloat(etDp.getText().toString()));
                tvDp.setText("px转成为 dp:           "+dp);
                break;
        }
    }
}
