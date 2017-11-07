package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
String test = "<style>.single-line-mobile{position: relative; height: 100%; min-height: 375px; background: url('http://qaapp553cn.netcracker.com:6950/sitecore/banner-mobile.png'); background-size: cover; color: #ffffff;}.single-line-mobile__row{display: -webkit-box; display: -webkit-flex; display: -ms-flexbox; display: flex; text-align: center; -webkit-box-pack: center; -webkit-justify-content: center; -ms-flex-pack: center; justify-content: center;}.single-line-mobile__row._controls{margin: 3.4375rem 0 1.875rem;}.single-line-mobile__row._info{padding: 0.9375rem 1.25rem 0;}.single-line-mobile__row._header{padding-top: 3.125rem; font-family: Gotham-pro, Helvetica, Arial, sans-serif; font-weight: 500; font-style: normal; font-size: 1.5rem; text-transform: uppercase; text-align: center;}.single-line-mobile__section{position: absolute; left: 0; right: 0; bottom: 0; background-color: rgba(183, 18, 52, 0.8);}@media screen and (max-width: 767px){.single-line-mobile{min-height: 27.5rem;}}</style><div class=\"single-line-mobile\"><div class=\"single-line-mobile__section\"><div class=\"single-line-mobile__row _header\">Upgrade now</div><div class=\"single-line-mobile__row _info\">On Alaska's largest network</div><div class=\"single-line-mobile__row _controls\"><div class=\"single-line-mobile__control\"><button class=\"button jsButton _hover-light jsNav _light _size-s\" onclick=\"location.href='https://www.gci.com/';\" ><span class=\"button__text\">Learn more</span></button></div></div></div></div>";
        while (true){
            String n = bufferedReader.readLine();
            if (n.equalsIgnoreCase("сумма"))
                break;
            int s = Integer.parseInt(n);
            i = i + s;
        }
        System.out.println("Всего получилось: " + i);
    }
}
