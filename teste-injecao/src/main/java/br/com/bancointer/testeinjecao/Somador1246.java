package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1246")
public class Somador1246 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
