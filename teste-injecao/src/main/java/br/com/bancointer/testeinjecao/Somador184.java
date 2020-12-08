package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador184")
public class Somador184 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
