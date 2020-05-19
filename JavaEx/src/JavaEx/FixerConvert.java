package JavaEx;
import JavaEx.FixerRate;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.BufferedReader;
import org.json.JSONObject;

	public class FixerConvert {
		public static String conversion(String date, String base) {
			BufferedReader br=null; //http://data.fixer.io/api/latest?access_key=
			String newUrls1="http://data.fixer.io/api/%s?access_key=bb703913353f88992f5fc9a75e32fe83&symbols=KRW,JPY,CNY,USD,EUR";
			String newUrls=String.format(newUrls1, date, base);
			URL url=null;
			StringBuffer sb=new StringBuffer();
			try {
				url=new URL(newUrls); //http://api.fixer.io
				System.out.println(newUrls);
				br=new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
				String msg="";
					// http://data.fixer.io/api를 읽어 들인다.
					while((msg=br.readLine())!=null) {
						sb.append(msg);
					}
			} catch (Exception e) {
				
			}
			return sb.toString();
		}
		
	public static FixerRate convert2(String data,String base) throws Exception{
		JSONObject jObject=new JSONObject(data);
		JSONObject rates=jObject.getJSONObject("rates");
		
		FixerRate fixerrate=new FixerRate();
		fixerrate.date=jObject.getString("date");
		fixerrate.base=base; //jObject.getString("base");
		if(base.equals("USD")) {
			double fixbase=rates.getDouble("USD");
			fixerrate.usd=rates.getDouble("USD")/fixbase;
			fixerrate.krw=rates.getDouble("KRW")/fixbase;
			fixerrate.jpy=rates.getDouble("JPY")/fixbase;
			fixerrate.eur=rates.getDouble("EUR")/fixbase;
			fixerrate.cny=rates.getDouble("CNY")/fixbase;
		} else if(base.contentEquals("KRW")) {
			double fixbase=rates.getDouble("KRW");
			fixerrate.usd=rates.getDouble("USD")/fixbase;
			fixerrate.krw=rates.getDouble("KRW")/fixbase;
			fixerrate.jpy=rates.getDouble("JPY")/fixbase;
			fixerrate.eur=rates.getDouble("EUR")/fixbase;
			fixerrate.cny=rates.getDouble("CNY")/fixbase;	
		} else if(base.contentEquals("JPY")) {
			double fixbase=rates.getDouble("JPY");
			fixerrate.usd=rates.getDouble("USD")/fixbase;
			fixerrate.krw=rates.getDouble("KRW")/fixbase;
			fixerrate.jpy=rates.getDouble("JPY")/fixbase;
			fixerrate.eur=rates.getDouble("EUR")/fixbase;
			fixerrate.cny=rates.getDouble("CNY")/fixbase;	
		} else if(base.contentEquals("EUR")) {
			double fixbase=rates.getDouble("EUR");
			fixerrate.usd=rates.getDouble("USD")/fixbase;
			fixerrate.krw=rates.getDouble("KRW")/fixbase;
			fixerrate.jpy=rates.getDouble("JPY")/fixbase;
			fixerrate.eur=rates.getDouble("EUR")/fixbase;
			fixerrate.cny=rates.getDouble("CNY")/fixbase;	
		} else if(base.contentEquals("CNY")) {
			double fixbase=rates.getDouble("CNY");
			fixerrate.usd=rates.getDouble("USD")/fixbase;
			fixerrate.krw=rates.getDouble("KRW")/fixbase;
			fixerrate.jpy=rates.getDouble("JPY")/fixbase;
			fixerrate.eur=rates.getDouble("EUR")/fixbase;
			fixerrate.cny=rates.getDouble("CNY")/fixbase;	
		}
		return fixerrate;
	}
	
	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal=Calendar.getInstance();
		//String date="2018-04-11";
		String date=sdf.format(cal.getTime()); //오늘
		String base="USD";
		String fixerrate=FixerConvert.conversion(date,  base);
			try {
				FixerRate frate=convert2(fixerrate,base);
				System.out.println(frate);
				System.out.println("KRW: "+frate.krw);
				System.out.println("CNY: "+frate.cny);
				//JPY
				fixerrate=conversion(date,"JPY");
				frate=convert2(fixerrate,"JPY");
				System.out.println(frate);
				System.out.println(frate.krw);
			} catch (Exception e) {
				System.out.println(e);
			}
		System.out.println(fixerrate);
		String base2="JPY";
		String fixerrate2=FixerConvert.conversion(date, base2);
		System.out.println(fixerrate2);
		String base3="CNY";
		String fixerrate3=FixerConvert.conversion(date, base3);
		System.out.println(fixerrate3);
	}
}