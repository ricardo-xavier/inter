package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador861")
public class Somador861 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
