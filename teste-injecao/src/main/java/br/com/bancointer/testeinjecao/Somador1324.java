package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1324")
public class Somador1324 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
