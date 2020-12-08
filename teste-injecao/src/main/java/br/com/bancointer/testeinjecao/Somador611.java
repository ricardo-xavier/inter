package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador611")
public class Somador611 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
