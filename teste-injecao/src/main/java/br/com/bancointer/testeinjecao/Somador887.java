package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador887")
public class Somador887 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
