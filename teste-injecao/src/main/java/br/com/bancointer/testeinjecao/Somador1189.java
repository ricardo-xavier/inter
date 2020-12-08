package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1189")
public class Somador1189 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
