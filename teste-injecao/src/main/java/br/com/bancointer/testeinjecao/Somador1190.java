package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1190")
public class Somador1190 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
