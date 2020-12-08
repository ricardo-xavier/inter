package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1186")
public class Somador1186 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
