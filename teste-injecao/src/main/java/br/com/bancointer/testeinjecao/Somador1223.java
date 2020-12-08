package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1223")
public class Somador1223 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
