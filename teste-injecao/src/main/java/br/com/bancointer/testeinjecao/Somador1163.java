package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1163")
public class Somador1163 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
