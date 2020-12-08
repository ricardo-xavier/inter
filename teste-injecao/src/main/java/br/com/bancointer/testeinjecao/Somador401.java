package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador401")
public class Somador401 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
