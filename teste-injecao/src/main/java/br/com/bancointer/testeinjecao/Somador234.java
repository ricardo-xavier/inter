package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador234")
public class Somador234 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
