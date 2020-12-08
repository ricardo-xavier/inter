package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador915")
public class Somador915 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
