package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1944")
public class Somador1944 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
