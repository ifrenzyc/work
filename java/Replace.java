import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Replace {

    public static void main(String[] args) {
        String sql = "Insert into TB_IM_GP_UP_ORDMSG (SEQ_ID, SRC_ORD_ID, SERV_CODE, CITY_ID, CREATE_DATE, HDL_FLAG, SEND_DATA) select sq_im_gp_seq.nextval, seq_id, 'dispatchTestNotifyReturn.SynReq', city_id, sysdate, 'N', '<methodInvoke xmlns=\"http://impl.server.pf.ws.bj.oss.ztesoft.com/\"><arg0>dispatchOrderReturn</arg0><arg1><![CDATA[<InterfaceMsg><DispatchOrderInfo><DispatchOrderBrief><DispatchOrderID>'||gp_order_id||'</DispatchOrderID><DispatchOrderNO>'||gp_order_no||'</DispatchOrderNO><CustOrderID>'||gp_custorder_id||'</CustOrderID><CustOrderNO>'||gp_custorder_no||'</CustOrderNO></DispatchOrderBrief><ProductItem><ProductItemID>'||gp_proditem_id||'</ProductItemID><ProdInstID>'||gp_prodinst_id||'</ProdInstID><PProductCode>GDC</PProductCode><PServiceOrderId>414633284939</PServiceOrderId><ProdInstID>2011111143466453</ProdInstID><StatusType>2011206001</StatusType><Status>2011207001</Status><WorkOrderId>'||gp_work_id||'</WorkOrderId><PsecialLine>PDC50478610G</PsecialLine><BcCode>'||uaccnbr||'</BcCode><SignState>2009072102</SignState><FinishRTNs></FinishRTNs><OperateInfo><OperatorID>-1</OperatorID><OperatorName>SYS</OperatorName><OrgID>1</OrgID><OrgName>广东省</OrgName><OperatorPhone/><OperateDate>'||sysdate||'</OperateDate><OperateRemark></OperateRemark><OperateLateReasonCode>:OperateLateReasonCode</OperateLateReasonCode><OperateLateReasonDesc>$OperateLateReasonDesc</OperateLateReasonDesc></OperateInfo><LocalResInfos><Res><ResName>简单路由</ResName><ResGroupCode>1002</ResGroupCode><ResProvinceCode>577</ResProvinceCode><ResValue>简单路由</ResValue></Res><Res><ResName>全程路由</ResName><ResGroupCode>1001</ResGroupCode><ResProvinceCode>666</ResProvinceCode><ResValue>全程路由</ResValue></Res></LocalResInfos></ProductItem><OtherInfo><Remark></Remark></OtherInfo></DispatchOrderInfo></InterfaceMsg>]]></arg1></methodInvoke>' send_data from tb_im_gp_disporder where seq_id = ${seqId}";

        //s"ql.replace("$OperateLateReasonCode", "233");

        Pattern p = Pattern.compile(":OperateLateReasonCode");
        Matcher m = p.matcher(sql);
        sql.replaceAll(":OperateLateReasonCode", "233");

        System.out.println(b);
    }

	
}
