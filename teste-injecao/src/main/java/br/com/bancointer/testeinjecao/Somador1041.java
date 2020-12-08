package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1041")
public class Somador1041 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
